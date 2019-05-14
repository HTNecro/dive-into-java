package org.kotliner.java.io;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkHttpDemo {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .build();
        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body());
        }
    }

}
