package com.jdd.developkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Retrofit;
import rx.android.schedulers.AndroidSchedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
