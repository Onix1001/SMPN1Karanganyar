package com.example.spensakra;

import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    CardView profile, database, pembelajaran, gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile = findViewById(R.id.profile);
        database = findViewById(R.id.database);
        pembelajaran = findViewById(R.id.pembelajaran);
        gallery = findViewById(R.id.gallery);

        profile.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
        database.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DatabaseActivity.class);
            startActivity(intent);
        });
        pembelajaran.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PembelajaranActivity.class);
            startActivity(intent);
        });
        gallery.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
            startActivity(intent);
        });
    }
}