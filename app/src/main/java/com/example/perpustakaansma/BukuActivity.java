package com.example.perpustakaansma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.JarURLConnection;

public class BukuActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvjudul, tvdeskripsi,tvkategori, tv_pengantar;
    private ImageView img;
    private Button btn_baca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku);

        img = findViewById(R.id.cover_buku);
        tvjudul = findViewById(R.id.jdl_buku);
        tvkategori = findViewById(R.id.kateg);
        tvdeskripsi = findViewById(R.id.desk);
        btn_baca = findViewById(R.id.btn_baca);
        tv_pengantar = findViewById(R.id.pengantar);

        Intent intent = getIntent();
        String Judul = intent.getExtras().getString("Judul");
        String Deskripsi = intent.getExtras().getString("Deskripsi");
        String Kategori = intent.getExtras().getString("Kategori");
        String Pengantar = intent.getExtras().getString("Pengantar");
        int image = intent.getExtras().getInt("Thumbnail");
        img.setImageResource(image);
        tvjudul.setText(Judul);
        tvkategori.setText(Kategori);
        tvdeskripsi.setText(Deskripsi);
        tv_pengantar.setText(Pengantar);
        btn_baca.setOnClickListener(this);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Buku "+Judul);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_baca:
                Intent ins = getIntent();
                String Judul = ins.getExtras().getString("Judul");
                Intent intent = new Intent(BukuActivity.this,BacaActivity.class);
                intent.putExtra("Judul",Judul);
                startActivity(intent);
                break;
        }
    }
}
