package com.itheima.springbootssm.entity;

import lombok.Data;

import java.util.Date;
@Data
public class User {

        // 主键
//    @TableId
        private int id;
        private String username;
        private String password;
        private int age;
        private Date updateTime;
}
