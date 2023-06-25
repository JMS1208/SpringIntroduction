package com.example.springintroduction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    /*
    Model은 스프링이 주입시켜줌
     */
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");

        /*
        아래 리턴값이 뷰 이름을 리턴한건데
        hello.html 을 반환시켜준 것임
        viewResolver 가 resources/templates 에서 hello 화면을 찾음
         */
        return "hello";
    }
}
