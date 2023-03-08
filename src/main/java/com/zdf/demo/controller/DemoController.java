package com.zdf.demo.controller;

import com.zdf.demo.common.JsonResult;
import com.zdf.demo.entity.Person;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dpc/api")
public class DemoController {
 
 
    @GetMapping("/hello")
    public JsonResult test() {
        return JsonResult.ok("查询成功").data(new Person(2.22,3.44,4.55,44));
    }

    @PostMapping("/logo")
    public JsonResult logo(@RequestBody User summit){
        if(!StringUtils.isEmpty(summit.getUsername()) ){
            return JsonResult.ok("登录成功").data(true);
        }
        return JsonResult.ok("登录失败").data(false);
    }
}