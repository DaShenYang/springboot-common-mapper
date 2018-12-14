package com.baizhi;

import com.baizhi.entity.Dept;
import com.baizhi.mapper.DeptMapper;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {


    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void queryAll() {
        List<Dept> list = deptMapper.selectAll();
        System.out.println(list);

    }

    @Test
    public void queryOne() {
        //Dept dept = deptMapper.selectByPrimaryKey(1);
        List<Dept> depts = deptMapper.select(new Dept(1, "美妆", null));
        for (Dept dept : depts) {
            System.out.println(dept);
        }


    }


    @Test
    public void insert() {
        deptMapper.insert(new Dept(null, "美颜", 20));
    }


    @Test
    public void update() {
        //deptMapper.updateByPrimaryKey(new Dept(22,"美容",20));
        deptMapper.updateByPrimaryKeySelective(new Dept(1, null, 20));

    }


    @Test
    public void delete() {
        deptMapper.deleteByPrimaryKey(22);
    }


    @Test
    public void limit(){
        Dept dept = new Dept(1,null,null);
        RowBounds rowBounds = new RowBounds(0, 2);
        List<Dept> depts = deptMapper.selectByRowBounds(dept, rowBounds);
        for (Dept dept1 : depts) {
            System.out.println(dept1);
        }
    }

    //用DeptExample可以做复杂查询

}
