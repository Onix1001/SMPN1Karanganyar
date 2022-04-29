package com.example.spensakra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

public class DatabaseActivity extends Activity {

    CardView guru, siswa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        guru = findViewById(R.id.guru);
        siswa = findViewById(R.id.data_siswa);

        guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DatabaseActivity.this, GuruActivity.class);
                startActivity(intent);
            }
        });
        siswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DatabaseActivity.this, SiswaActivity.class);
                startActivity(intent);
            }
        });
    }
}
