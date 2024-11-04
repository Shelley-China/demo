package com.example.demo.controller;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson2.util.UUIDUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.enums.SqlKeyword;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.sql.StringEscape;
import com.example.demo.constant.AddressTypeEnum;
import com.example.demo.constant.ElementTypeEnum;
import com.example.demo.dto.*;
import com.example.demo.model.OmsSoSubsequentDocumentPo;
import com.example.demo.model.Student;
import com.example.demo.model.Student1;
import com.example.demo.util.*;
import com.example.demo.vo.UpSellSearchVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;


import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.Async;

import javax.swing.text.html.Option;

import static java.math.BigDecimal.ROUND_DOWN;

@Slf4j
public class LaTest {

    private static final Logger logger = LoggerFactory.getLogger(LaTest.class);

    private static final ArrayList<String> filterItemCategory = new ArrayList<String>() {{
        add("YW0J");
        add("YW40");
        add("YW19");
    }};
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public static void main(String[] args) throws Exception {
        JSONObject dataJsonObj = new JSONObject();
        String nextPageToken = dataJsonObj.getString("nextPageToken");
        System.out.println(nextPageToken);
    }

    public static boolean isDateValid(String date) {
        return parse(date, DATE_FORMAT) != null;
    }

    public static Date parse(String date, String pattern) {
        try {
            return DateUtils.parseDate(date,pattern);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}




























        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
