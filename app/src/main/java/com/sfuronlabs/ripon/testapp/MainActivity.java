package com.sfuronlabs.ripon.testapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button plus,minus,multiplication,division,equal;
    TextView result;

    int number1,number2,res,which;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        input = (EditText)findViewById(R.id.etInput);
        plus = (Button)findViewById(R.id.btnPlus);
        minus = (Button) findViewById(R.id.btnMinus);
        multiplication = (Button) findViewById(R.id.btnMultiplication);
        division = (Button) findViewById(R.id.btnDivision);
        equal = (Button) findViewById(R.id.btnEqual);
        result = (TextView) findViewById(R.id.tvResult);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = input.getText().toString();
                if (x.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Please input a number",Toast.LENGTH_LONG).show();
                }
                else
                {
                    number1 = Integer.parseInt(x);
                    input.getText().clear();
                    which = 1;
                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = input.getText().toString();
                number1 = Integer.parseInt(x);
                input.getText().clear();
                which = 2;
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = input.getText().toString();
                number1 = Integer.parseInt(x);
                input.getText().clear();
                which = 3;
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = input.getText().toString();
                number1 = Integer.parseInt(x);
                input.getText().clear();
                which = 4;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = input.getText().toString();
                number2 = Integer.parseInt(x);
                input.getText().clear();
                switch (which)
                {
                    case 1:
                        res = number1 + number2;
                        result.setText(res+"");
                        break;
                    case 2:
                        res = number1 - number2;
                        result.setText(res+"");
                        break;
                    case 3:
                        res = number1 * number2;
                        result.setText(res+"");
                        break;
                    case 4:
                        res = number1 / number2;
                        result.setText(res+"");
                        break;
                }

            }
        });

    }


}
