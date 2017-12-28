package com.example.archanmishra.spotter.async;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by archan.mishra on 27/12/17.
 */

public interface KoinexClient {
    @GET("allPrices")
    Call<List<KoinexResponse>> getPrices();
}
