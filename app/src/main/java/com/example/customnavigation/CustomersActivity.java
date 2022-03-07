package com.example.customnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customnavigation.databinding.ActivityCustomersBinding;

public class CustomersActivity extends DrawerBaseActivity {
ActivityCustomersBinding activityCustomersBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityCustomersBinding=ActivityCustomersBinding.inflate(getLayoutInflater());

        setContentView(activityCustomersBinding.getRoot());
        allocateActivityAll("Customers");
    }
}