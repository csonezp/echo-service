package com.csonezp.cloud.echoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhangpeng
 * @date : 2019/12/28 12:39
 */
@RestController
public class KeepAliveController {

    @GetMapping("/keepalive")
    public String keepalive(){
        return "ok";
    }
}
