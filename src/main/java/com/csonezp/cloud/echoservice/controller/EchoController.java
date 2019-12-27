package com.csonezp.cloud.echoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhangpeng
 * @date : 2019/12/27 14:57
 */
@RestController
public class EchoController {

    @GetMapping("/echo")
    public String echo(@RequestParam(required = false,defaultValue = "Hello World!") String data){
        return data;
    }
}
