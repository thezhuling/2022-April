package com.zhuling.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosController {
    @GetMapping("provider/{id}")
    public String test(@PathVariable("id") String id) {
        return "provider" + id;
    }
}
