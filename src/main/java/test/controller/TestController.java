package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import test.dto.Service;
import test.service.ServiceServiceImpl;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private ServiceServiceImpl serviceService;

    @RequestMapping(value = "/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Main Page");

        try{
            List<Service> sList = serviceService.findAll();
            mav.addObject("list", sList);
        }catch (Exception e){
            mav.addObject("err",e);
        }

        mav.setViewName("Main");
        return mav;
    }

    @PostMapping("/input")
    public String input(Service service) {
        if(serviceService.input(service)==1) {
            return "redirect:/";
        }else{
            return "redirect:home";
        }
    }

    @PutMapping("/edit")
    public String edit(@RequestParam("id") int id){
        return "redirect:/";
    }
}
