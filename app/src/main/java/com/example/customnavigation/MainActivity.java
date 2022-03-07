package com.example.customnavigation;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.customnavigation.databinding.ActivityMainBinding;
import com.example.customnavigation.fragments.HomeFragment;
import com.example.customnavigation.fragments.SlideShowFragment;
import com.example.customnavigation.fragments.UsersFragment;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends DrawerBaseActivity {
    ActivityMainBinding activityMainBinding;
    AnimatedBottomBar animatedBottomBar;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());
        allocateActivityAll("Main");
        animatedBottomBar = findViewById(R.id.animatedBottomBar);

        if (savedInstanceState == null) {
            animatedBottomBar.selectTabById(R.id.home, true);
            fragmentManager = getSupportFragmentManager();
            HomeFragment homeFragment = new HomeFragment();
            fragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment)
                    .commit();
        }

        animatedBottomBar.setOnTabSelectListener((lastIndex, lastTab, newIndex, newTab) -> {
            Fragment fragment = null;
            switch (newTab.getId()) {
                case R.id.home:
                    fragment = new HomeFragment();
                    break;
                case R.id.notice:
                    fragment=new SlideShowFragment();
                    break;

                case  R.id.faculty:
                    fragment=new UsersFragment();
                    break;


            }

            if (fragment != null) {
                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment)
                        .commit();
            } else {
                Log.e(TAG, "Error in creating Fragment");
            }
        });
}
}