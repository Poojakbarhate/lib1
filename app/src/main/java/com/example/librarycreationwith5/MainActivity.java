package com.example.librarycreationwith5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.templib.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasty.sundaykoaana(this,"sunday ko mast naha dho ke aa");
    }
}