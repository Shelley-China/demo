package com.example.demo.util;

import cn.hutool.core.lang.Assert;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitStringByByteLengh {

    public static void main(String[] args) throws Exception {
        String[] addrArray = new String[2];
        addrArray[0] = "丸八倉庫　高橋２号(2)倉庫２Ｆ(2)高橋２号 倉庫２Ｆ";
        //addrArray[0] = "RASHI PERIPHERALS PVT LTD               ";
        //addrArray[0] = "(株)大塚商";
        //System.out.println(addrArray[0].length());
        System.out.println(addrArray[0].getBytes("GBK").length);
        addrArray[1] = "倉庫２Ｆ";

        List<String> reformatedNames = stringPartition(addrArray, 35, 2, "");
        System.out.println(reformatedNames.get(0));
        System.out.println(reformatedNames.get(1));

    }

    @SneakyThrows
    public static List<String> stringPartition(String[] strArray, int length, int maxSize, String defaultStr) {
        List<String> needSplit = Arrays.stream(strArray).filter(e -> {
            try {
                if (e.getBytes("GBK").length > length) return true;
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            return false;
        }).collect(Collectors.toList());
        if (ToolUtil.isEmpty(needSplit)) {
            List<String> noNeedSplitList = new ArrayList<>();
            for (int i = 0; i < maxSize; i++) {
                noNeedSplitList.add(strArray[i]);
            }
            return noNeedSplitList;
        } else {
            List<String> needSplitList = new ArrayList<>();
            String str = StringUtils.join(strArray, "");
            //参数校验
            Assert.isTrue(length > 0);
            for (int i = 0; i < maxSize; i++) {
                char[] charArray = str.toCharArray();
                StringBuffer sb = new StringBuffer();
                int tempLength = 0;
                int end = Math.min(length, str.getBytes("GBK").length);
                for (int j = 0; j < end; j++) {
                    String aStr = String.valueOf(charArray[j]);
                    byte[] byteArray = aStr.getBytes("GBK");
                    tempLength = tempLength + byteArray.length;
                    if (tempLength > end) {
                        needSplitList.add(sb.toString());
                        str = str.substring(sb.length());
                        break;
                    } else if (tempLength == end) {
                        sb.append(aStr);
                        needSplitList.add(sb.toString());
                        str = str.substring(sb.length());
                        break;
                    } else {
                        sb.append(aStr);
                    }
                }
            }
            //返回
            if (0 < maxSize) {
                if (needSplitList.size() < maxSize) {//不足补充
                    int reduce = maxSize - needSplitList.size();
                    for (int i = 0; i < reduce; i++) {
                        needSplitList.add(defaultStr);
                    }
                } else if (needSplitList.size() > maxSize) {//超出截取
                    needSplitList = needSplitList.stream().limit(maxSize).collect(Collectors.toList());
                }
            }
            return needSplitList;
        }
    }
}
