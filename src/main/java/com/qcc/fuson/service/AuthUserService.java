package com.qcc.fuson.service;

import com.qcc.fuson.dto.AuthUser;

public interface AuthUserService {

    AuthUser findUserByUsername(String username);
}
