package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 阳光笑容 on 2018/2/18.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    //省名字
    private int provinceCode;
    //省代号
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
