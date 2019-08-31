package com.example.demo111.controller;

import com.example.demo111.utils.ToolsBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
public class TestController<auto> {
  /*  @Value("${file.path}")
    private String filePath;*/

    ToolsBean toolsBean;

    @RequestMapping("hello")
    public Object hello() {
        return "hello";
    }
}
