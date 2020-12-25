package com.example.raynurscalculator;

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

    public void Calc(View view) {
        double result = 0;
        EditText editExpression = findViewById(R.id.editText);
        String text = editExpression.getText().toString();
        String[] part = text.split(" ");
        String sing = part[1];
        switch (sing) {
            case "+":
                result = Double.parseDouble(part[0]) + Double.parseDouble(part[2]);
                break;
            case "-":
                result = Double.parseDouble(part[0]) - Double.parseDouble(part[2]);
                break;
            case "*":
                result = Double.parseDouble(part[0]) * Double.parseDouble(part[2]);
                break;
            case "/":
                result = Double.parseDouble(part[0]) / Double.parseDouble(part[2]);
                break;
        }
        TextView textView = findViewById(R.id.textViewResult);
        textView.setText("= " + result);
    }
}