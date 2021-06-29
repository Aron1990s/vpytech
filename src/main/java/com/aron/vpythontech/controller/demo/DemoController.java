package com.aron.vpythontech.controller.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author aron
 * @Date 2021/6/29 23:04
 **/
@Controller
@RequestMapping("demo")
public class DemoController {

    protected final static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("demo")
    public ModelAndView demo(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("demo/dashboard");
        return mv;
    }

}
