package com.example.customnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customnavigation.databinding.ActivityOrderBinding;

public class OrderActivity extends DrawerBaseActivity {
ActivityOrderBinding activityOrderBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityOrderBinding=ActivityOrderBinding.inflate(getLayoutInflater());

        setContentView(activityOrderBinding.getRoot());
        allocateActivityAll("Orders");
    }
}