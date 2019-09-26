package com.example.entropycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText noOfSymbols;
    Button nextButton;
    int no;
    TextView textView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noOfSymbols = findViewById(R.id.editText);
        nextButton = findViewById(R.id.button);
        textView = findViewById(R.id.textView4);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    no = Integer.parseInt(noOfSymbols.getText().toString());
                }
                catch(Exception e) {

                    textView.setVisibility(View.VISIBLE);

                }

                if(no >= 2 && no <= 8) {
                    intent = new Intent(MainActivity.this, InputType.class);
                    intent.putExtra("noOfSymbols", no);
                    startActivity(intent);
                }
                else{
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
