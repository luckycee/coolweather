package com.example.luckycee.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by huangyun on 2017/4/3.
 */

public class Province extends DataSupport {

    private  int id;

    private String provinceName;

    private int proviceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
