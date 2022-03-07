package com.example.customnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customnavigation.databinding.ActivityMainBinding;

public class MainActivity extends DrawerBaseActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());
        allocateActivityAll("Main");

    }
}