package com.yautumn.common.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userSex;

    private Date userBirthday;

}