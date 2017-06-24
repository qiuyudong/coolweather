package com.example.qiuyudong.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * <pre>
 *     author : qiuyudong
 *     e-mail : qiuyudongjlu@qq.com
 *     time   : 2017/06/24
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
