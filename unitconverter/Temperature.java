package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {
    private Button CtoF,FtoC;
    private TextView result;
    private EditText enterTemp;
    Double result0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        CtoF=(Button)findViewById(R.id.CtoF);
        FtoC=(Button)findViewById(R.id.FtoC);
        result=(TextView) findViewById(R.id.result);
        enterTemp=(EditText) findViewById(R.id.entertemp);

        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp *1.8) + 32;
                result.setText(String.valueOf(result0));
            }
        });
        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp - 32) / 1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}
