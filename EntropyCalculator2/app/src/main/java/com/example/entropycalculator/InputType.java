package com.example.entropycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InputType extends AppCompatActivity {

    Button fraction;
    Button decimal;
    //TextView textView;
    int no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_type);

        fraction = findViewById(R.id.fraction1);
        decimal = findViewById(R.id.decimal1);
        //textView =findViewById(R.id.textView2);
        Intent intent = getIntent();
        no = intent.getIntExtra("noOfSymbols",-1);
        //textView.setText(Integer.toString(no));

        fraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent1 = new Intent(InputType.this, FractionTotal.class);
            intent1.putExtra("noOfSymbols",no);
            startActivity(intent1);

            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(no == 2) {
                    Intent intent1 = new Intent(InputType.this, Decimal2Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    startActivity(intent1);
                }

                if(no == 3) {
                    Intent intent1 = new Intent(InputType.this, Decimal3Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    startActivity(intent1);
                }

                if(no == 4) {
                    Intent intent1 = new Intent(InputType.this, Decimal4Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    startActivity(intent1);
                }

                if(no == 5) {
                    Intent intent1 = new Intent(InputType.this, Decimal5Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    startActivity(intent1);
                }

                if(no == 6) {
                    Intent intent1 = new Intent(InputType.this, Decimal6Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    startActivity(intent1);
                }

                if(no == 7) {
                    Intent intent1 = new Intent(InputType.this, Decimal7Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    startActivity(intent1);
                }


                if(no == 8) {
                    Intent intent1 = new Intent(InputType.this, Decimal8Input.class);
                    intent1.putExtra("noOfSymbols", no);
                    startActivity(intent1);
                }
            }
        });
    }
}
