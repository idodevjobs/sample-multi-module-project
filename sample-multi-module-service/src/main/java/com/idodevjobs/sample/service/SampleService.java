package com.idodevjobs.sample.service;

import com.idodevjobs.sample.model.SampleResponse;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public SampleResponse sayHello(String message) {
        return new SampleResponse("hello " + message, "SUCCESS");
    }
}