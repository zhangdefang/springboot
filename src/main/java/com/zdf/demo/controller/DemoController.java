package com.zdf.demo.controller;

import com.zdf.demo.common.JsonResult;
import com.zdf.demo.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dpc")
public class DemoController {
 
 
    @GetMapping("/api/hello")
    public JsonResult test() {
        return JsonResult.ok("查询成功").data(new Person(2.22,3.44,4.55,44));
    }
}