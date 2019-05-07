package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bit extends AppCompatActivity {
    private Button bytob,btoby;
    private TextView result;
    private EditText enter;
    Double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bit);
        bytob=(Button)findViewById(R.id.bytob );
        btoby=(Button)findViewById(R.id.btoby);
        result=(TextView) findViewById(R.id.result);
        enter=(EditText) findViewById(R.id.enter);

        bytob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ans = Double.parseDouble(enter.getText().toString());
                result0 = (ans *8);
                result.setText(String.valueOf(result0));
            }
        });
        btoby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ans = Double.parseDouble(enter.getText().toString());
                result0 = (ans /8);
                result.setText(String.valueOf(result0));
            }
        });
    }
}
