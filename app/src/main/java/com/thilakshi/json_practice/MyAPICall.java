package com.thilakshi.json_practice;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {

    //https://run.mocky.io/           v3/c846d5eb-e073-4e3c-93d3-6476486c75b0

    @GET("v3/c846d5eb-e073-4e3c-93d3-6476486c75b0")
    Call<DataModel> getData();
}
