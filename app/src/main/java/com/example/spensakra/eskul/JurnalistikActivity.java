package com.example.spensakra.eskul;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.spensakra.R;

public class JurnalistikActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jurnal);

        ImageView imageView = findViewById(R.id.jurnal1);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2022/04/IMG_0005-300x200.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
        ImageView imageView2 = findViewById(R.id.jurnal2);
        Glide.with(this)
                .load("https://smpnsakra.sch.id/wp-content/uploads/2022/04/IMG_0012-300x200.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);
    }
}
