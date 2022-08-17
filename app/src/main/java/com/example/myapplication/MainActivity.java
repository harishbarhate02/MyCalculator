package com.example.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    boolean isNewOperator = true;
    EditText edt1;
    String operator = "+";
    String initialnumber = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {

        if (isNewOperator)
            edt1.setText("");
        isNewOperator =false;

        String number = edt1.getText().toString();

        if(view.getId() == R.id.button1){
            number += "1";
        }
        else if(view.getId() == R.id.button2){
            number += "2";
        }
        else if(view.getId() == R.id.button3){
            number += "3";
        }
        else if(view.getId() == R.id.button4){
            number += "4";
        }
        else if(view.getId() == R.id.button5){
            number += "5";
        }
        else if(view.getId() == R.id.button6){
            number += "6";
        }
        else if(view.getId() == R.id.button7){
            number += "7";
        }
        else if(view.getId() == R.id.button8){
            number += "8";
        }
        else if(view.getId() == R.id.button9){
            number += "9";
        }
        else if(view.getId() == R.id.buttonZero){
            number += "0";
        }
        else if(view.getId() == R.id.buttonDot){
            number += ".";
        }

        edt1.setText(number);

    }

    public void operatorEvent(View view) {
        isNewOperator =true;
        initialnumber = edt1.getText().toString();

        if(view.getId() == R.id.buttonMultiply){
            operator = "*";}

        else if(view.getId() == R.id.buttonMinus){
            operator = "-";}

        else if(view.getId() == R.id.buttonDivide){
            operator = "/";}

        else if(view.getId() == R.id.buttonPlus){
            operator = "+";
        }


    }

    @SuppressLint("SetTextI18n")
    public void equalsEvent(View view) {
        String newNumber = edt1.getText().toString();
        double output = 0.0;

        if (operator.equals("+"))
            output = Double.parseDouble(initialnumber) + Double.parseDouble(newNumber);

        if (operator.equals("/"))
            output = Double.parseDouble(initialnumber) / Double.parseDouble(newNumber);

        if (operator.equals("*"))
            output = Double.parseDouble(initialnumber) * Double.parseDouble(newNumber);

        if (operator.equals("-"))
            output = Double.parseDouble(initialnumber) - Double.parseDouble(newNumber);

        edt1.setText(output+"");
    }

    public void clearEvent(View view) {
        edt1.setText("0");
        isNewOperator = true;
    }

    @SuppressLint("SetTextI18n")
    public void percentEvent(View view) {
        double num = Double.parseDouble(edt1.getText().toString())/100;
        edt1.setText(num+"");
        isNewOperator =true;
    }
}