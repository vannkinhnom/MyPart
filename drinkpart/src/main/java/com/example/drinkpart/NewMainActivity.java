package com.example.drinkpart;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.drinkpart.Fragments.Cool;
import com.example.drinkpart.Fragments.Frappes;
import com.example.drinkpart.Fragments.Hot;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NewMainActivity extends AppCompatActivity {
    private Fragment fragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int itemId = item.getItemId();
            if (itemId == R.id.navigation_home) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new Hot()).commit();
                return true;
            } else if (itemId == R.id.navigation_dashboard) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new Cool()).commit();
                return true;
            } else if (itemId == R.id.navigation_notifications) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new Frappes()).commit();
                return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}



