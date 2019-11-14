package com.example.topicone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GridLayoutActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSubtract, btnMultiply, btnDecimal, btnDivide, btnEquals;
    EditText etOperation;
    TextView tvResult;
    float firstNumber, secondNumber;
    boolean addition, subtraction, multiplication, division, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEquals = findViewById(R.id.btnEquals);
        etOperation = findViewById(R.id.etOperation);
        tvResult = findViewById(R.id.tvResult);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"1");
                tvResult.setText(tvResult.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"2");
                tvResult.setText(tvResult.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"3");
                tvResult.setText(tvResult.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"4");
                tvResult.setText(tvResult.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"5");
                tvResult.setText(tvResult.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"6");
                tvResult.setText(tvResult.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"7");
                tvResult.setText(tvResult.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"8");
                tvResult.setText(tvResult.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"9");
                tvResult.setText(tvResult.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+"0");
                tvResult.setText(tvResult.getText()+"0");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResult();
                etOperation.setText(etOperation.getText()+".");
                tvResult.setText(tvResult.getText()+".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEmptyOperation();

                if (addition == true || subtraction == true || multiplication == true || division == true){
                }
                else{
                    firstNumber = Float.parseFloat(etOperation.getText().toString());
                    addition = true;
                    tvResult.setText(tvResult.getText()+"+");
                    etOperation.setText(null);
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEmptyOperation();

                if (addition == true || subtraction == true || multiplication == true || division == true){
                }
                else{
                    firstNumber = Float.parseFloat(etOperation.getText().toString());
                    subtraction = true;
                    tvResult.setText(tvResult.getText()+"-");
                    etOperation.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEmptyOperation();

                if (addition == true || subtraction == true || multiplication == true || division == true){
                }
                else{
                    firstNumber = Float.parseFloat(etOperation.getText().toString());
                    multiplication = true;
                    tvResult.setText(tvResult.getText()+"*");
                    etOperation.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEmptyOperation();

                if (addition == true || subtraction == true || multiplication == true || division == true){
                }
                else{
                    firstNumber = Float.parseFloat(etOperation.getText().toString());
                    division = true;
                    tvResult.setText(tvResult.getText()+"/");
                    etOperation.setText(null);
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addition == true || subtraction == true || multiplication == true || division == true){
                    secondNumber = Float.parseFloat((etOperation.getText().toString()));
                }

                if (addition == true) {
                    tvResult.setText(tvResult.getText() + "=" + (firstNumber + secondNumber));
                    addition = false;
                    etOperation.setText("");
                }
                else if (subtraction == true) {
                    tvResult.setText(tvResult.getText() + "=" + (firstNumber - secondNumber));
                    subtraction = false;
                    etOperation.setText("");
                }
                else if (multiplication == true) {
                    tvResult.setText(tvResult.getText() + "=" + (firstNumber * secondNumber));
                    multiplication = false;
                    etOperation.setText("");
                }
                else if (division == true) {
                    tvResult.setText(tvResult.getText() + "=" + (firstNumber / secondNumber));
                    division = false;
                    etOperation.setText("");
                }
                result = true;
            }
        });

    }

    public void checkResult(){
        if (result == true) {
            result = false;
            tvResult.setText("");
        }
    }

    public void checkEmptyOperation(){
        if (TextUtils.isEmpty(etOperation.getText())){
            etOperation.setText("");
        }
    }
}
