package com.example.billionaire_affirmations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fourth_hook_swipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_hook_swipe);
    }
    public void btnnext4(View view){
        Intent in = new Intent(fourth_hook_swipe.this,home.class);
        startActivity(in);
        finish();
    }
}
