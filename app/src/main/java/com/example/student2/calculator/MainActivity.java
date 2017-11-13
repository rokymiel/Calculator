package com.example.student2.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus (View view){
        EditText num1 =(EditText) findViewById(R.id.num1);
        String num1text=num1.getText().toString();
        EditText num2 =(EditText) findViewById(R.id.num2);
        String num2text=num2.getText().toString();
        TextView out =(TextView) findViewById(R.id.out);
        out.setText(""+(Double.parseDouble(num1text)+Double.parseDouble(num2text)));

    }

    public void minus(View view) {
        EditText num1 =(EditText) findViewById(R.id.num1);
        String num1text=num1.getText().toString();
        EditText num2 =(EditText) findViewById(R.id.num2);
        String num2text=num2.getText().toString();
        TextView out =(TextView) findViewById(R.id.out);
        out.setText(""+(Double.parseDouble(num1text)-Double.parseDouble(num2text)));

    }
}
