package com.example.session4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OpenItem extends AppCompatActivity {
    private TextView tna,tnu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_item);
        Intent intent = getIntent();
        String name = intent.getStringExtra("nameee");
        String numb = intent.getStringExtra("nmmmmm");
        tna=findViewById(R.id.naaa);
        tnu=findViewById(R.id.nuuuuu);
        tna.setText(name);
        tnu.setText(numb);

    }

    public void bac(View view) {
        Intent i=new Intent(OpenItem.this,Contact.class);
        startActivity(i);
    }
}