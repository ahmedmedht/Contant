package com.example.session4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Main Activity 2 de kont ba4r7 l7d 7aga lakn hya me4 goz2 men el project




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void open(View view) {
        Intent i=new Intent(MainActivity.this, Contact.class);
        startActivity(i);
    }

    public void addd(View view) {
        Intent i=new Intent(MainActivity.this, AddCon.class);
        startActivity(i);
    }


}

