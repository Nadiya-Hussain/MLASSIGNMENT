package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Weight extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private Button btnSubmit;
    private EditText from;
    private TextView to;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        btnSubmit = (Button) findViewById(R.id.button);
        from = (EditText) findViewById(R.id.edt);
        to = (TextView) findViewById(R.id.text);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list1 = new ArrayList<String>();
        list1.add("Inches");
        list1.add("Feet");
        list1.add("Yard");
        list1.add("Miles");
        list1.add("Milimeter");
        list1.add("Centimeter");
        list1.add("Meter");
        list1.add("Kilometer");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);


        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list2 = new ArrayList<String>();
        list2.add("Inches");
        list2.add("Feet");
        list2.add("Yard");
        list2.add("Miles");
        list2.add("Milimeter");
        list2.add("Centimeter");
        list2.add("Meter");
        list2.add("Kilometer");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index1 = spinner1.getSelectedItemPosition();
                int index2 = spinner2.getSelectedItemPosition();
                float value = Float.parseFloat(from.getText().toString());

        float ratio[] = {0.393701f, 0.0328084f, 0.0109361f, 6.21371e-6f, 10.0f, 1.0f, 0.01f, 1.0e-5f};
        float result = value / ratio[index1] * ratio[index2];
        to.setText(result + "");
            }
        });
    }


}
