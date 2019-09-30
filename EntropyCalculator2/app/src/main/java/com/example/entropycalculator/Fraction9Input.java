package com.example.entropycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Fraction9Input extends AppCompatActivity {

    EditText fra_9_edit1;
    EditText fra_9_edit2;
    EditText fra_9_edit3;
    EditText fra_9_edit4;
    EditText fra_9_edit5;
    EditText fra_9_edit6;
    EditText fra_9_edit7;
    EditText fra_9_edit8;
    EditText fra_9_edit9;

    double a=0.0d,b=0.0d,c=0.0d,d=0.0d,e=0.0d,f=0.0d,g=0.0d,h=0.0d,i=0.0d;

    DecimalFormat df2 = new DecimalFormat("#.###");

    TextView fra_9_text1;
    TextView fra_9_text2;
    TextView fra_9_text3;
    TextView fra_9_text4;
    TextView fra_9_text5;
    TextView fra_9_text6;
    TextView fra_9_text7;
    TextView fra_9_text8;
    TextView fra_9_text9;
    TextView tempError;
    Intent intent;
    int no, total;
    String temp;

    Button button;
    Intent intent1;

    ArrayList<Double> arrayList;
    ArrayList<Double> entropyList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraction9_input);

        arrayList = new ArrayList<>();
        entropyList = new ArrayList<>();
        initiateAllElements();

        intent = getIntent();
        no = intent.getIntExtra("noOfSymbols",-1);
        total = intent.getIntExtra("fractionTotal",-1);

        temp = "/"+total;
        fra_9_text1.setText(temp);
        fra_9_text2.setText(temp);
        fra_9_text3.setText(temp);
        fra_9_text4.setText(temp);
        fra_9_text5.setText(temp);
        fra_9_text6.setText(temp);
        fra_9_text7.setText(temp);
        fra_9_text8.setText(temp);
        fra_9_text9.setText(temp);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                storeAllValues();



            }
        });





    }


    private void calulate() {

        double total = this.total;
        double tempValue;
        double div;
        //double loger;
        //Toast.makeText(getApplicationContext(),String.valueOf(total),Toast.LENGTH_SHORT).show();

        div = Math.log10(a/total);
        //Toast.makeText(getApplicationContext(),String.valueOf(div),Toast.LENGTH_SHORT).show();
        tempValue = -3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));
        //Toast.makeText(getApplicationContext(),String.valueOf(tempValue),Toast.LENGTH_SHORT).show();

        div = Math.log10(b/total);
        tempValue = -3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        div = Math.log10(c/total);
        tempValue = -3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        div = Math.log10(d/total);
        tempValue =-3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        div = Math.log10(e/total);
        tempValue =-3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        div = Math.log10(f/total);
        tempValue =-3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        div = Math.log10(g/total);
        tempValue =-3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        div = Math.log10(h/total);
        tempValue =-3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        div = Math.log10(i/total);
        tempValue =-3.31 * div;
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        //Entropy calculation
        tempValue = (a/total)* arrayList.get(0);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = (b/total)* arrayList.get(1);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = (c/total)* arrayList.get(2);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = (d/total)* arrayList.get(3);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = (e/total)* arrayList.get(4);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = (f/total)* arrayList.get(5);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = (g/total)* arrayList.get(6);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = (h/total)* arrayList.get(7);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = (i/total)* arrayList.get(8);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));


    }


    private void storeAllValues() {

        try{
            a = Integer.parseInt(fra_9_edit1.getText().toString());
            b = Integer.parseInt(fra_9_edit2.getText().toString());
            c = Integer.parseInt(fra_9_edit3.getText().toString());
            d = Integer.parseInt(fra_9_edit4.getText().toString());
            e = Integer.parseInt(fra_9_edit5.getText().toString());
            f = Integer.parseInt(fra_9_edit6.getText().toString());
            g = Integer.parseInt(fra_9_edit7.getText().toString());
            h = Integer.parseInt(fra_9_edit8.getText().toString());
            i = Integer.parseInt(fra_9_edit9.getText().toString());



            calulate();
            if((a+b+c+d+e+f+g+h+i)/total == 1.0) {
                intent1 = new Intent(Fraction9Input.this, Display.class);
                intent1.putExtra("informationValue", arrayList);
                intent1.putExtra("entropyValue", entropyList);
                intent1.putExtra("noOfSymbols", no);
                startActivity(intent1);
            }
            else{
                tempError.setVisibility(View.VISIBLE);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            tempError.setVisibility(View.VISIBLE);
        }


    }

    private void initiateAllElements() {

        fra_9_edit1 = findViewById(R.id.fra_9_edit1);
        fra_9_edit2 = findViewById(R.id.fra_9_edit2);
        fra_9_edit3 = findViewById(R.id.fra_9_edit3);
        fra_9_edit4 = findViewById(R.id.fra_9_edit4);
        fra_9_edit5 = findViewById(R.id.fra_9_edit5);
        fra_9_edit6 = findViewById(R.id.fra_9_edit6);
        fra_9_edit7 = findViewById(R.id.fra_9_edit7);
        fra_9_edit8 = findViewById(R.id.fra_9_edit8);
        fra_9_edit9 = findViewById(R.id.fra_9_edit9);

        fra_9_text1 = findViewById(R.id.fra_9_text1);
        fra_9_text2 = findViewById(R.id.fra_9_text2);
        fra_9_text3 = findViewById(R.id.fra_9_text3);
        fra_9_text4 = findViewById(R.id.fra_9_text4);
        fra_9_text5 = findViewById(R.id.fra_9_text5);
        fra_9_text6 = findViewById(R.id.fra_9_text6);
        fra_9_text7 = findViewById(R.id.fra_9_text7);
        fra_9_text8 = findViewById(R.id.fra_9_text8);
        fra_9_text9 = findViewById(R.id.fra_9_text9);
        tempError = findViewById(R.id.tempError9);

        button = findViewById(R.id.fra_9_next);


    }
}
