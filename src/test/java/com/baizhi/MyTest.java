package com.baizhi;

import com.baizhi.service.DeptService;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j
public class MyTest {
    @Autowired
    private DeptService deptService;
    @Test
    public void select(){
        log.info("service层的测试！");
        System.out.println(deptService.queryAll());
    }
}
