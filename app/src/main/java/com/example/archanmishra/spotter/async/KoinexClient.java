package com.example.archanmishra.spotter.async;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by archan.mishra on 27/12/17.
 */

public interface KoinexClient {
    @GET("dashboards/ticker")
    Call<KoinexResponse> getPrices();
}
