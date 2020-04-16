package com.example.perpustakaansma;

public class Buku {
    private String Judul;
    private String Kategori;
    private String Deskripsi;



    private String kataPengantar;
    private int Thumbnail;

    public Buku() {
    }

    public Buku(String judul, String kategori, String deskripsi, String Pengantar, int thumbnail) {
        Judul = judul;
        Kategori = kategori;
        Deskripsi = deskripsi;
        Thumbnail = thumbnail;
        kataPengantar = Pengantar;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String kategori) {
        Kategori = kategori;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public String getKataPengantar() {
        return kataPengantar;
    }

    public void setKataPengantar(String kataPengantar) {
        this.kataPengantar = kataPengantar;
    }


}
