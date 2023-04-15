package com.priti.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro,pund,dollar,yen,bitcon,ruble,won,ausdollor,candollar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.btn1);
        pund = findViewById(R.id.btn2);
        dollar = findViewById(R.id.btn3);
        yen = findViewById(R.id.btn4);
        bitcon= findViewById(R.id.btn5);
        ruble = findViewById(R.id.btn6);
        won = findViewById(R.id.btn7);
        ausdollor= findViewById(R.id.btn8);
        candollar= findViewById(R.id.btn9);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.editText);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              String z = editText.getText().toString();
              if (TextUtils.isEmpty(z)){
                  editText.setError("empty user input");
              }
              else {
                  double n,k;
                  n = Double.parseDouble(z);

                  textView.setText(null);

                  Formatter formatter = new Formatter();
                  k = n * 88.01;
                  DecimalFormat numberformat = new DecimalFormat("#.00");

                  textView.setText("" + numberformat.format(k));
              }
            }
        });
        pund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n,k;
                    n = Double.parseDouble(z);

                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 99.13 ;
                    DecimalFormat numberformat = new DecimalFormat("#.00");

                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n,k;
                    n = Double.parseDouble(z);

                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 82.45 ;
                    DecimalFormat numberformat = new DecimalFormat("#.00");

                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n,k;
                    n = Double.parseDouble(z);

                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.61;
                    DecimalFormat numberformat = new DecimalFormat("#.00");

                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        bitcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n,k;
                    n = Double.parseDouble(z);

                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 1953105.98;
                    DecimalFormat numberformat = new DecimalFormat("#.00");

                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n,k;
                    n = Double.parseDouble(z);

                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 1.10;
                    DecimalFormat numberformat = new DecimalFormat("#.00");

                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        won.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n,k;
                    n = Double.parseDouble(z);

                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 0.063;
                    DecimalFormat numberformat = new DecimalFormat("#.00");

                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        ausdollor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n,k;
                    n = Double.parseDouble(z);

                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 55.67 ;
                    DecimalFormat numberformat = new DecimalFormat("#.00");

                    textView.setText("" + numberformat.format(k));
                }
            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }
                else {
                    double n,k;
                    n = Double.parseDouble(z);

                    textView.setText(null);

                    Formatter formatter = new Formatter();
                    k = n * 60.48 ;
                    DecimalFormat numberformat = new DecimalFormat("#.00");

                    textView.setText("" + numberformat.format(k));
                }
            }
        });

    }
}