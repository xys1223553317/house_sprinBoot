package com.jk.demo.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class NavBean implements Serializable {
    private Integer id;

    private String text;

    private String href;

    private Integer pid;

    private List<NavBean> nodes;

    private Boolean seletetable;
}
