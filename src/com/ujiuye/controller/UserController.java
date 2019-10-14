package com.ujiuye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/demo")
    public ModelAndView demo(){
        //调用service
        System.out.println("yredsssssss>>>>>>>>>>>>>>>>>>>>>>>>");
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","tomer");
        mv.addObject("age","19");
        mv.setViewName("demo");
        return mv;
    }
}
