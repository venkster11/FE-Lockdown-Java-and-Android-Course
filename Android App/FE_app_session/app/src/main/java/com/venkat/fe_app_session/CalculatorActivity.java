package com.venkat.fe_app_session;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private EditText Num1;
    private EditText Num2;
    private Button Add;
    private Button Sub;
    private Button Mul;
    private Button Div;
    private TextView Ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Num1 = findViewById(R.id.ET_num1);
        Num2 = findViewById(R.id.ET_num2);
        Add = findViewById(R.id.btn_add);
        Sub = findViewById(R.id.btn_sub);
        Mul = findViewById(R.id.btn_mul);
        Div = findViewById(R.id.btn_div);
        Ans = findViewById(R.id.txt_ans);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Num1.getText().toString().length() == 0){
                    Num1.setText("0");
                }
                if(Num2.getText().toString().length() == 0){
                    Num2.setText("0");
                }

                int n1 = Integer.parseInt(Num1.getText().toString());
                int n2 = Integer.parseInt(Num2.getText().toString());

                int sum = n1 + n2;
                Ans.setText(String.valueOf(sum));
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Num1.getText().toString().length() == 0){
                    Num1.setText("0");
                }
                if(Num2.getText().toString().length() == 0){
                    Num2.setText("0");
                }

                int n1 = Integer.parseInt(Num1.getText().toString());
                int n2 = Integer.parseInt(Num2.getText().toString());

                int sum = n1 - n2;
                Ans.setText(String.valueOf(sum));
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Num1.getText().toString().length() == 0){
                    Num1.setText("0");
                }
                if(Num2.getText().toString().length() == 0){
                    Num2.setText("0");
                }

                int n1 = Integer.parseInt(Num1.getText().toString());
                int n2 = Integer.parseInt(Num2.getText().toString());

                int sum = n1 * n2;
                Ans.setText(String.valueOf(sum));
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Num1.getText().toString().length() == 0){
                    Num1.setText("0");
                }
                if(Num2.getText().toString().length() == 0){
                    Num2.setText("0");
                }

                double n1 = Integer.parseInt(Num1.getText().toString());
                double n2 = Integer.parseInt(Num2.getText().toString());

                double sum = n1 / n2;
                Ans.setText(String.valueOf(sum));
            }
        });

    }
}
