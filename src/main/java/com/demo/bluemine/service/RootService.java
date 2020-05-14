package com.demo.bluemine.service;


import com.demo.bluemine.mapper.RootMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("com.demo.bluemine.service")
public class RootService {
	@Resource(name = "com.demo.bluemine.mapper.RootMapper")
    RootMapper mapper;

    public String test(){
        return mapper.test();
    }


}

