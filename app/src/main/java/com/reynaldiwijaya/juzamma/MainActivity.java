package com.reynaldiwijaya.juzamma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.reynaldiwijaya.juzamma.Adapter.RecycleSurah;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnSurahPendek)
    Button btnSurahPendek;
    @BindView(R.id.btnSurahPanjang)
    Button btnSurahPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnSurahPendek, R.id.btnSurahPanjang})
    public void onViewClicked(View view) {
        //TODO membuat variable global dengan tipe data Intent
        Intent pindah;
        switch (view.getId()) {
            case R.id.btnSurahPendek:
                //TODO 1 Membuat objek pindah
                pindah = new Intent(this, RecycleSurah.class);
                //TODO memasukan data ke Intent
                pindah.putExtra("tanda", "pendek");
                //TODO 1 Menjalankan Intent
                startActivity(pindah);
                break;
            case R.id.btnSurahPanjang:
                //TODO 1 membuat objek pindah
                pindah = new Intent(this,RecycleSurah.class);
                pindah.putExtra("tanda","panjang");
                startActivity(pindah);
                break;
        }
    }
}
