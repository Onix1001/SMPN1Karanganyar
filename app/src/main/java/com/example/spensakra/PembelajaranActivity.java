package com.example.spensakra;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spensakra.adapter.BelajarAdapter;
import com.example.spensakra.recycler.Pembelajaran;

import java.util.ArrayList;

public class PembelajaranActivity extends Activity {

    private RecyclerView recyclerView;
    private BelajarAdapter adapter;
    private ArrayList<Pembelajaran> belajarArrayList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelajaran);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new BelajarAdapter(belajarArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PembelajaranActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData() {
        belajarArrayList = new ArrayList<>();
        belajarArrayList.add(new Pembelajaran("Bahasa Indonesia"));
        belajarArrayList.add(new Pembelajaran("Bahasa Inggris"));
        belajarArrayList.add(new Pembelajaran("Bahasa Jawa"));
        belajarArrayList.add(new Pembelajaran("Bahasa Indonesia"));
    }
}
