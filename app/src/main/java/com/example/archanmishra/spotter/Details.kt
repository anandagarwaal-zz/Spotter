package com.example.archanmishra.spotter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.archanmishra.spotter.async.KoinexClient
import com.example.archanmishra.spotter.async.KoinexResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory


class Details : AppCompatActivity(), Callback<KoinexResponse> {
    override fun onResponse(call: Call<KoinexResponse>?, response: Response<KoinexResponse>?) {
        Toast.makeText(this,"success",Toast.LENGTH_LONG)
        var txt1 = findViewById<TextView>(R.id.txt1)
//        Toast.makeText(this, response?.body().toString(), Toast.LENGTH_LONG)
        txt1.text = response!!.code().toString()
    }

    override fun onFailure(call: Call<KoinexResponse>?, t: Throwable?) {
        Toast.makeText(this, "failure", Toast.LENGTH_LONG)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val retrofit = Retrofit.Builder()
                .baseUrl("https://koinex.in/api/")
                
                .addConverterFactory(JacksonConverterFactory.create())
                .build()

        val service = retrofit.create<KoinexClient>(KoinexClient::class.java)
        val repos = service.prices
        repos.enqueue(this)
    }
}
