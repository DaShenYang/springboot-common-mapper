package com.baizhi.controller;

import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping(value = "/queryAll"/*,produces = "application/json;charset=UTF-8"*/)

    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}
