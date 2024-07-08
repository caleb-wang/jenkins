package com.jenkins.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-07-08 21:15
 */
@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @GetMapping("/example")
    public String example() {
        return "hello jenkins!###  v2.0.0";
    }
}
