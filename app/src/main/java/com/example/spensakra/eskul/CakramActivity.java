package com.example.spensakra.eskul;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.spensakra.R;

public class CakramActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakram);

        ImageView imageView = findViewById(R.id.cakram1);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2022/04/20211111115312_IMG_5118-1024x768.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
        ImageView imageView2 = findViewById(R.id.cakram2);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2022/04/20211111115322_IMG_5119-1024x768.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);
    }
}
