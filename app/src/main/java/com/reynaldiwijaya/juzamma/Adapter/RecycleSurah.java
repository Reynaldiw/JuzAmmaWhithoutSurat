package com.reynaldiwijaya.juzamma.Adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.reynaldiwijaya.juzamma.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleSurah extends AppCompatActivity {

    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    //TODO Membuat variable data nama dan isi surah
    String[] namaSurahPendek,namaSurahPanjang, isiSurahPendek, isiSurahPanjang;

    //TODO membuat variable global AdapterSurah
    AdapterSurah adapterSurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_surah);
        ButterKnife.bind(this);

        //TODO Mengisi variable dengan data yang ada pada String
        namaSurahPendek = getResources().getStringArray(R.array.nama_surah_pendek);
        namaSurahPanjang = getResources().getStringArray(R.array.nama_surah_panjang);
        isiSurahPendek = getResources().getStringArray(R.array.isi_surah_pendek);
        isiSurahPanjang = getResources().getStringArray(R.array.isi_surah_panjang);

        //TODO Menangkap data dari Intent
        String tanda = getIntent().getStringExtra("tanda");

        //TODO Kita cek isi data dari activity sebelumnya
        if (tanda.equals("pendek")){
            //TODO Apabila dia surah pendek maka kita buat adapter dengan surah pendek
            adapterSurah = new AdapterSurah(RecycleSurah.this, namaSurahPendek,isiSurahPendek);

        }else{
            adapterSurah = new AdapterSurah(RecycleSurah.this, namaSurahPanjang,isiSurahPanjang);

        }

        //TODO Mesetting recycleview dan mengeset recycle adapter dengan adaptersurah
        myRecycleView.setHasFixedSize(true);
        //TODO Mengeset layoutmanager recycleview
        myRecycleView.setLayoutManager(new LinearLayoutManager(RecycleSurah.this));
        //TODO menset adapter recycleview
        myRecycleView.setAdapter(adapterSurah);



    }
}
