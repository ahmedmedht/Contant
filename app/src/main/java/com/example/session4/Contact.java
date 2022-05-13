package com.example.session4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

public class Contact extends AppCompatActivity implements CustomRecyclerAdapter.onclickitemlis {
    private RecyclerView recyclerView;
    private CustomRecyclerAdapter adapter;
    private ArrayList<PixaBayModel> data;
    private RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        data = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerTest);
        adapter = new CustomRecyclerAdapter(data);
        recyclerView.setAdapter(adapter);
        adapter.setitemclick(this::onclicklis);
        requestQueue = Volley.newRequestQueue(this);
        data.add(new PixaBayModel("01119486003","md7t"));
        data.add(new PixaBayModel("01155084929","samy"));
        data.add(new PixaBayModel("01001460339","zayed"));
        data.add(new PixaBayModel("01555708643","omar"));
        data.add(new PixaBayModel("01158859622","bibo"));
        data.add(new PixaBayModel("01011838813","hisham"));
        data.add(new PixaBayModel("01096442677","bnha"));
        Intent intent = getIntent();
        String name = intent.getStringExtra("nameee");
        String numb = intent.getStringExtra("nmmmmm");
        data.add(new PixaBayModel(numb,name));


// check current state of a Switch (true or false).


    }

    @Override
    public void onclicklis(int pos) {
        String nn=data.get(pos).comments;
        String na=data.get(pos).userName;
        Intent intent = new Intent(getApplicationContext(), OpenItem.class);
        intent.putExtra("nameee",na);
        intent.putExtra("nmmmmm",nn);
        Toast.makeText(getApplicationContext(), "pos = "+na, Toast.LENGTH_SHORT).show();
        startActivity(intent);


    }

    public void bac(View view) {
        Intent i=new Intent(Contact.this,MainActivity.class);
        startActivity(i);
    }
}