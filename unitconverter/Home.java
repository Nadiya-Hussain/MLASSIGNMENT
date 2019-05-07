package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Home extends AppCompatActivity {
    CardView currency,weight,temperature,bit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent c=getIntent();

        currency=(CardView)findViewById(R.id.currency);
        weight=(CardView) findViewById(R.id.weight);
        temperature=(CardView)findViewById(R.id.temperature);
        bit=(CardView) findViewById(R.id.bit);
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cur=new Intent(Home.this,Currency.class);
                startActivity(cur);
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cur=new Intent(  Home.this,Weight.class);
                startActivity(cur);
            }
        });
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cur=new Intent(Home.this,Temperature.class);
                startActivity(cur);
            }
        });
        bit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cur=new Intent(Home.this,bit.class);
                startActivity(cur);
            }
        });

        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


