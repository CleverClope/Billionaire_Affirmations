package com.example.billionaire_affirmations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class third_hook_swipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_hook_swipe);
    }

    public void btnnext3(View view){
        Intent intent = new Intent(third_hook_swipe.this,fourth_hook_swipe.class);
        startActivity(intent);
        finish();
    }
}
