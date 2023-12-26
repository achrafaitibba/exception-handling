package com.achrafaitibba.exceptionhandling.controller;

import com.achrafaitibba.exceptionhandling.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @PostMapping("/{name}")
    public String testA(@PathVariable String name){
        return testService.testException_(name);
    }

}
