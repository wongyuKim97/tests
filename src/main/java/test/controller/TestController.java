package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping(value = "/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "hello");
        mav.setViewName("hello");
        return mav;
    }
}
