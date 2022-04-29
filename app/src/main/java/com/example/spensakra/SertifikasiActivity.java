package com.example.spensakra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class SertifikasiActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sertifikasi);

        ImageView imageView = findViewById(R.id.sertifikat);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2022/02/WhatsApp-Image-2022-02-01-at-12.19.45-PM-1024x730.jpeg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
