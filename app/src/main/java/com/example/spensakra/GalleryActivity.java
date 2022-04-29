package com.example.spensakra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.example.spensakra.eskul.CakramActivity;
import com.example.spensakra.eskul.JurnalistikActivity;
import com.example.spensakra.eskul.PMRActivity;

public class GalleryActivity extends Activity {

    CardView cakram, jurnal, pmr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        cakram = findViewById(R.id.cakram);
        jurnal = findViewById(R.id.jurnalistik);
        pmr = findViewById(R.id.pmr);

        cakram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this, CakramActivity.class);
                startActivity(intent);
            }
        });
        jurnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this, JurnalistikActivity.class);
                startActivity(intent);
            }
        });
        pmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this, PMRActivity.class);
                startActivity(intent);
            }
        });
    }
}
