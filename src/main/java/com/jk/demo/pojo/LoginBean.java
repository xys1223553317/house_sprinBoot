package com.jk.demo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginBean implements Serializable {

    private Integer id;

    private String account;

    private String password;


}
