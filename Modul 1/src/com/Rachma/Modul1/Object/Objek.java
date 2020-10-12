package com.Rachma.Modul1.Object;

//Class Main / Demo Class
public class Objek {
    public static void main(String[] args) {

        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        //memakai Setter
        mahasiswaTanpa.setNama("Rachma");
        mahasiswaTanpa.setNim(19104065);

        //memakai Getter
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("NIM\t\t: " + mahasiswaTanpa.getNim());

        //Deklarasi object dengan 1 parameter
        Mahasiswa mahasiswa1Param = new Mahasiswa("Lisa");

        //Deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 12345678);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("NIM\t\t: " + mahasiswa.getNim());
    }
}
