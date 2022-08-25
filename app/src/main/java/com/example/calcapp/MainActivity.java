package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



        public void changeAction (View view){
        TextView curAction = findViewById(R.id.userAction);
        String add = "+";
        String sub = "-";
        String mult = "*";
        String div = "÷";

    }

        public void reset (View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        TextView curAction = findViewById(R.id.userAction);
        Button sub = findViewById(R.id.findDif);
        Button sum = findViewById(R.id.findSum);
        Button prod = findViewById(R.id.findProd);
        Button quo = findViewById(R.id.findQuo);
        final ConstraintLayout constraintLayout;
        constraintLayout = findViewById(R.id.layout);
        constraintLayout.setBackgroundColor(constraintLayout.getContext().getResources().getColor(R.color.baseBackground));
        sub.setBackgroundColor(sub.getContext().getResources().getColor(R.color.baseButton));
        sum.setBackgroundColor(sub.getContext().getResources().getColor(R.color.baseButton));
        prod.setBackgroundColor(sub.getContext().getResources().getColor(R.color.baseButton));
        quo.setBackgroundColor(sub.getContext().getResources().getColor(R.color.baseButton));

        number1ET.setText("");
        number2ET.setText("");
        numberSumTV.setText("");
        curAction.setText("");
    }

        public void findSum (View view){
        try {
            EditText number1ET = findViewById(R.id.num1ET);
            EditText number2ET = findViewById(R.id.num2ET);
            TextView numberSumTV = findViewById(R.id.resultTV);
            TextView curAction = findViewById(R.id.userAction);
            Button sub = findViewById(R.id.findDif);
            Button sum = findViewById(R.id.findSum);
            Button prod = findViewById(R.id.findProd);
            Button quo = findViewById(R.id.findQuo);
            final ConstraintLayout constraintLayout;
            constraintLayout = findViewById(R.id.layout);
            constraintLayout.setBackgroundColor(constraintLayout.getContext().getResources().getColor(R.color.brightGreen));
            sub.setBackgroundColor(sub.getContext().getResources().getColor(R.color.green));
            sum.setBackgroundColor(sub.getContext().getResources().getColor(R.color.green));
            prod.setBackgroundColor(sub.getContext().getResources().getColor(R.color.green));
            quo.setBackgroundColor(sub.getContext().getResources().getColor(R.color.green));
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum1 = num1 + num2; // 1.0 + 2.0 = 3.0
            if (sum1 % 1 == 0) { // ?
                int intSum = (int) Math.round(sum1);
                String finalText = " " + intSum;
                curAction.setText("+");
                numberSumTV.setText(finalText);
            } else {
                String finalText = " " + sum1;

                curAction.setText("+");

                numberSumTV.setText(finalText);
            }
        }catch(NumberFormatException e){
            TextView numberSumTV = findViewById(R.id.resultTV);
            numberSumTV.setText("Please type a number");
        }
        catch(Exception e){
            TextView numberSumTV = findViewById(R.id.resultTV);
            numberSumTV.setText("An error has Occurred");
        }

    }
        @SuppressLint("ResourceAsColor")

        public void findDif (View view){
        try {
            EditText number1ET = findViewById(R.id.num1ET);
            EditText number2ET = findViewById(R.id.num2ET);
            TextView numberSumTV = findViewById(R.id.resultTV);
            TextView curAction = findViewById(R.id.userAction);
            Button sub = findViewById(R.id.findDif);
            Button sum = findViewById(R.id.findSum);
            Button prod = findViewById(R.id.findProd);
            Button quo = findViewById(R.id.findQuo);
            final ConstraintLayout constraintLayout;
            constraintLayout = findViewById(R.id.layout);
            constraintLayout.setBackgroundColor(constraintLayout.getContext().getResources().getColor(R.color.brightRed));
            sub.setBackgroundColor(sub.getContext().getResources().getColor(R.color.red));
            sum.setBackgroundColor(sub.getContext().getResources().getColor(R.color.red));
            prod.setBackgroundColor(sub.getContext().getResources().getColor(R.color.red));
            quo.setBackgroundColor(sub.getContext().getResources().getColor(R.color.red));
            //.setBackgroundColor(rel.getContext().getResources().getColor(R.color.brightRed));
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double dif = num1 - num2;
            if (dif % 1 == 0) {
                int intDif = (int) Math.round(dif);
                String finalText = " " + intDif;
                curAction.setText("-");
                numberSumTV.setText(finalText);
            } else {

                String finalText = " " + dif;

                curAction.setText("-");

                numberSumTV.setText(finalText);

            }
        }catch (NumberFormatException e){
            TextView numberSumTV = findViewById(R.id.resultTV);
            numberSumTV.setText("Please type a number");
        }catch (Exception e){
            TextView numberSumTV = findViewById(R.id.resultTV);
            numberSumTV.setText("An error has Occurred");
        }

    }
        public void findQuo (View view){
        try {
            EditText number1ET = findViewById(R.id.num1ET);
            EditText number2ET = findViewById(R.id.num2ET);
            TextView numberSumTV = findViewById(R.id.resultTV);
            TextView curAction = findViewById(R.id.userAction);
            Button sub = findViewById(R.id.findDif);
            Button sum = findViewById(R.id.findSum);
            Button prod = findViewById(R.id.findProd);
            Button quo = findViewById(R.id.findQuo);
            final ConstraintLayout constraintLayout;
            constraintLayout = findViewById(R.id.layout);
            constraintLayout.setBackgroundColor(constraintLayout.getContext().getResources().getColor(R.color.orange));
            sub.setBackgroundColor(sub.getContext().getResources().getColor(R.color.darkOrange));
            sum.setBackgroundColor(sub.getContext().getResources().getColor(R.color.darkOrange));
            prod.setBackgroundColor(sub.getContext().getResources().getColor(R.color.darkOrange));
            quo.setBackgroundColor(sub.getContext().getResources().getColor(R.color.darkOrange));

            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double quo1 = num1 / num2;
            DecimalFormat f = new DecimalFormat("##.000");
            if (quo1 % 1 == 0) {
                int intQuo = (int) Math.round(quo1);
                String finalText = " " + intQuo;
                curAction.setText("÷");

                numberSumTV.setText(finalText);
            } else {


                curAction.setText("÷");

                String finalText = " " + f.format(quo1);

                numberSumTV.setText(finalText);

            }
        }catch(NumberFormatException e){
            TextView numberSumTV = findViewById(R.id.resultTV);
            numberSumTV.setText("Please type a number");
        } catch(Exception e){
            TextView numberSumTV = findViewById(R.id.resultTV);
            numberSumTV.setText("An error has occurred");
        }
    }
        public void findProd (View view) {
            try {
                EditText number1ET = findViewById(R.id.num1ET);
                EditText number2ET = findViewById(R.id.num2ET);
                TextView numberSumTV = findViewById(R.id.resultTV);
                TextView curAction = findViewById(R.id.userAction);
                Button sub = findViewById(R.id.findDif);
                Button sum = findViewById(R.id.findSum);
                Button prod = findViewById(R.id.findProd);
                Button quo = findViewById(R.id.findQuo);
                final ConstraintLayout constraintLayout;
                constraintLayout = findViewById(R.id.layout);
                constraintLayout.setBackgroundColor(constraintLayout.getContext().getResources().getColor(R.color.brightBlue));
                sub.setBackgroundColor(sub.getContext().getResources().getColor(R.color.blue));
                sum.setBackgroundColor(sub.getContext().getResources().getColor(R.color.blue));
                prod.setBackgroundColor(sub.getContext().getResources().getColor(R.color.blue));
                quo.setBackgroundColor(sub.getContext().getResources().getColor(R.color.blue));
                double num1 = Double.parseDouble((number1ET.getText().toString()));
                double num2 = Double.parseDouble((number2ET.getText().toString()));
                double prod1 = num1 * num2;
                if (prod1 % 1 == 0) {
                    int intProd = (int) Math.round(prod1);
                    String finalText = " " + intProd;
                    curAction.setText("*");
                    numberSumTV.setText(finalText);
                } else {

                    String finalText = " " + prod1;

                    curAction.setText("*");

                    numberSumTV.setText(finalText);

                }
            } catch(NumberFormatException e) {
                TextView numberSumTV = findViewById(R.id.resultTV);
                numberSumTV.setText("Please type a number");
            }catch(Exception e){
                TextView numberSumTV = findViewById(R.id.resultTV);
                numberSumTV.setText("An error has occurred");
            }
    }

}

