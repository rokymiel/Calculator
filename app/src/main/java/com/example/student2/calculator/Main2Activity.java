package com.example.student2.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent= this.getIntent();/*
        intent.getDoubleExtra("sum",);*/
        TextView out =(TextView) findViewById(R.id.out);
        out.setText(""+intent.getDoubleExtra("summ",1));
    }

}
