package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display).equals(display.getText().toString())) {
                    display.setText("");
                }
            }
        });
    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if(getString(R.string.display).equals(display.getText().toString())){
            display.setText(strToAdd);
            display.setSelection(cursorPos + 1);
        }
        else{
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            display.setSelection(cursorPos + 1);
        }
    }

    public void zeroBTN(View view){
        updateText("0");
    }

    public void oneBTN(View view){
        updateText("1");
    }

    public void twoBTN(View view){
        updateText("2");
    }

    public void threeBTN(View view){
        updateText("3");
    }

    public void fourBTN(View view){
        updateText("4");
    }

    public void fiveBTN(View view){
        updateText("5");
    }

    public void sixBTN(View view){
        updateText("6");
    }

    public void sevenBTN(View view){
        updateText("7");
    }

    public void eightBTN(View view){
        updateText("8");
    }

    public void nineBTN(View view){
        updateText("9");
    }

    public void pointBTN(View view){
        updateText(".");
    }

    public void addBTN(View view){
        updateText("+");
    }

    public void substractBTN(View view){
        updateText("-");
    }

    public void multiplyBTN(View view){
        updateText("*");
    }

    public void divideBTN(View view){
        updateText("/");
    }

    public void equalsBTN(View view) throws ScriptException {
        //display.setText(engine.eval(text).toString());
        String s = display.getText().toString();
        display.setText(calc(s));
    }

    public String calc(String input) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("rhino");
        Object o = engine.eval("1+1");
        return engine.eval(input).toString();
    }

    public void plusMinusBTN(View view){

    }

    public void rootBTN(View view){

    }

    public void onedivideXBTN(View view){

    }

    public void clearTN(View view){
        display.setText("");
    }

    public void cleareOneBTN(View view){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if(cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos -1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos - 1);
        }

    }

    public void MRBTN(View view){

    }

    public void MCBTN(View view){

    }

    public void MSBTN(View view){

    }

    public void MplusBTN(View view){

    }

    public void MminusBTN(View view){

    }



}