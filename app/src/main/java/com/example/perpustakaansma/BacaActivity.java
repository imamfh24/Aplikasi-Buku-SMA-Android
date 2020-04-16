package com.example.perpustakaansma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BacaActivity extends AppCompatActivity {

    private PDFView pdfViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baca);

        Intent intent = getIntent();
        String Judul = intent.getExtras().getString("Judul");

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Buku "+Judul);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pdfViews = findViewById(R.id.pdfView);

        pdfViews.fromAsset("" + Judul + ".pdf")
                .enableSwipe(true)
                .load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
