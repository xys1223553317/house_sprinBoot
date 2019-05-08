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
    private Integer rent;
    private Integer cash;
    private Integer zxvacancy;
    private Integer rentholiday;
    private String fzzhifu;
    private Integer sbiaonumber;
    private Integer dbiaonumber;
    private Integer qbiaonumber;
    private String propertyfee;
    private String contractway;
}
