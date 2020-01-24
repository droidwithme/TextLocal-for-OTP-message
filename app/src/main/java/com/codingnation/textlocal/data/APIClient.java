package com.codingnation.textlocal.data;

import com.codingnation.textlocal.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {

        if (retrofit == null) {
            try {
                Interceptor REWRITE_CACHE_CONTROL_INTERCEPTOR = new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Response originalResponse = chain.proceed(chain.request());

                        return originalResponse.newBuilder()
                                .build();

                    }
                };

                File httpCacheDirectory = new File(MyApplication.getInstance().getApplicationContext().getCacheDir(), "responses");
                int cacheSize = 10 * 1024 * 1024; // 10 MiB
                Cache cache = new Cache(httpCacheDirectory, cacheSize);
                OkHttpClient client = new OkHttpClient.Builder()
                        .addNetworkInterceptor(REWRITE_CACHE_CONTROL_INTERCEPTOR)
                        .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                        .cache(cache)
                        .build();


                Gson gson = new GsonBuilder()
                        .setLenient()
                        .create();

                retrofit = new Retrofit.Builder()
                        .baseUrl(EndPoints.BASE_URL)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build();
                Utils.INSTANCE.logD("Retrofit Client is created", "OK");
            } catch (Exception e) {
                Utils.INSTANCE.logD("Retrofit Client creation failed", e.getMessage());
            }


        }

        return retrofit;
    }


}
