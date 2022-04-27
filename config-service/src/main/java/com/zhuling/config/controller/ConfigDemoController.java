package com.zhuling.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ConfigDemoController {
    @GetMapping("config")
    public String configDemo() {
        return "ok";
    }
}
