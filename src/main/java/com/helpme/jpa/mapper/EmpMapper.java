package com.helpme.jpa.mapper;

import com.helpme.jpa.entity.Emp;


import java.util.List;
import java.util.Map;

public interface EmpMapper {
    public Emp findById(Integer empno);
    public List<Map> findDepts(Map param);
    public void create(Emp emp);
    public void update(Emp emp);
    public void delete(Integer empno);
    public List<Emp> all();
}
