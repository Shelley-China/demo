package src.test.java.com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

public class LaTest {
    private static final Logger logger = LoggerFactory.getLogger(LaTest.class);

    @Test
    public void test(String[] args) throws Exception {
        methodA();
    }

    @Transactional(rollbackFor = {Exception.class})
    public void methodA() throws Exception{
        //try{
        //    int i = 10/0;
        //
        //}catch (Exception e) {
        //    e.printStackTrace();
        //    //TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        //    //throw e;
        //}
        methodB();
    }

    @Async
    public void methodB() throws Exception{
        throw new Exception();
    }

}