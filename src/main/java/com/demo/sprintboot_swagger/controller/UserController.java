package com.demo.sprintboot_swagger.controller;

import com.demo.sprintboot_swagger.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/api", description = "swagger示例接口", tags = "example")
@RestController
@RequestMapping(value = "/api", produces = {"application/json"})

public class UserController {
    @ApiOperation("通过userId搜索User")
    @GetMapping("/query/{userId}")
    public User query(@PathVariable Long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setName("张三");
        return user;
    }

}
