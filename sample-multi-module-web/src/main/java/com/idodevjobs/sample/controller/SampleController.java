package com.idodevjobs.sample.controller;

import com.idodevjobs.sample.model.SampleResponse;
import com.idodevjobs.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/hello/{message}", method = RequestMethod.GET)
    public @ResponseBody SampleResponse sayHello(@PathVariable String message) {
        return sampleService.sayHello(message);
    }
}
