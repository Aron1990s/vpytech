package com.aron.vpythontech.controller.tech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName TechController
 * @Description TODO
 * @Author aron
 * @Date 2021/6/30 15:53
 **/
@Controller
@RequestMapping("techCtl")
public class TechController {

    protected final static Logger logger = LoggerFactory.getLogger(TechController.class);

    @RequestMapping("techMain")
    public ModelAndView demo(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("tech/techMain");
        return mv;
    }

}
