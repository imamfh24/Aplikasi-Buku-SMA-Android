package com.example.perpustakaansma;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListBukuAdapter extends RecyclerView.Adapter<ListBukuAdapter.MyViewHolder> {

    private Context mContext;
    private List<Buku> mData;

    public ListBukuAdapter(Context mContext, List<Buku> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ListBukuAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_cardview_buku, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBukuAdapter.MyViewHolder holder, final int position) {


        holder.tv_judul_buku.setText(mData.get(position).getJudul());
        holder.img_thumbnail_buku.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,BukuActivity.class);
                intent.putExtra("Judul",mData.get(position).getJudul());
                intent.putExtra("Deskripsi",mData.get(position).getDeskripsi());
                intent.putExtra("Kategori",mData.get(position).getKategori());
                intent.putExtra("Pengantar",mData.get(position).getKataPengantar());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_judul_buku;
        ImageView img_thumbnail_buku;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_judul_buku = (TextView) itemView.findViewById(R.id.judul_buku_id);
            img_thumbnail_buku = (ImageView) itemView.findViewById(R.id.buku_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cv_id);
        }
    }
}
