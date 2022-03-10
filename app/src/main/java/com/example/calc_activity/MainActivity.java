package com.example.calc_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, divide, modulus, equals, multiply, dot, delete;
    TextView display;

    double input1 = 0.0, input2 = 0.0;

    boolean Add, Sub, Mul, Div, Mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        modulus = (Button) findViewById(R.id.modulus);

        equals = (Button) findViewById(R.id.equals);
        dot = (Button) findViewById(R.id.dot);
        delete = (Button) findViewById(R.id.delete);
        display = (TextView) findViewById(R.id.display);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + ".");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                } else {
                    input1 = Float.parseFloat(display.getText() + "");
                    Add = true;
                    display.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                } else {
                    input1 = Float.parseFloat(display.getText() + "");
                    Sub = true;
                    display.setText(null);
                }

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                } else {
                    input1 = Float.parseFloat(display.getText() + "");
                    Mul = true;
                    display.setText(null);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                } else {
                    input1 = Float.parseFloat(display.getText() + "");
                    Div = true;
                    display.setText(null);
                }
            }
        });


        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                } else {
                    input1 = Float.parseFloat(display.getText() + "");
                    Mod = true;
                    display.setText(null);
                }
            }

        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input2 = Float.parseFloat(display.getText() + "");
                if (Add == true) {
                    display.setText(input1 + input2 + "");
                    Add = false;
                }
                if (Sub == true) {
                    display.setText(input1 - input2 + "");
                    Sub = false;
                }
                if (Mul == true) {
                    display.setText(input1 * input2 + "");
                    Mul = false;
                }
                if (Div == true) {
                    display.setText(input1 / input2 + "");
                    Div = false;
                }
                if (Mod == true) {
                    display.setText(input1 % input2 + "");
                    Mod = false;
                }
            }
        });
    }
}






