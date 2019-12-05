package com.rcd.controller;

import com.rcd.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class ConTest {

    @Autowired
    private ServiceTest serviceTest;

    @RequestMapping("testAll")
    public String testAll(){
        return serviceTest.showMapper()+"I am web";
    }
}
