package org.expdev.sample.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public String currentDateString() {
        StringBuffer sb = new StringBuffer();
        sb.append("a");		 // avoid this
        return sb.toString();
    }

    public Boolean isThisTrue(String value) {
        String test = "45";
        if (StringUtils.isEmpty(value)) {
            return false;
        } else {
            return true;
        }
    }
}
