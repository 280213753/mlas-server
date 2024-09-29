package com.qcc.fuson.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AuthUser {
    private String id;
    private String areaCode;
    private String userId;
    private String userName;
    private String nickName;
    private String phonePrefix;
    private String userPhone;
    private Date updateTime;
    private String userType;
    private String email;
    private String gender;
    private String branchCode;
    private String verifiedMethod;
    private String activeFlag;
    private String createBy;
    private Date createTime;
    private Long version;
    private String delFlag;
    private String becomeAMember;
    private String jumpBooking;
    private String remarks;
}
