package com.example.qiuyudong.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * <pre>
 *     author : qiuyudong
 *     e-mail : qiuyudongjlu@qq.com
 *     time   : 2017/06/23
 *     desc   :城市类
 *     version: 1.0
 * </pre>
 */
public class City extends DataSupport {
    private int id;
    private String cityName;   //城市名字
    private int cityCode;      //城市代号
    private int provinceId;    //所属省类

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
