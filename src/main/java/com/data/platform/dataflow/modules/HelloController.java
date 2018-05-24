package com.data.platform.dataflow.modules;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 刘明
 * @Description:
 * @Date: Created in 5:27 PM 24/05/2018
 * Modified by:
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello,World";
    }
}
