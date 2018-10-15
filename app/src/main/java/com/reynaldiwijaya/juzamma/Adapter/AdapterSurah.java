package com.reynaldiwijaya.juzamma.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.reynaldiwijaya.juzamma.R;

public class AdapterSurah extends RecyclerView.Adapter<AdapterSurah.ViewHolder> {
    //TODO Membuat variable untuk diproses di Adapter
    //TODO context untuk menyimpan activity
    Context context;
    //TODO membuat variable string array untuk menampung nama dan isiSurah
    String [] namaSurah,isiSurah;

    //TODO Membuat Countractor untuk dapat menerima data pada saat adapter dibuat menjadi objek
    public AdapterSurah(Context context, String[] namaSurah, String[] isiSurah) {
        this.context = context;
        this.namaSurah = namaSurah;
        this.isiSurah = isiSurah;
    }

    @NonNull
    @Override
    public AdapterSurah.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //TODO Membuat layout item_surah menjadi objek
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_surah,viewGroup,false);
        //TODO Lalu object layout item_surah kita kirim ke class ViewHolder
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSurah.ViewHolder viewHolder, int i) {
        //TODO onBindViewHolder untuk kita menampilkan data ke tampilan widget yang kita inginkan
        viewHolder.txtNamaSurah.setText(namaSurah[i]);
        viewHolder.txtIsiSurah.setText(isiSurah[i]);

    }

    @Override
    public int getItemCount() {
        //TODO untuk menentukan jumlah data yang ingin di tampilkan
        return namaSurah.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //TODO Membuat variable global untuk menampung widget
        TextView txtNamaSurah, txtIsiSurah;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //TODO Menginisiaksikan widget di XML ke Java
            txtIsiSurah = itemView.findViewById(R.id.txtIsiSurah);
            txtNamaSurah = itemView.findViewById(R.id.txtNamaSurah);
        }
    }
}
