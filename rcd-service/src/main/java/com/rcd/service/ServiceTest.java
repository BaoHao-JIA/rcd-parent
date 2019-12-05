package com.rcd.service;

import com.rcd.mapper.MapperTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceTest {


    @Autowired
    private MapperTest test;

    public String showMapper(){

        return test.test1()+"I am service";
    }
}
