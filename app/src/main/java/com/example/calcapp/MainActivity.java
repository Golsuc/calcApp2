package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeAction(View view){
        TextView curAction = findViewById(R.id.userAction);
        String add = "+";
        String sub = "-";
        String mult = "*";
        String div = "÷";

    }
    public void changeColorSub(View view){

        Button sub = findViewById(R.id.findDif);
        RelativeLayout rel = findViewById(R.id.layout);
        sub.setBackgroundColor(sub.getContext().getResources().getColor(R.color.red));
        rel.setBackgroundColor(rel.getContext().getResources().getColor(R.color.brightRed));

    }
    public void changeColorSum(View view){

        Button sum = findViewById(R.id.findSum);


    }
    public void changeColorProd(View view){


        Button prod = findViewById(R.id.findProd);


    }
    public void changeColorQuo(View view){


        Button quo = findViewById(R.id.findQuo);


    }
    public void findSum(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        TextView curAction = findViewById(R.id.userAction);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1 + num2; // 1.0 + 2.0 = 3.0
        if (sum%1 == 0){ // ?
            int intSum = (int)Math.round(sum);
            String finalText = " " + intSum;
            curAction.setText("+");
            numberSumTV.setText(finalText);
        }else{
            String finalText = " " + sum;

            curAction.setText("+");

            numberSumTV.setText(finalText);
        }

    }
    public void findDif(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        TextView curAction = findViewById(R.id.userAction);
        Button sub = findViewById(R.id.findDif);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double dif = num1 - num2;
        if (dif%1 == 0){
            int intDif = (int)Math.round(dif);
            String finalText = " " + intDif;
            curAction.setText("-");
            numberSumTV.setText(finalText);
        }else{

            String finalText = " " + dif;

            curAction.setText("-");

            numberSumTV.setText(finalText);

        }
        RelativeLayout rel = findViewById(R.id.layout);
        sub.setBackgroundColor(sub.getContext().getResources().getColor(R.color.red));
        rel.setBackgroundColor(rel.getContext().getResources().getColor(R.color.brightRed));

    }
    public void findQuo(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        TextView curAction = findViewById(R.id.userAction);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double quo = num1 / num2;
        if (quo%1 == 0){
            int intQuo = (int)Math.round(quo);
            String finalText = " " + intQuo;
            curAction.setText("÷");

            numberSumTV.setText(finalText);
        }else{

            curAction.setText("÷");

            String finalText = " " + quo;

            numberSumTV.setText(finalText);

        }
    }
    public void findProd(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        TextView curAction = findViewById(R.id.userAction);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double prod = num1 * num2;
        if (prod%1 == 0){
            int intProd = (int)Math.round(prod);
            String finalText = " " + intProd;
            curAction.setText("*");
            numberSumTV.setText(finalText);
        }else{

        String finalText = " " + prod;

        curAction.setText("*");

        numberSumTV.setText(finalText);

        }
    }
}
