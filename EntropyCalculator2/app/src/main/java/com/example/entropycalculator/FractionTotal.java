package com.example.entropycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FractionTotal extends AppCompatActivity {

    int no;
    Button button;
    EditText editText;
    int total;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraction_total);

        Intent intent = getIntent();
        no = intent.getIntExtra("noOfSymbols",-1);

        button = findViewById(R.id.totalButton1);
        editText = findViewById(R.id.editText1);
        textView = findViewById(R.id.tempError);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    total = Integer.parseInt(editText.getText().toString());
                }
                catch(Exception e)
                {
                    textView.setVisibility(View.VISIBLE);
                }
                if(no == 2) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction2Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }

                if(no == 3) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction3Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }

                if(no == 4) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction4Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }

                if(no == 5) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction5Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }

                if(no == 6) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction6Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }
                if(no == 7) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction7Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }

                if(no == 8) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction8Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }

                if(no == 9) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction9Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }

                if(no == 10) {
                    Intent intent1 = new Intent(FractionTotal.this, Fraction10Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    intent1.putExtra("fractionTotal", total);
                    startActivity(intent1);
                }


            }
        });


    }
}
