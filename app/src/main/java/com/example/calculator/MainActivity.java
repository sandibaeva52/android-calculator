package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Button btn0, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnMultiply,btnDivision,btnEqual,btnCLear,btnDot;
    TextView tvInput, tvOutput;
    String process;
    double total2 = 0.0;
    double total1=0.0;
    boolean add, sub, mul,div,decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btn0 = findViewById(R.id.btn0);
    btn1 = findViewById(R.id.btn1);
    btn2 = findViewById(R.id.btn2);
    btn3 = findViewById(R.id.btn3);
    btn4 = findViewById(R.id.btn4);
    btn5 = findViewById(R.id.btn5);
    btn6 = findViewById(R.id.btn6);
    btn7 = findViewById(R.id.btn7);
    btn8 = findViewById(R.id.btn8);
    btn9 = findViewById(R.id.btn9);

    btnPlus = findViewById(R.id.btnPlus);
    btnMinus = findViewById(R.id.btnMinus);
    btnDivision = findViewById(R.id.btnDivision);
    btnMultiply = findViewById(R.id.btnMultiply);
    btnEqual = findViewById(R.id.btnEqual);
    btnCLear = findViewById(R.id.btnCLear);
    btnDot = findViewById(R.id.btnDot);

    tvInput = findViewById(R.id.tvInput);
    tvOutput = findViewById(R.id.tvOutput);

        btnCLear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
                total1=0.0;
                total2=0.0;
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "9");

            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decimal) {

                }
                    else{
                        //process = tvInput.getText().toString();
                        //tvInput.setText(process + ",");
                    tvInput.setText(tvInput.getText().toString()+".");
                    decimal=true;
                    }

            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               process = tvInput.getText().toString();
                if(tvInput.getText().length()!=0){
                total1=Double.parseDouble(tvInput.getText().toString() + "");
                add=true;
                decimal=false;
                tvInput.setText(null);

                    //tvInput.setText(process + "+");
                }


            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                if(tvInput.getText().length()!=0){
                    total1=Double.parseDouble(tvInput.getText().toString() + "");
                    sub=true;
                    decimal=false;
                    tvInput.setText(null);

                }
                //tvInput.setText(process + "-");

            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                if(tvInput.getText().length()!=0){
                    total1=Double.parseDouble(tvInput.getText().toString() + "");
                    div=true;
                    decimal=false;
                    tvInput.setText(null);

                }
               // tvInput.setText(process + "/");

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                if(tvInput.getText().length()!=0){
                    total1=Double.parseDouble(tvInput.getText().toString() + "");
                   mul=true;
                    decimal=false;
                    tvInput.setText(null);

                }
              //  tvInput.setText(process + "*");

            }
        });

btnEqual.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(add||sub||mul||div){
            total2=Double.parseDouble(tvInput.getText().toString()+"");
        }
if(add==true){
    tvOutput.setText(total1+total2+"");
    add=false;

}
        if(sub==true){
            tvOutput.setText(total1-total2+"");
            sub=false;
        }
        if(mul==true){
            tvOutput.setText(total1*total2+"");
            mul=false;
        }
        if(div==true){
            tvOutput.setText(total1/total2+"");
            div=false;
        }

   // tvOutput.setText( Double.toString(total2) );
   // total1 = 0;


    }
});

    }
}
