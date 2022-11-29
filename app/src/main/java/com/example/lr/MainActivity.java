package com.example.lr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#f00", "Sancocho", "maiz, papas"));
        elements.add(new ListElement("#FF1744", "Bandera", "arroz blanco"));
        elements.add(new ListElement("#D500F9", "Mangu Power", "platano verde"));
        elements.add(new ListElement("#9FA8DA", "Ensalada verde", "repollo"));

        ListAdapter adapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listReciclyview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}