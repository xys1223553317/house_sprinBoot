package com.jk.demo.pojo;

public class Tenant {

    private Integer id;
    private String name;
    private String url;
    private String fhao;
    private String starttime;
    private String endtime;
    private Integer status;

    private Integer money;//账单金额
    private Integer sfmoney;//实付金额

    private Integer zdtype;
    private String zdname;

    private String beizhu;//备注

    private String fhname;
    private String zkname;

    private  Integer zjtype;//资金类型
    private  String zjname;

    private  Integer zftype;//支付类型
    private  String zfname;

    private  Integer fhorfkf;

    public Integer getFhorfkf() {
        return fhorfkf;
    }

    public void setFhorfkf(Integer fhorfkf) {
        this.fhorfkf = fhorfkf;
    }

    public Integer getSfmoney() {
        return sfmoney;
    }

    public void setSfmoney(Integer sfmoney) {
        this.sfmoney = sfmoney;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public Integer getZjtype() {
        return zjtype;
    }

    public void setZjtype(Integer zjtype) {
        this.zjtype = zjtype;
    }

    public String getZjname() {
        return zjname;
    }

    public void setZjname(String zjname) {
        this.zjname = zjname;
    }

    public Integer getZftype() {
        return zftype;
    }

    public void setZftype(Integer zftype) {
        this.zftype = zftype;
    }

    public String getZfname() {
        return zfname;
    }

    public void setZfname(String zfname) {
        this.zfname = zfname;
    }

    public String getZkname() {
        return zkname;
    }

    public void setZkname(String zkname) {
        this.zkname = zkname;
    }

    public String getFhname() {
        return fhname;
    }

    public void setFhname(String fhname) {
        this.fhname = fhname;
    }

    public String getZdname() {
        return zdname;
    }

    public void setZdname(String zdname) {
        this.zdname = zdname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFhao() {
        return fhao;
    }

    public void setFhao(String fhao) {
        this.fhao = fhao;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getZdtype() {
        return zdtype;
    }

    public void setZdtype(Integer zdtype) {
        this.zdtype = zdtype;
    }
}
