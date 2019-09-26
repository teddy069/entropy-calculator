package com.example.entropycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Decimal2Input extends AppCompatActivity {

    EditText de_2_edit1;
    EditText de_2_edit2;
    //EditText de_2_edit3;
    //EditText de_4_edit4;
    //EditText de_4_edit5;
    //EditText de_5_edit6;
    //EditText de_6_edit7;
    //EditText de_7_edit8;
    TextView tempError;

    double a=0.0d,b=0.0d,c=0.0d,d=0.0d,e=0.0d,f=0.0d,g=0.0d,h=0.0d;
    DecimalFormat df2 = new DecimalFormat("#.###");

    Intent intent;
    int no;
    //String temp;

    Button button;
    Intent intent1;

    ArrayList<Double> arrayList;
    ArrayList<Double> entropyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal2_input);

        arrayList = new ArrayList<>();

        initiateAllElements();

        intent = getIntent();
        no = intent.getIntExtra("noOfSymbols", -1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                storeAllValues();
            }
        });



    }





    private void initiateAllElements(){
        de_2_edit1 = findViewById(R.id.de_2_edit1);
        de_2_edit2 = findViewById(R.id.de_2_edit2);
        //de_3_edit3 = findViewById(R.id.de_3_edit3);
        //de_4_edit4 = findViewById(R.id.de_4_edit4);
        //de_4_edit5 = findViewById(R.id.de_6_edit5);
        //de_5_edit6 = findViewById(R.id.de_6_edit6);
        //de_7_edit7 = findViewById(R.id.de_7_edit7);
        //de_8_edit8 = findViewById(R.id.de_8_edit8);

        tempError = findViewById(R.id.de_error2);
        button = findViewById(R.id.de_2_next);
    }

    private void storeAllValues() {

        try{
            a = Double.parseDouble(de_2_edit1.getText().toString());
            b = Double.parseDouble(de_2_edit2.getText().toString());
            //c = Double.parseDouble(de_3_edit3.getText().toString());
            //d = Double.parseDouble(de_4_edit4.getText().toString());
            //e = Double.parseDouble(de_5_edit5.getText().toString());
            //f = Double.parseDouble(de_5_edit6.getText().toString());
            //g = Double.parseDouble(de_7_edit7.getText().toString());
            //h = Double.parseDouble(de_7_edit8.getText().toString());



            calulate();

            intent1 = new Intent(Decimal2Input.this, Display.class);
            intent1.putExtra("informationValue",arrayList);
            intent1.putExtra("entropyValue",entropyList);
            intent1.putExtra("noOfSymbols", no);
            startActivity(intent1);

        }
        catch(Exception e){
            e.printStackTrace();
            tempError.setVisibility(View.VISIBLE);
        }


    }

    private void calulate() {


        double tempValue;

        tempValue = -3.31*Math.log10(a);
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = -3.31*Math.log10(b);
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        /*tempValue = -3.31*Math.log10(c);
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = -3.31*Math.log10(d);
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = -3.31*Math.log10(e);
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = -3.31*Math.log10(f);
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = -3.31*Math.log10(g);
        arrayList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = -3.31*Math.log10(h);
        arrayList.add(Double.parseDouble(df2.format(tempValue)));*/


        //Entropy Calculation

        tempValue = a*arrayList.get(0);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = b*arrayList.get(1);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        /*tempValue = c*arrayList.get(2);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = d*arrayList.get(3);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = e*arrayList.get(4);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = f*arrayList.get(5);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = g*arrayList.get(6);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));

        tempValue = h*arrayList.get(7);
        entropyList.add(Double.parseDouble(df2.format(tempValue)));*/




    }
}
