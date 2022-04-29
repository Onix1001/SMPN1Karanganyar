package com.example.spensakra.eskul;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.spensakra.R;

public class PMRActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmr);

        ImageView imageView = findViewById(R.id.pmr1);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2022/04/WhatsApp-Image-2022-04-02-at-9.58.41-AM-1024x768.jpeg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
        ImageView imageView2 = findViewById(R.id.pmr2);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2022/04/WhatsApp-Image-2022-04-02-at-9.58.41-AM-300x225.jpeg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);
    }
}
