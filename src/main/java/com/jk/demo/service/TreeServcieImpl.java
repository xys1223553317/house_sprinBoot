package com.jk.demo.service;


import com.alibaba.dubbo.config.annotation.Reference;

import com.jk.demo.pojo.NavBean;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TreeServcieImpl implements TreeServcie {
    @Reference
    private TreeService1 treeService1;


    @Override
    public List<NavBean> queryNav() {
        return treeService1.queryNav();
    }
}
