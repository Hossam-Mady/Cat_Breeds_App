package com.example.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CatRecyclerViewAdapter extends RecyclerView.Adapter<CatRecyclerViewAdapter.CatViewHolder> {
    ArrayList<Cat> cats;

    public CatRecyclerViewAdapter(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_custom_item,null,false);
        CatViewHolder catViewHolder = new CatViewHolder(view);
        return catViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat cat = cats.get(position);
        holder.name.setText(cat.getName());
        holder.image.setImageResource(cat.getImg());
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    // holder class for cat RecyclerView
    class CatViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView image;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.cat_custom_name);
            image = itemView.findViewById(R.id.cat_custom_img);
        }


    }
}
