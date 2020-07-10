package com.cheng.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiJinCheng
 * @Date 2020/7/10 9:08 上午
 * @Version 1.0
 * @package com.cheng.control
 **/
@RestController
public class Test {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
