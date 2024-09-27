package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
//    @ResponseBody
    public String hello(Model model) {
    	model.addAttribute("name","Hello, Thymeleaf");
    	model.addAttribute("message","Hong GilDong");
    	//모델 message => 뷰템플릿
        return "hello";
    }
    
}
