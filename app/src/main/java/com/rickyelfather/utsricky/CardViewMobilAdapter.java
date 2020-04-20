package com.rickyelfather.utsricky;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMobilAdapter extends RecyclerView.Adapter<CardViewMobilAdapter.CardViewViewHolder> {
    private ArrayList<Mobil> listMobil;

    public CardViewMobilAdapter(ArrayList<Mobil> list) {
        this.listMobil = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_mobil, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Mobil mobil = listMobil.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mobil.getPoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPoto);
        holder.tvNama.setText(mobil.getNama());
        holder.tvSpek.setText(mobil.getSpek());
    }

    @Override
    public int getItemCount() {
        return listMobil.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoto;
        TextView tvNama, tvSpek;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPoto = itemView.findViewById(R.id.img_item_poto);
            tvNama = itemView.findViewById(R.id.tv_item_nama);
            tvSpek = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}