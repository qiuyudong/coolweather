package com.example.qiuyudong.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * <pre>
 *     author : qiuyudong
 *     e-mail : qiuyudongjlu@qq.com
 *     time   : 2017/06/23
 *     desc   :  省类
 *     version: 1.0
 * </pre>
 */
public class Provice extends DataSupport {
    private int id;
    private String provinceName;  //省名
    private int proviceCode;  //省的代号

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
