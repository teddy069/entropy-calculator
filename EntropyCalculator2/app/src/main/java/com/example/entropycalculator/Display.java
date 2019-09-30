package com.example.entropycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Display extends AppCompatActivity implements Serializable {

    TextView dis_in2;
    TextView dis_in3;
    TextView dis_in4;
    TextView dis_in5;
    TextView dis_in6;
    TextView dis_in7;
    TextView dis_in8;
    TextView dis_in1;
    TextView dis_in9;
    TextView dis_in10;


    TextView dis_en1;
    TextView dis_en2;
    TextView dis_en3;
    TextView dis_en4;
    TextView dis_en5;
    TextView dis_en6;
    TextView dis_en7;
    TextView dis_en8;
    TextView dis_en9;
    TextView dis_en10;

    Button button;

    LinearLayout ln_2;
    LinearLayout ln_3;
    LinearLayout ln_4;
    LinearLayout ln_5;
    LinearLayout ln_6;
    LinearLayout ln_7;
    LinearLayout ln_8;
    LinearLayout ln_9;
    LinearLayout ln_10;



    TextView infoFinal;
    TextView entFinal;

    Double infoFinald = 0.0;
    Double entFinald = 0.0;

    ArrayList<Double> informationList;
    ArrayList<Double> entropyList;
    Intent intent;
    int total;

    int i = 0;

    private static DecimalFormat df2 = new DecimalFormat("#.###");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        intent = getIntent();
        total = intent.getIntExtra("noOfSymbols",-1);
        informationList = (ArrayList<Double>) getIntent().getSerializableExtra("informationValue");
        entropyList = (ArrayList<Double>) getIntent().getSerializableExtra("entropyValue");

        intiateAll();

        calculate();
        setVisibllityAll();
        displayInfoAnswers();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Display.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }

    private void setVisibllityAll() {
        dis_in1.setVisibility(View.VISIBLE);
        dis_in2.setVisibility(View.VISIBLE);
        dis_in3.setVisibility(View.VISIBLE);
        dis_in4.setVisibility(View.VISIBLE);
        dis_in5.setVisibility(View.VISIBLE);
        dis_in6.setVisibility(View.VISIBLE);
        dis_in7.setVisibility(View.VISIBLE);
        dis_in8.setVisibility(View.VISIBLE);
        dis_in9.setVisibility(View.VISIBLE);
        dis_in10.setVisibility(View.VISIBLE);

    }

    private void calculate() {

        for(Double b: informationList){
            infoFinald = infoFinald + b;
        }
        for(Double b: entropyList){
            entFinald = entFinald + b;
        }
    }


    private void displayInfoAnswers() {

        //Toast.makeText(getApplicationContext(),String.valueOf(total),Toast.LENGTH_SHORT).show();

        /*switch (total){
            case 2:
                display2();
                break;
            case 3:
                display3();
                break;
            case 4:
                display4();
                break;
            case 5:
                display5();
                break;
            case 6:
                display6();
                break;
            case 7:
                display7();
                break;
            case 8:
                display8();
                break;
            default:
                displayAll();
                break;

        }*/

        if(total == 2)
            display2();
        if(total == 3)
            display3();
        if(total == 4)
            display4();
        if(total == 5)
            display5();
        if(total == 6)
            display6();
        if(total == 7)
            display7();
        if(total == 8)
            display8();
        if(total == 9)
            display9();

        entFinal.setText(String.valueOf(df2.format(entFinald)));

        infoFinal.setText(String.valueOf(df2.format(infoFinald)));
        }

    private void display9() {


        ln_2.setVisibility(View.VISIBLE);
        ln_3.setVisibility(View.VISIBLE);
        ln_4.setVisibility(View.VISIBLE);
        ln_5.setVisibility(View.VISIBLE);
        ln_6.setVisibility(View.VISIBLE);
        ln_7.setVisibility(View.VISIBLE);
        ln_8.setVisibility(View.VISIBLE);
        ln_9.setVisibility(View.VISIBLE);
        ln_9.setVisibility(View.VISIBLE);




        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));
        dis_in3.setText(String.valueOf(df2.format(informationList.get(2))));
        dis_in4.setText(String.valueOf(df2.format(informationList.get(3))));
        dis_in5.setText(String.valueOf(df2.format(informationList.get(4))));
        dis_in6.setText(String.valueOf(df2.format(informationList.get(5))));
        dis_in7.setText(String.valueOf(df2.format(informationList.get(6))));
        dis_in8.setText(String.valueOf(df2.format(informationList.get(7))));
        dis_in9.setText(String.valueOf(df2.format(informationList.get(8))));
        dis_in10.setText(String.valueOf(df2.format(informationList.get(9))));

        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));
        dis_en3.setText(String.valueOf(df2.format(entropyList.get(2))));
        dis_en4.setText(String.valueOf(df2.format(entropyList.get(3))));
        dis_en5.setText(String.valueOf(df2.format(entropyList.get(4))));
        dis_en6.setText(String.valueOf(df2.format(entropyList.get(5))));
        dis_en7.setText(String.valueOf(df2.format(entropyList.get(6))));
        dis_en8.setText(String.valueOf(df2.format(entropyList.get(7))));
        dis_en9.setText(String.valueOf(df2.format(entropyList.get(8))));
        dis_en10.setText(String.valueOf(df2.format(entropyList.get(9))));


    }

    private void displayAll() {


        ln_2.setVisibility(View.VISIBLE);
        ln_3.setVisibility(View.VISIBLE);
        ln_4.setVisibility(View.VISIBLE);
        ln_5.setVisibility(View.VISIBLE);
        ln_6.setVisibility(View.VISIBLE);
        ln_7.setVisibility(View.VISIBLE);
        ln_8.setVisibility(View.VISIBLE);




        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));
        dis_in3.setText(String.valueOf(df2.format(informationList.get(2))));
        dis_in4.setText(String.valueOf(df2.format(informationList.get(3))));
        dis_in5.setText(String.valueOf(df2.format(informationList.get(4))));
        dis_in6.setText(String.valueOf(df2.format(informationList.get(5))));
        dis_in7.setText(String.valueOf(df2.format(informationList.get(6))));
        dis_in8.setText(String.valueOf(df2.format(informationList.get(7))));

        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));
        dis_en3.setText(String.valueOf(df2.format(entropyList.get(2))));
        dis_en4.setText(String.valueOf(df2.format(entropyList.get(3))));
        dis_en5.setText(String.valueOf(df2.format(entropyList.get(4))));
        dis_en6.setText(String.valueOf(df2.format(entropyList.get(5))));
        dis_en7.setText(String.valueOf(df2.format(entropyList.get(6))));
        dis_en8.setText(String.valueOf(df2.format(entropyList.get(7))));
    }

    private void display2() {

        ln_2.setVisibility(View.VISIBLE);

        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));



        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));


    }

    private void display3() {
        ln_2.setVisibility(View.VISIBLE);
        ln_3.setVisibility(View.VISIBLE);
;


        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));
        dis_in3.setText(String.valueOf(df2.format(informationList.get(2))));


        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));
        dis_en3.setText(String.valueOf(df2.format(entropyList.get(2))));
    }

    private void display4() {
        ln_2.setVisibility(View.VISIBLE);
        ln_3.setVisibility(View.VISIBLE);
        ln_4.setVisibility(View.VISIBLE);


        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));
        dis_in3.setText(String.valueOf(df2.format(informationList.get(2))));
        dis_in4.setText(String.valueOf(df2.format(informationList.get(3))));
      //  dis_in5.setText(String.valueOf(df2.format(informationList.get(4))));
    //    dis_in6.setText(String.valueOf(df2.format(informationList.get(5))));
  //      dis_in7.setText(String.valueOf(df2.format(informationList.get(6))));
//        dis_in8.setText(String.valueOf(df2.format(informationList.get(7))));


        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));
        dis_en3.setText(String.valueOf(df2.format(entropyList.get(2))));
        dis_en4.setText(String.valueOf(df2.format(entropyList.get(3))));


    }

    private void display5() {
        ln_2.setVisibility(View.VISIBLE);
        ln_3.setVisibility(View.VISIBLE);
        ln_4.setVisibility(View.VISIBLE);
        ln_5.setVisibility(View.VISIBLE);



        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));
        dis_in3.setText(String.valueOf(df2.format(informationList.get(2))));
        dis_in4.setText(String.valueOf(df2.format(informationList.get(3))));
        dis_in5.setText(String.valueOf(df2.format(informationList.get(4))));
    //    dis_in6.setText(String.valueOf(df2.format(informationList.get(5))));
  //      dis_in7.setText(String.valueOf(df2.format(informationList.get(6))));
//        dis_in8.setText(String.valueOf(df2.format(informationList.get(7))));


        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));
        dis_en3.setText(String.valueOf(df2.format(entropyList.get(2))));
        dis_en4.setText(String.valueOf(df2.format(entropyList.get(3))));
        dis_en5.setText(String.valueOf(df2.format(entropyList.get(4))));

    }

    private void display6() {
        ln_2.setVisibility(View.VISIBLE);
        ln_3.setVisibility(View.VISIBLE);
        ln_4.setVisibility(View.VISIBLE);
        ln_5.setVisibility(View.VISIBLE);
        ln_6.setVisibility(View.VISIBLE);

        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));
        dis_in3.setText(String.valueOf(df2.format(informationList.get(2))));
        dis_in4.setText(String.valueOf(df2.format(informationList.get(3))));
        dis_in5.setText(String.valueOf(df2.format(informationList.get(4))));
        dis_in6.setText(String.valueOf(df2.format(informationList.get(5))));
  //      dis_in7.setText(String.valueOf(df2.format(informationList.get(6))));
//        dis_in8.setText(String.valueOf(df2.format(informationList.get(7))));

        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));
        dis_en3.setText(String.valueOf(df2.format(entropyList.get(2))));
        dis_en4.setText(String.valueOf(df2.format(entropyList.get(3))));
        dis_en5.setText(String.valueOf(df2.format(entropyList.get(4))));
        dis_en6.setText(String.valueOf(df2.format(entropyList.get(5))));

    }


    private void display7() {
        ln_2.setVisibility(View.VISIBLE);
        ln_3.setVisibility(View.VISIBLE);
        ln_4.setVisibility(View.VISIBLE);
        ln_5.setVisibility(View.VISIBLE);
        ln_6.setVisibility(View.VISIBLE);
        ln_7.setVisibility(View.VISIBLE);


        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));
        dis_in3.setText(String.valueOf(df2.format(informationList.get(2))));
        dis_in4.setText(String.valueOf(df2.format(informationList.get(3))));
        dis_in5.setText(String.valueOf(df2.format(informationList.get(4))));
        dis_in6.setText(String.valueOf(df2.format(informationList.get(5))));
        dis_in7.setText(String.valueOf(df2.format(informationList.get(6))));
//        dis_in8.setText(String.valueOf(df2.format(informationList.get(7))));

        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));
        dis_en3.setText(String.valueOf(df2.format(entropyList.get(2))));
        dis_en4.setText(String.valueOf(df2.format(entropyList.get(3))));
        dis_en5.setText(String.valueOf(df2.format(entropyList.get(4))));
        dis_en6.setText(String.valueOf(df2.format(entropyList.get(5))));
        dis_en7.setText(String.valueOf(df2.format(entropyList.get(6))));


    }


    private void intiateAll() {

        dis_in1 = findViewById(R.id.dis_in1);
        dis_in2 = findViewById(R.id.dis_in2);
        dis_in3 = findViewById(R.id.dis_in3);
        dis_in4 = findViewById(R.id.dis_in4);
        dis_in5 = findViewById(R.id.dis_in5);
        dis_in6 = findViewById(R.id.dis_in6);
        dis_in7 = findViewById(R.id.dis_in7);
        dis_in8 = findViewById(R.id.dis_in8);
        dis_in9 = findViewById(R.id.dis_in9);
        dis_in10 = findViewById(R.id.dis_in10);

        dis_en1 = findViewById(R.id.dis_en1);
        dis_en2 = findViewById(R.id.dis_en2);
        dis_en3 = findViewById(R.id.dis_en3);
        dis_en4 = findViewById(R.id.dis_en4);
        dis_en5 = findViewById(R.id.dis_en5);
        dis_en6 = findViewById(R.id.dis_en6);
        dis_en7 = findViewById(R.id.dis_en7);
        dis_en8 = findViewById(R.id.dis_en8);
        dis_en9 = findViewById(R.id.dis_en9);
        dis_en10 = findViewById(R.id.dis_en10);

        ln_2 = findViewById(R.id.ds_2);
        ln_3 = findViewById(R.id.ds_3);
        ln_4 = findViewById(R.id.ds_4);
        ln_5 = findViewById(R.id.ds_5);
        ln_6 = findViewById(R.id.ds_6);
        ln_7 = findViewById(R.id.ds_7);
        ln_8 = findViewById(R.id.ds_8);
        ln_9 = findViewById(R.id.ds_9);
        ln_10 = findViewById(R.id.ds_10);


        button = findViewById(R.id.reDo1);

        infoFinal = findViewById(R.id.in_ans);
        entFinal = findViewById(R.id.en_ans);


    }

    void display8(){
        ln_2.setVisibility(View.VISIBLE);
        ln_3.setVisibility(View.VISIBLE);
        ln_4.setVisibility(View.VISIBLE);
        ln_5.setVisibility(View.VISIBLE);
        ln_6.setVisibility(View.VISIBLE);
        ln_7.setVisibility(View.VISIBLE);
        ln_8.setVisibility(View.VISIBLE);


        dis_in1.setText(String.valueOf(df2.format(informationList.get(0))));
        dis_in2.setText(String.valueOf(df2.format(informationList.get(1))));
        dis_in3.setText(String.valueOf(df2.format(informationList.get(2))));
        dis_in4.setText(String.valueOf(df2.format(informationList.get(3))));
        dis_in5.setText(String.valueOf(df2.format(informationList.get(4))));
        dis_in6.setText(String.valueOf(df2.format(informationList.get(5))));
        dis_in7.setText(String.valueOf(df2.format(informationList.get(6))));
        dis_in8.setText(String.valueOf(df2.format(informationList.get(7))));

        dis_en1.setText(String.valueOf(df2.format(entropyList.get(0))));
        dis_en2.setText(String.valueOf(df2.format(entropyList.get(1))));
        dis_en3.setText(String.valueOf(df2.format(entropyList.get(2))));
        dis_en4.setText(String.valueOf(df2.format(entropyList.get(3))));
        dis_en5.setText(String.valueOf(df2.format(entropyList.get(4))));
        dis_en6.setText(String.valueOf(df2.format(entropyList.get(5))));
        dis_en7.setText(String.valueOf(df2.format(entropyList.get(6))));
        dis_en8.setText(String.valueOf(df2.format(entropyList.get(7))));



    }
}
