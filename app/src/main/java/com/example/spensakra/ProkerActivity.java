package com.example.spensakra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class ProkerActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proker);

        ImageView imageView = findViewById(R.id.programkerja);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2020/05/program-kerja-718x1024.jpeg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
