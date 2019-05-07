package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Currency extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private Button convert;
    private EditText currency;
    private TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        convert = (Button) findViewById(R.id.button);
        currency = (EditText) findViewById(R.id.edt);
         answer = (TextView)findViewById(R.id.ans);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list1 = new ArrayList<String>();
        list1.add("Dollar");
        list1.add("Euro");
        list1.add("Riyal");
        list1.add("yen");
        list1.add("Dirham");
        list1.add("Dinar");
        list1.add("Pound");
        list1.add("Rupee");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);


        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list2 = new ArrayList<String>();
        list2.add("Dollar");
        list2.add("Euro");
        list2.add("Riyal");
        list2.add("yen");
        list2.add("Dirham");
        list2.add("Dinar");
        list2.add("Pound");
        list2.add("Rupee");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index1 = spinner1.getSelectedItemPosition();
                int index2 = spinner2.getSelectedItemPosition();
                float value = Float.parseFloat(currency.getText().toString());
                float curr[] = {69.1060f,77.4604f, 18.4282f, 0.6222f,18.8171f, 49.5468f, 90.8926f, 1.00f};
                float result = value * curr[index1] / curr[index2];
                String res=String.valueOf(result);
               answer.setText(""+res);

               Toast.makeText(Currency.this, res, Toast.LENGTH_SHORT).show();
            }
        });



    }

}

