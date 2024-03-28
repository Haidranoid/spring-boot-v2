package com.in28minutes.springboot.myfirstwebapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
    // say-hello =< "Hello! what are you learning today?"
    private Logger logger = LoggerFactory.getLogger(SayHelloController.class);

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(@RequestParam String name, ModelMap modelMap) {

        logger.info("Request param is {}", name);

        modelMap.put("name", name);

        return "sayHello";
    }
}
