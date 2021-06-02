package com.community.jxnu.jxnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
