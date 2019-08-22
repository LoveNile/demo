package com.kc.febs.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LoginController {

    private final static Logger log = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login/{businessURL}")
    public String login(@PathVariable String businessURL) {

        return "";
    }

}
