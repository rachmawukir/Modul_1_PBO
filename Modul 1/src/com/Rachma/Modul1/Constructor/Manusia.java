package com.Rachma.Modul1.Constructor;

public class Manusia {
    private String nama;
    private int umur;

    //Definisi Constructor
    //Constructor pertama = default tanpa parameter
    public Manusia(){}

    //Constructor kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    //Constructor ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Definisi Method
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
