package com.example.interview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class resultActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapterfile adapterfile;
    List<EmailNumber> emailNumbers=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        recyclerView = findViewById(R.id.result);
        emailNumbers=getIntent().getExtras().getParcelableArrayList("emailNumbers");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(resultActivity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapterfile = new Adapterfile(resultActivity.this,emailNumbers);
        recyclerView.setAdapter(adapterfile);

    }
}