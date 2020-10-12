package com.Rachma.Modul1.Object;

public class Mahasiswa {
    String nama;
    int nim;

    //Constructor 1
    public Mahasiswa(){}

    //Constructor 2
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    //Constructor 3
    //Cara cepat bikin constructor Alt+insert
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Getter & Setter
    public String getNama() { //fungsi
        return nama;
    }

    public void setNama(String nama) { //prosedur
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
