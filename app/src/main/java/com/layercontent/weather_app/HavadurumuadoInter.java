package com.layercontent.weather_app;

import com.layercontent.weather_app.jsonpopjo.Wee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface HavadurumuadoInter {

    @POST("forecast.json ")
    @FormUrlEncoded
    Call<Wee> havadurumu(@Field("key") String key, @Field("q") String sehir, @Field("days") int days, @Field("lang") String lang);
}
