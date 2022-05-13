package com.example.session4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCon extends AppCompatActivity {
    EditText name,num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_con);
        name=findViewById(R.id.editname);
        num=findViewById(R.id.editnum);
    }

    public void addddd(View view) {
        String nam=name.getText().toString();
        String nm=num.getText().toString();
        Intent intent = new Intent(getApplicationContext(), Contact.class);
        intent.putExtra("nameee",nam);
        intent.putExtra("nmmmmm",nm);
        startActivity(intent);
    }
}