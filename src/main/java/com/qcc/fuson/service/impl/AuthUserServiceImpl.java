package com.qcc.fuson.service.impl;

import com.qcc.fuson.dto.AuthUser;
import com.qcc.fuson.mapper.AuthUserMapper;
import com.qcc.fuson.service.AuthUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AuthUserServiceImpl implements AuthUserService {

    @Resource
    private AuthUserMapper authUserMapper;
    @Override
    public AuthUser findUserByUsername(String id) {
        return authUserMapper.getUserById(id);
    }
}
