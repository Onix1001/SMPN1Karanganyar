package com.example.spensakra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class VisiMisiActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visimisi);

        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2020/07/visi_misi_smp-1-622x1024.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
