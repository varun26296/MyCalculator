package com.varunbadgujar.mycalculator;

import android.content.Context;
import android.renderscript.ScriptGroup;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import static com.varunbadgujar.mycalculator.R.id.EditTextNo1;
import static com.varunbadgujar.mycalculator.R.id.add;
import static com.varunbadgujar.mycalculator.R.id.dataBinding;

public class MainActivity extends AppCompatActivity {


    EditText edtno1, edtope, edtno2, edtres;
    String evalue, curr;
    int curract;
    Button no1, no2, no3, no4, no5, no6, no7, no8, no9, no0, btnadd, btnsub, btnmul, btndiv, bspace, btndot;
    FloatingActionButton fab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtno1 = (EditText) findViewById(R.id.EditTextNo1);
        edtope = (EditText) findViewById(R.id.EditTextOperand);
        edtno2 = (EditText) findViewById(R.id.EditTextNo2);
        edtres = (EditText) findViewById(R.id.ResultDisplay);
        no1 = (Button) findViewById(R.id.no1);
        no2 = (Button) findViewById(R.id.no2);
        no3 = (Button) findViewById(R.id.no3);
        no4 = (Button) findViewById(R.id.no4);
        no5 = (Button) findViewById(R.id.no5);
        no6 = (Button) findViewById(R.id.no6);
        no7 = (Button) findViewById(R.id.no7);
        no8 = (Button) findViewById(R.id.no8);
        no9 = (Button) findViewById(R.id.no9);
        no0 = (Button) findViewById(R.id.no0);
        btnadd = (Button) findViewById(R.id.addbt);
        btnsub = (Button) findViewById(R.id.subbt);
        btnmul = (Button) findViewById(R.id.mulbt);
        btndiv = (Button) findViewById(R.id.divbt);
        bspace = (Button) findViewById(R.id.backspace);
        btndot = (Button) findViewById(R.id.dotbt);
        fab1 = findViewById(R.id.floatingActionButton2);


        final String[] num1 = {edtno1.getText().toString().trim()};
        final String[] num2 = {edtno2.getText().toString().trim()};
        String operand = edtope.getText().toString().trim();
        final String[] result = {edtres.getText().toString().trim()};
        final int Add = '1';
        final int Sub = '2';
        final int Mul = '3';
        final int Div = '4';
        Editable curract;


        Log.i("VAR", "String");


        edtno1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                evalue = "1";

            }
        });

        edtno2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                evalue = "2";
            }
        });

        edtope.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                evalue = "3";
            }
        });


        Log.i("VAR", "edtno12");


        edtno1.setShowSoftInputOnFocus(false);

        edtno2.setShowSoftInputOnFocus(false);

        edtope.setShowSoftInputOnFocus(false);

        edtres.setShowSoftInputOnFocus(false);

        if (edtno1.getText().length() > 0 ) {
            edtno1.setSelection(edtno1.getText().length());
        }

        if (edtno2.getText().length() > 0 ) {
            edtno2.setSelection(edtno2.getText().length());
        }

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "1");
                else
                    edtno2.setText(edtno2.getText() + "1");

            }
        });

        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "2");
                else
                    edtno2.setText(edtno2.getText() + "2");

            }
        });


        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "3");
                else
                    edtno2.setText(edtno2.getText() + "3");

            }
        });

        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "4");
                else
                    edtno2.setText(edtno2.getText() + "4");

            }
        });

        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "5");
                else
                    edtno2.setText(edtno2.getText() + "5");

            }
        });

        Log.i("VAR", "no5");


        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "6");
                else
                    edtno2.setText(edtno2.getText() + "6");

            }
        });

        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "7");
                else
                    edtno2.setText(edtno2.getText() + "7");

            }
        });

        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "8");
                else
                    edtno2.setText(edtno2.getText() + "8");

            }
        });

        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "9");
                else
                    edtno2.setText(edtno2.getText() + "9");

            }
        });

        no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + "0");
                else
                    edtno2.setText(edtno2.getText() + "0");

            }
        });


        Log.i("VAR", "no510");

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (evalue.equals("3"))
                    edtope.setText(edtope.getText() + "+");

            }
        });


        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (evalue.equals("3"))
                    edtope.setText(edtope.getText() + "-");


            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (evalue.equals("3"))
                    edtope.setText(edtope.getText() + "*");


            }
        });


        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (evalue.equals("3"))
                    edtope.setText(edtope.getText() + "/");


            }
        });


        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (evalue.equals("1"))
                    edtno1.setText(edtno1.getText() + ".");
                else
                    edtno2.setText(edtno2.getText() + ".");

            }
        });


        bspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = edtno1.getText().toString().trim();
                String num2 = edtno2.getText().toString().trim();
                String operand = edtope.getText().toString().substring(0);

                if (evalue.equals("1")) {
                    num1 = num1.substring(0, num1.length() - 2);
                    edtno1.setText(num1);
                } else if (evalue.equals("2")) {
                    num2 = num2.substring(0, num2.length() - 2);
                    edtno2.setText(num2);
                } else {
                    edtope.setText("");
                    Log.i("VAR", "==>" + operand);
                }


            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String num1 = edtno1.getText().toString().trim();
                String num2 = edtno2.getText().toString().trim();
                String operand = edtope.getText().toString().substring(0);
                float res;
                String result;

                float n1 = Float.parseFloat(num1);
                float n2 = Float.parseFloat(num2);


                if (edtno1.equals("") || edtope.equals("") || edtno2.equals("")) {

                    Toast.makeText(getApplicationContext(), "Please Fill in all the fields", Toast.LENGTH_SHORT).show();

                    if (edtno1.equals(""))
                        edtno1.setError("Fill here");

                    if (edtno2.equals(""))
                        edtno2.setError("Fill here");

                    if (edtope.equals(""))
                        edtope.setError("Fill here");

                } else {

                    if (n1 == 0 || n2 == 0)
                        Toast.makeText(getApplicationContext(), "NOS should not be zero", Toast.LENGTH_SHORT).show();
                    else {

                        switch (operand) {
                            case "+":
                                res = n1 + n2;
                                result = Float.toString(res);
                                edtres.setText(result);
                                break;
                            case "-":
                                res = n1 - n2;
                                result = Float.toString(res);
                                edtres.setText(result);
                                break;
                            case "*":
                                res = n1 * n2;
                                result = Float.toString(res);
                                edtres.setText(result);
                                break;
                            case "/":
                                res = n1 / n2;
                                result = Float.toString(res);
                                edtres.setText(result);
                                break;
                        }

                    }
                }


            }


        });







        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.resetmenu){
            edtno1.setText("");
            edtope.setText("");
            edtno2.setText("");
            edtres.setText("");
        }
        if (item.getItemId() == R.id.homemenu){
           finish();
            System.exit(0);
        }




        return super.onOptionsItemSelected(item);
    }
}



