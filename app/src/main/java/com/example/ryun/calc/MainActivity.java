package com.example.ryun.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    EditText text1;
    EditText text2;
    TextView textV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        text1 = (EditText) findViewById(R.id.editText2);
        text2 = (EditText) findViewById(R.id.editText3);
        textV1 = (TextView) findViewById(R.id.textView3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('+');
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('-');
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('*');
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Op('/');
            }
        });
    }

    void Op(char op) {
        double num1 = Double.parseDouble(text1.getText().toString());
        double num2 = Double.parseDouble(text2.getText().toString());
        double value = 0;

        if(text1.getText().equals("") || text2.getText().equals("")){
            Toast.makeText(getApplicationContext(), "값을 입력하여 주십시오", Toast.LENGTH_SHORT).show();
        }
        else{
            if(op == '+'){ value = num1 + num2; }
            if(op == '-'){ value = num1 - num2; }
            if(op == '*'){ value = num1 * num2; }
            if(op == '/'){
                if(num2 == 0){ Toast.makeText(getApplicationContext(), "0으로는 나눌수 없습니다", Toast.LENGTH_SHORT).show(); textV1.setText("0으로는 나눌수 없습니다"); }
                else{ value = num1 / num2; }
            }
        }

        textV1.setText("계산 결과 : " + value);
    }
}
