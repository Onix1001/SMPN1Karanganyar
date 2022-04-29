package com.example.spensakra.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.spensakra.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class GuruAdapter extends RecyclerView.Adapter<GuruAdapter.ViewHolder>{

    ArrayList<String> urls;
    ArrayList<String> Nama;
    Context context;
    //constructor
    public GuruAdapter(ArrayList<String> ImgUrl, Context context_,ArrayList<String> nama)
    {
        this.urls = ImgUrl;
        this.context = context_;
        this.Nama = nama;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private CircleImageView image;
        private TextView Nama;

        public ViewHolder(View v)
        {
            super(v);
            image =(CircleImageView) v.findViewById(R.id.foto_guru);
            Nama = (TextView) v.findViewById(R.id.namaguru);
        }

        public CircleImageView getImage(){ return this.image;}
        public TextView getNama(){ return this.Nama;}
    }

    @Override
    public GuruAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_guru, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position)
    {
        Glide.with(this.context)
                .load(urls.get(position))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.getImage());
        holder.getNama().setText(Nama.get(position));
    }

    @Override
    public int getItemCount()
    {
        return urls.size();
    }
}
