package com.helpme.jpa.controller;

import com.helpme.jpa.entity.Emp;
import com.helpme.jpa.services.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {
    @Resource
    private EmpService empService = null;


 /*   @RequestMapping("/emp/list")
    public List<Map> findDepts(String dname, Float sal){
        List<Map> list = empService.findDepts(dname , sal );
        return list;
    }*/


    /**
     * 列表数据
     * @return
     */
    @RequestMapping("/")
    public ModelAndView all(){
        List<Emp> emps = empService.all();
        ModelAndView mav = new ModelAndView("index");

        mav.addObject("emps",emps);
        return mav;
    }

    /**
     * 详情页
     * @param empno 员工编号
     * @return
     */
    @RequestMapping(value = "/emp/{empno}",method = RequestMethod.GET)
    public ModelAndView findById(@PathVariable("empno") Integer empno){
        Emp empinfo = empService.findById(empno);
        ModelAndView mav = new ModelAndView("info");
        mav.addObject("emp",empinfo);
        return mav;
    }

    /**
     * 显示页
     * @return String
     */
    @RequestMapping("/emp/create")
    public String create(){
       return "create";
    }

    /**
     * 表单提交的方法
     * @param emp
     * @return
     */
    @RequestMapping(value = "/emp/doCreate",method = RequestMethod.POST)
    public ModelAndView doCreate(Emp emp){
        ModelAndView mav = new ModelAndView("index");
        empService.create(emp);
        List<Emp> list = empService.all();
        mav.addObject("emps",list);
        return mav;
    }

    @RequestMapping(value = "/emp/update/{id}",method = RequestMethod.GET)
    public ModelAndView update(@PathVariable("id") Integer id){
        Emp empinfo = empService.findById(id);
        ModelAndView mav = new ModelAndView("update");
        mav.addObject("emp",empinfo);
        return mav;
    }

    /**
     * 修改处理方法
     * @param emp
     * @return
     */
    @RequestMapping(value = "/emp/doUpdate",method = RequestMethod.POST)
    public ModelAndView doUpdate(Emp emp){
        ModelAndView mav = new ModelAndView("index");
        empService.update(emp);
        List<Emp> list = empService.all();
        mav.addObject("emps",list);
        return mav;
    }

    /**
     * 删除一条记录
     * @param id
     * @return
     */
    @RequestMapping("/emp/delete/{id}")
    @ResponseBody
    public int  delete(@PathVariable("id") Integer id){
        empService.delete(id);
        return id;
    }


}
