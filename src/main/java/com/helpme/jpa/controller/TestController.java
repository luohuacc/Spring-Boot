package com.helpme.jpa.controller;

import com.helpme.jpa.entity.Emp;
import com.helpme.jpa.services.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Resource
    private EmpService empService = null;

    /*@RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("name","罗华");
        return "test";
    }*/



}
