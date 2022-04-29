package com.example.spensakra;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.spensakra.adapter.GuruAdapter;

import java.util.ArrayList;

public class GuruActivity extends Activity {

    ArrayList<String> ImgUrl= new ArrayList<>();
    ArrayList<String> Nama= new ArrayList<>();
    RecyclerView recyclerView;
    LinearLayoutManager Manager;
    GuruAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru);

        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/05/Ambar-Tri-Hartono-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Amin-Hartitik-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Apri-Nilawati-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Asri-Wiharsih-SPd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/CCB.-Kuncorowati-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Dra.-Nestri-Anconowati-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Dra.-Sri-Subekti-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Dra.-Sri-Sunarni-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/Drs.-Agus-Solih.-NS-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/05/Drs-Dradjad-Sri-Widodo-MM-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Drs.-Edy-Purwanto-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Drs.-Muh-Fatkhan-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Drs.Bambang-Budi-Waluyo-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/WhatsApp-Image-2020-08-04-at-08.22.00.jpeg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Dwi-Sulistyani-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/Emi-Wijayanti-M.Pd_-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/EndiMarpuji-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Fatmi-Indratti-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/Febrina-Nur-Dina-S.-PdT-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Fitria-Kusuma-Wardani-S.-Ag.-M.-Ag.I-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Haryanto-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Hensy-Toviani-SS-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Hiu-Warihening-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/Intan-Ayu-Permatasari-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Marsiana-TW.-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/ME.-Endang-Werdiningsih-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Muh.-Jarir-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Muh.-Wasil-Aziz-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Nur-Hidayati-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Nur-Kumalasari-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/Nury-Tri-Astuti.-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/WhatsApp-Image-2020-08-04-at-08.21.59.jpeg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Rina-Listyawati-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/Sad-Dewi-Murni-S.-Sn-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Saraswati-Ekoningrum-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Siti-Samsiati-S.-Ag-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/Siti-Sulastri-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/WhatsApp-Image-2020-08-04-at-08.21.57.jpeg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Sri-Astuti-Handayani-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Sri-Sumana-Dewi-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Sri-Sundari-S.-Pd.-M.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Sri-Winarni-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/WhatsApp-Image-2020-08-04-at-08.21.59-1.jpeg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/05/Sudarsi-Heru-Ekowati-S.-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Sujarwo-S.-Pd.-M.-Si-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/WhatsApp-Image-2020-08-04-at-08.22.00-1.jpeg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Suprapti-SS-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/08/Suradi-S-Pd-scaled.jpg");
        ImgUrl.add("http://smpnsakra.sch.id/wp-content/uploads/2020/06/Suramto-S.-Pd-scaled.jpg");

        Nama.add("Ambar Tri Hartono, S. Pd");
        Nama.add("AMIN HARTITIK, S. PD");
        Nama.add("Apri Nilawati, S. Pd");
        Nama.add("Asri Wiharsih, SPd");
        Nama.add("CCB. Kuncorowati, S. Pd");
        Nama.add("Dra. Nestri Anconowati");
        Nama.add("Dra. Sri Subekti");
        Nama.add("Dra. Sri Sunarni");
        Nama.add("Drs. Agus Solih. NS");
        Nama.add("Drs. Dradjad Sri Widodo, MM");
        Nama.add("Drs. Edy Purwanto");
        Nama.add("Drs. Muh Fatkhan");
        Nama.add("Drs.Bambang Budi Waluyo");
        Nama.add("Dwi Purnomo, S. Pd");
        Nama.add("Dwi Sulistyani, S. Pd");
        Nama.add("Emi Wijayanti, M.Pd");
        Nama.add("EndiMarpuji, S. Pd");
        Nama.add("Fatmi Indratti, S. Pd");
        Nama.add("Febrina Nur Dina, S. PdT");
        Nama.add("Fitria Kusuma Wardani, S. Ag., M. Ag.I");
        Nama.add("Haryanto, S. Pd");
        Nama.add("Hensy Toviani, SS");
        Nama.add("Hiu Warihening, S. Pd");
        Nama.add("Intan Ayu Permatasari, S. Pd");
        Nama.add("Marsiana TW., S. Pd");
        Nama.add("ME. Endang Werdiningsih");
        Nama.add("Muh. Jarir, S. Pd");
        Nama.add("Muh. Wasil Aziz, S. Pd");
        Nama.add("Nur Hidayati, S. Pd");
        Nama.add("Nur Kumalasari, S. Pd");
        Nama.add("Nury Tri Astuti. S. Pd");
        Nama.add("Puji Istrini, S. Pd");
        Nama.add("Rina Listyawati, S. Pd");
        Nama.add("Sad Dewi Murni, S. Sn");
        Nama.add("Saraswati Ekoningrum, S. Pd");
        Nama.add("Siti Samsiati, S. Ag");
        Nama.add("Siti Sulastri, S. Pd");
        Nama.add("Siwi Margiyati");
        Nama.add("Sri Astuti Handayani, S. Pd");
        Nama.add("Sri Sumana Dewi, S. Pd");
        Nama.add("Sri Sundari, S. Pd., M. Pd");
        Nama.add("Sri Winarni");
        Nama.add("Sriyono, S.Ag");
        Nama.add("Sudarsi Heru Ekowat, S.Pd.");
        Nama.add("Sujarwo, S. Pd., M. Si");
        Nama.add("Sunarni, S.Pd");
        Nama.add("Suprapti, SS, M. Pd");
        Nama.add("Suradi, S, Pd");
        Nama.add("Suramto, S. Pd");

        this.recyclerView = (RecyclerView)findViewById(R.id.rvguru);
        Manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(Manager);
        adapter = new GuruAdapter(ImgUrl,this,Nama);
        recyclerView.setAdapter(adapter);
    }
}
