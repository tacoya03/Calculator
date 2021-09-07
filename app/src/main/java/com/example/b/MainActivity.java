package com.example.b;

import androidx.appcompat.app.AppCompatActivity;

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
    public void bt11(View v){
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        TextView result = (TextView) findViewById(R.id.result);
        int a1 = Integer.parseInt(et1.getText().toString());
        int a2 = Integer.parseInt(et2.getText().toString());
        result.setText(Integer.toString(a1 + a2));
    }

    public void bt22(View v){
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        TextView result = (TextView) findViewById(R.id.result);
        int a1 = Integer.parseInt(et1.getText().toString());
        int a2 = Integer.parseInt(et2.getText().toString());
        result.setText(Integer.toString(a1 - a2));
    }

    public void bt33(View v){
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        TextView result = (TextView) findViewById(R.id.result);
        int a1 = Integer.parseInt(et1.getText().toString());
        int a2 = Integer.parseInt(et2.getText().toString());
        result.setText(Integer.toString(a1 * a2));
    }

    public void bt44(View v){
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        TextView result = (TextView) findViewById(R.id.result);
        double a1 = Double.parseDouble(et1.getText().toString());
        double a2 = Double.parseDouble(et2.getText().toString());
        result.setText(Double.toString(a1 / a2));
    }
}