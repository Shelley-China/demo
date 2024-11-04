package com.example.demo.runner;

import cn.hutool.extra.spring.SpringUtil;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.support.TransactionTemplate;

//@Component
public class TestApplicationRunner implements ApplicationRunner {
    //
    //@Autowired
    //StudentService studentService;
    @Autowired
    TransactionTemplate transactionTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        methodA();
    }

    private void methodA() {
        try {
            Test02Consumer anInterface = new Test02Consumer() {
                @Override
                public void handleDelivery() {
                    transactionTemplate.executeWithoutResult(status -> {
                        try {
                            methodB();
                        } catch (Exception e) {
                            e.printStackTrace();
                            status.setRollbackOnly();
                        }
                    });
                }
            };
            anInterface.handleDelivery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void methodB() throws Exception {
        try {
            Student student = new Student();
            student.setId("3");
            student.setName("zhangsan");
            student.setAge(10);
            student.setDiscribe("zhangsan");
            //studentService.insert(student);
            int i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
