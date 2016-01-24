package com.swamperino.jakejubjub.lear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level_Select extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.jakejubjub.lear.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
        Intent intent=getIntent();
    }
    protected void beginner(View view){
        Intent intent=new Intent(this, LevelActivity.class);
        String d="0";
        intent.putExtra(EXTRA_MESSAGE, d);
        startActivity(intent);
    }
    protected void intermediate(View view){
        Intent intent=new Intent(this, LevelActivity.class);
        String d="1";
        intent.putExtra(EXTRA_MESSAGE,d);
        startActivity(intent);
    }
    protected void advanced(View view){
        Intent intent=new Intent(this, LevelActivity.class);
        String d="2";
        intent.putExtra(EXTRA_MESSAGE,d);
        startActivity(intent);
    }
    protected void expert(View view){
        Intent intent=new Intent(this, LevelActivity.class);
        String d="3";
        intent.putExtra(EXTRA_MESSAGE,d);
        startActivity(intent);
    }
}
