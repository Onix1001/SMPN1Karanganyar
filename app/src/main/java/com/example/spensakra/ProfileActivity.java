package com.example.spensakra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

public class ProfileActivity extends Activity {

    CardView sambutan, visimisi, sertifikasi, sejarah, struktur_organisasi, program_kerja;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        sambutan = findViewById(R.id.sambutan);
        visimisi = findViewById(R.id.visi_misi);
        sertifikasi = findViewById(R.id.sertifikasi);
        sejarah = findViewById(R.id.sejarah_sekolah);
        struktur_organisasi = findViewById(R.id.struktur_organisasi);
        program_kerja = findViewById(R.id.program_kerja);

        sambutan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, SambutanAvtivity.class);
                startActivity(intent);
            }
        });
        visimisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, VisiMisiActivity.class);
                startActivity(intent);
            }
        });
        sertifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, SertifikasiActivity.class);
                startActivity(intent);
            }
        });
        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, SejarahActivity.class);
                startActivity(intent);
            }
        });
        struktur_organisasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, StrOrganisasiActivity.class);
                startActivity(intent);
            }
        });
        program_kerja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, ProkerActivity.class);
                startActivity(intent);
            }
        });


    }
}
