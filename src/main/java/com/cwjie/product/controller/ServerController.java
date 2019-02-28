package com.cwjie.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: order
 * @description: 服务调用控制器
 * @author: chenweijie
 * @create: 2019-02-28 21:50
 **/
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is a product msg";
    }
}
