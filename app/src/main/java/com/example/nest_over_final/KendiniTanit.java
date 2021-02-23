package com.example.nest_over_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KendiniTanit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendini_tanit);
    }
    public void AcceptButton(View view) {
        Intent intent = new Intent(KendiniTanit.this,HomePage.class);
        startActivity(intent);
    }
}