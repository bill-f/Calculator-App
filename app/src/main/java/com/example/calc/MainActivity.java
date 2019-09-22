package com.example.calc;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean isOpPressed=false;  //check if a operation is pressed
    double firstNum=0;
    int secondNumIndex=0;
    char op;
    boolean clickedResult=false;  //check if =  is pressed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final TextView tv_view;
        tv_view = (TextView)findViewById(R.id.text_view);

        final Button n1 = findViewById(R.id.button_1);
        final Button n2 = findViewById(R.id.button_2);
        final Button n3 = findViewById(R.id.button_3);
        final Button n4 = findViewById(R.id.button_4);
        final Button n5 = findViewById(R.id.button_5);
        final Button n6 = findViewById(R.id.button_6);
        final Button n7 = findViewById(R.id.button_7);
        final Button n8 = findViewById(R.id.button_8);
        final Button n9 = findViewById(R.id.button_9);
        final Button n0 = findViewById(R.id.button_0);
        final Button dot = findViewById(R.id.button_comma);
        final Button equals = findViewById(R.id.button_result);
        final Button plus = findViewById(R.id.button_plus);
        final Button minus = findViewById(R.id.button_minus);
        final Button multi = findViewById(R.id.button_multi);
        final Button division = findViewById(R.id.button_division);


        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                final String calc = tv_view.getText().toString();

                switch (id) {

                    case R.id.button_0:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("0");
                            clickedResult=false;
                        }
                        else{
                        tv_view.append("0");
                        }
                        break;
                    case R.id.button_1:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("1");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("1");}
                        break;
                    case R.id.button_2:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("2");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("2");}
                        break;
                    case R.id.button_3:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("3");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("3");}
                        break;
                    case R.id.button_4:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("4");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("4");}
                        break;
                    case R.id.button_5:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("5");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("5");}
                        break;
                    case R.id.button_6:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("6");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("6");}
                        break;
                    case R.id.button_7:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("7");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("7");}
                        break;
                    case R.id.button_8:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("8");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("8");}
                        break;
                    case R.id.button_9:
                        if(clickedResult){
                            tv_view.setText("");
                            tv_view.append("9");
                            clickedResult=false;
                        }
                        else{
                            tv_view.append("9");}
                        break;
                    case R.id.button_comma:
                        tv_view.append(".");
                        break;
                    case R.id.button_plus:
                        secondNumIndex= calc.length()+1;
                        firstNum = Double.parseDouble(calc);
                        tv_view.append("+");
                        isOpPressed=true;
                        op='+';
                        clickedResult=false;
                        break;
                    case R.id.button_minus:
                        if(calc.length()>0) {
                            secondNumIndex = calc.length() + 1;
                            firstNum = Double.parseDouble(calc);
                            tv_view.append("-");
                            isOpPressed = true;
                            op = '-';
                            clickedResult=false;
                        }                                //for - numbers.
                        else{
                            tv_view.append("-");
                        }
                        break;
                    case R.id.button_multi:
                        secondNumIndex= calc.length()+1;
                        firstNum = Double.parseDouble(calc);
                        tv_view.append("*");
                        isOpPressed=true;
                        op='*';
                        clickedResult=false;
                        break;
                    case R.id.button_division:
                        secondNumIndex= calc.length()+1;
                        firstNum = Double.parseDouble(calc);
                        tv_view.append("/");
                        isOpPressed=true;
                        op='/';
                        clickedResult=false;
                        break;
                    case R.id.button_result:
                        clickedResult=true;
                        if(isOpPressed){
                            if(op=='+'){
                                double secondNum = Double.parseDouble(calc.substring(secondNumIndex, calc.length()));
                                secondNum+=firstNum;
                                tv_view.setText(String.valueOf(secondNum));
                                isOpPressed=false;
                            }
                            if(op=='-'){
                                double secondNum = Double.parseDouble(calc.substring(secondNumIndex, calc.length()));
                                firstNum-=secondNum;
                                tv_view.setText(String.valueOf(firstNum));
                                isOpPressed=false;
                            }
                            if(op=='*'){
                                double secondNum = Double.parseDouble(calc.substring(secondNumIndex, calc.length()));
                                firstNum*=secondNum;
                                tv_view.setText(String.valueOf(firstNum));
                                isOpPressed=false;
                            }
                            if(op=='/'){
                                double secondNum = Double.parseDouble(calc.substring(secondNumIndex, calc.length()));
                                firstNum/=secondNum;
                                tv_view.setText(String.valueOf(firstNum));
                                isOpPressed=false;
                            }
                        }
                        break;
                }
            }
        };


        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        minus.setOnClickListener(calculatorListener);
        plus.setOnClickListener(calculatorListener);
        multi.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);


        //clear button

        final Button clearEverything = findViewById(R.id.button_reset);

        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_view.setText("");
            }
        });
    }




}

