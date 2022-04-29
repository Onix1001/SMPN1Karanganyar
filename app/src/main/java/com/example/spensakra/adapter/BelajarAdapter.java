package com.example.spensakra.adapter;

import static android.system.Os.remove;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spensakra.R;
import com.example.spensakra.recycler.Pembelajaran;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class BelajarAdapter extends RecyclerView.Adapter<BelajarAdapter.BelajarViewHolder>{

    private ArrayList<Pembelajaran> dataList;

    public BelajarAdapter(ArrayList<Pembelajaran> dataList) {
        this.dataList = dataList;
    }


    @NonNull
    @Override
    public BelajarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_belajar, parent, false);
        return new BelajarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BelajarAdapter.BelajarViewHolder holder, int position) {

        holder.txtPelajaran.setText(dataList.get(position).getPelajaran());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class BelajarViewHolder extends RecyclerView.ViewHolder{
        private TextView txtPelajaran;

        public BelajarViewHolder(View itemView) {
            super(itemView);
            txtPelajaran = (TextView) itemView.findViewById(R.id.pelajaran);

        }

    }
}
