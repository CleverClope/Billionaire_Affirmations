package com.example.billionaire_affirmations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class first_hook_swipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_hook_swipe);
    }
    public void btnnext(View view){
    Intent i = new Intent(first_hook_swipe.this,second_hook_swipe.class);
    startActivity(i);
    finish();}
}
