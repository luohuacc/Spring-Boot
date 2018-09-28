package com.helpme.jpa.services;

import com.helpme.jpa.entity.Emp;
import com.helpme.jpa.mapper.EmpMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpService {
    @Resource
    private EmpMapper empMapper = null;

    public Emp findById(Integer empno){
        return   empMapper.findById(empno);
    }


    public List<Emp> all(){
        return empMapper.all();
    }

    public List<Map> findDepts(String dname, Float sal){
        Map param = new HashMap();
        param.put("pdname",dname);
        param.put("psal",sal);
        return empMapper.findDepts(param);
    }


    public void create(Emp emp){
        empMapper.create(emp);
    }


    public void update(Emp emp){
        empMapper.update(emp);
    }

    public void delete(Integer empno){
        empMapper.delete(empno);
    }



}
