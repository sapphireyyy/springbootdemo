package com.vgc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yyang3 on 2018/7/11.
 */
@Controller
public class SbdController {
    @RequestMapping("/say.html")
    public @ResponseBody String say() {
        return "Hello World!";
    }
}
