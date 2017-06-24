package com.example.qiuyudong.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * <pre>
 *     author : qiuyudong
 *     e-mail : qiuyudongjlu@qq.com
 *     time   : 2017/06/23
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address , okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
