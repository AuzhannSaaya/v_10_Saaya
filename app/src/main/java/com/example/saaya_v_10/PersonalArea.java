package com.example.saaya_v_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PersonalArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
    }

    public void startNotice(View v){
        Intent intent = new Intent(this, Notice.class);
        startActivity(intent);
    }
}