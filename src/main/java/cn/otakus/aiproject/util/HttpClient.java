package cn.otakus.aiproject.util;

import cn.hutool.http.HttpUtil;


/**
 * @author otakus
 * @date 2023/3/17
 * @since 1.0.0
 */
public class HttpClient {

    private HttpClient() {}

    public static String post(String url, String body) {
        return HttpUtil.post(url, body);
    }

}