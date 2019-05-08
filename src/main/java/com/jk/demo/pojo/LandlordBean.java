package com.jk.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class LandlordBean {
    private Integer id;
    private String name;
    private String url;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date starttime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date endtime;
    private Integer status;
    private Integer phone;
    private Integer identity;
    private Integer phones;
    private String urgencyphone;
    private Integer fymji;
    private String fyhxing;
    private String fyzk;
}