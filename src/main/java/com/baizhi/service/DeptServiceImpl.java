package com.baizhi.service;

import com.baizhi.entity.Dept;
import com.baizhi.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptMapper deptMapper;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Dept> queryAll() {
        return deptMapper.selectAll();
    }
}
