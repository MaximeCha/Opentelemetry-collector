package com.val.mch.opentelemetry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "test")
    public String testController()
    {
        return "coucou";
    }
}
