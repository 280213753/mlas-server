package com.qcc.fuson.controller;

import com.qcc.fuson.dto.AuthUser;
import com.qcc.fuson.service.AuthUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthUserController {

    @Resource
    private AuthUserService authService;

    /**
     * 查询 AuthUser 的接口
     *
     * @param id 用户id
     * @return 查询到的 AuthUser 对象
     */
    @GetMapping("/users")
    public AuthUser getUserByUsername(@RequestParam("username") String id) {
        return authService.findUserByUsername(id);
    }

    @GetMapping("/")
    public String heathCheck() {
        return "ok";
    }
}
