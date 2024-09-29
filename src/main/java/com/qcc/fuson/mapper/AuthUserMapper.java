package com.qcc.fuson.mapper;

import com.qcc.fuson.dto.AuthUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AuthUserMapper {

    @Select("SELECT * FROM auth_user WHERE ID = #{id}")
    AuthUser getUserById(String id);

    @Insert("INSERT INTO auth_user (ID, AREA_CODE, USER_ID, USER_NAME, NICK_NAME, PHONE_PREFIX, USER_PHONE, UPDATE_TIME, USER_TYPE, EMAIL, GENDER, BRANCH_CODE, VERIFIED_METHOD, ACTIVE_FLAG, CREATE_BY, CREATE_TIME, VERSION, DEL_FLAG, BECOME_A_MEMBER, JUMP_BOOKING, REMARKS) VALUES (#{id}, #{areaCode}, #{userId}, #{userName}, #{nickName}, #{phonePrefix}, #{userPhone}, #{updateTime}, #{userType}, #{email}, #{gender}, #{branchCode}, #{verifiedMethod}, #{activeFlag}, #{createBy}, #{createTime}, #{version}, #{delFlag}, #{becomeAMember}, #{jumpBooking}, #{remarks})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser(AuthUser user);

    @Update("UPDATE auth_user SET AREA_CODE = #{areaCode}, USER_ID = #{userId}, USER_NAME = #{userName}, NICK_NAME = #{nickName}, PHONE_PREFIX = #{phonePrefix}, USER_PHONE = #{userPhone}, UPDATE_TIME = #{updateTime}, USER_TYPE = #{userType}, EMAIL = #{email}, GENDER = #{gender}, BRANCH_CODE = #{branchCode}, VERIFIED_METHOD = #{verifiedMethod}, ACTIVE_FLAG = #{activeFlag}, CREATE_BY = #{createBy}, CREATE_TIME = #{createTime}, VERSION = #{version}, DEL_FLAG = #{delFlag}, BECOME_A_MEMBER = #{becomeAMember}, JUMP_BOOKING = #{jumpBooking}, REMARKS = #{remarks} WHERE ID = #{id}")
    int updateUser(AuthUser user);

    @Delete("DELETE FROM auth_user WHERE ID = #{id}")
    int deleteUserById(String id);

    @Select("SELECT * FROM auth_user")
    List<AuthUser> getAllUsers();
}
