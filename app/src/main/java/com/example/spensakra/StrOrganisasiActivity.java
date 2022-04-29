package com.example.spensakra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class StrOrganisasiActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struktur_organisasi);

        ImageView imageView = findViewById(R.id.proker1);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2021/07/1c5650d2952a407ea974aa7a1724d4d1-0001-edited-1536x995.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
        ImageView imageView2 = findViewById(R.id.proker2);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2021/07/64af4073b8af4141b8536e3d0b1fdcea-0001-edited-1081x1536.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);
        ImageView imageView3 = findViewById(R.id.proker3);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2021/07/a2aa4657d36a43afade118e4f902af10-0001-edited-1535x2048.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);
        ImageView imageView4 = findViewById(R.id.proker4);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2021/07/697f1beccccd4a908c5f86563872cdb0-0001-edited-1.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView4);
    }
}
