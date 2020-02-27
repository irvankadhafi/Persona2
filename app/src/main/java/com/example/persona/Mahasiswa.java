package com.example.persona;

public class Mahasiswa {

    private String uang_masuk;
    private String uang_keluar;

    public Mahasiswa(String uang_masuk, String uang_keluar) {
        this.uang_masuk = uang_masuk;
        this.uang_keluar = uang_keluar;
    }

    public String getUang_masuk() {
        return uang_masuk;
    }

    public void setUang_masuk(String uang_masuk) {
        this.uang_masuk = uang_masuk;
    }

    public String getUang_keluar() {
        return uang_keluar;
    }

    public void setUang_keluar(String uang_keluar) {
        this.uang_keluar = uang_keluar;
    }
}