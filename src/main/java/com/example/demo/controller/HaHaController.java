package com.example.demo.controller;


import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
import com.example.demo.util.ToolUtil;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("LanguageDetectionInspection")
@RestController
@RequestMapping("/testController")
@EnableAspectJAutoProxy(exposeProxy = true)
public class HaHaController {

    //@Autowired
    //StudentService studentService;
    //@Autowired
    //TeacherService teacherService;

    //只要最开始调用的是代理后的类，事务就会生效(就算methodA和methodB都没有加@Transactional也会生效)。
    //要想最开始调用的是代理后的类，有两种方式：
    // 一种是@EnableTransactionManagement + @Transactional(rollbackFor = Exception.class)组合
    // 一种是@EnableTransactionManagement + @EnableAspectJAutoProxy(exposeProxy = true) + ((LizhongController)AopContext.currentProxy()).methodA() +@Transactional(rollbackFor = Exception.class)的组合

    //@PostMapping("/hello")
    //@Transactional(rollbackFor = Exception.class)
    //public Object hello(@RequestParam Set<String> soNoSet) {
    //    soNoSet.stream().forEach(e->{
    //        System.out.println(e);
    //    });
    //    return ResponseVo.success();
    //}

    //@Transactional(rollbackFor = Exception.class)
    public void methodA() {
        methodB();
        //Student student = Student.builder().id("1").name("zhangsan").age(10).build();
        //studentService.insert(student);
        //((LizhongController) AopContext.currentProxy()).methodB();
    }

    //@Transactional(rollbackFor = Exception.class)
    public void methodB() {
        //Teacher teacher = Teacher.builder().id("1").name("lisi").className("english").build();
        //int a = 10 / 0;
        //teacherService.insert(teacher);
        //this.methodC();
    }


    @RequestMapping(value = "/receiveJsonMessage", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void receiveJsonMessage(@RequestBody JSONObject jsonObject) throws JSONException {
        JSONObject header = jsonObject.getJSONObject("header");
        JSONObject generaldata = header.getJSONObject("generaldata");
        String serviceorder = generaldata.getString("serviceorder");

        System.out.println(serviceorder);
    }

    @RequestMapping(value = "/testMultipartFile", method = RequestMethod.POST)
    public void testMultipartFile(@RequestParam("filePath") String filePath, @RequestParam("files") MultipartFile files) {
        String originalFilename = files.getOriginalFilename();
        System.out.println(originalFilename);

    }

    @RequestMapping("/re-consumption")
    public void reConsumption(@RequestBody(required = false) Map<String, Object> jsonObject) throws Exception {
        //Map<String, String> header = JacksonUtil.string2Obj(JacksonUtil.obj2String(jsonObject.get("header")), Map.class);
        //List<Map<String, String>> textList = JacksonUtil.string2Obj(JacksonUtil.obj2String(jsonObject.get("texts")), List.class);
        //textList = textList.stream().filter(e -> ToolUtil.equals("YS10", e.get("textId")) && ToolUtil.isNotEmpty(e.get("textLine")))
        //        .collect(Collectors.toList());
        //pspdOrderHandler.handleOrder(jsonObject, header, textList);
        System.out.println();
    }


    public static void main(String[] args) {

    }


    public static byte[] getBytes(char[] chars) {
        Charset cs = Charset.forName("GBK");
        CharBuffer cb = CharBuffer.allocate(chars.length);
        cb.put(chars);
        cb.flip();
        ByteBuffer bb = cs.encode(cb);
        return bb.array();
    }
}