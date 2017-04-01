package com.zgf.springboot.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zgf on 17/4/1.
 */
@Controller
@EnableAutoConfiguration
public class ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public String home() {
        return "404";
    }
    
}