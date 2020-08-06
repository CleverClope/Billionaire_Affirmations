package com.example.billionaire_affirmations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class second_hook_swipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_hook_swipe);
    }

    public void btnnext2(View v){
        Intent inte = new Intent(second_hook_swipe.this,third_hook_swipe.class);
        startActivity(inte);
        finish();
    }
}
