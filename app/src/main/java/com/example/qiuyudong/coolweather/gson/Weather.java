package com.example.qiuyudong.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <pre>
 *     author : qiuyudong
 *     e-mail : qiuyudongjlu@qq.com
 *     time   : 2017/06/24
 *     desc   :
 *     version: 1.0
 * </pre>
 */


public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}