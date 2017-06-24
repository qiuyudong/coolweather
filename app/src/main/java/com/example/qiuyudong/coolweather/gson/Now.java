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
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
