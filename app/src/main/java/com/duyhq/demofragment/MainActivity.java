package com.duyhq.demofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);

        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.container1, new Fragment1());

        ft.commit();

        btn.setOnClickListener(v -> {
            FragmentTransaction ft2 = fm.beginTransaction();

//            Fragment fragment = fm.findFragmentById(R.id.container1);
//
//            ft2.remove(fragment);

            ft2.replace(R.id.container1, new Fragment2());

            ft2.commit();

        });


    }
}