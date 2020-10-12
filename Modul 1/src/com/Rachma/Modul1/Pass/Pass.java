package com.Rachma.Modul1.Pass;

//Class main
public class Pass {
    public static void main(String[] args) {
        int nomor1, nomor2;

        TestPass passed = new TestPass(50,100);
        nomor1 = 10;
        nomor2 = 20;

        //Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomor1\t: " + nomor1);
        System.out.println("Nomor2\t: " + nomor2);

        passed.calculate(nomor1, nomor2);
        System.out.println("Nilai setelah passed by value\t: ");
        System.out.println("Nomor1\t: " + nomor1);
        System.out.println("Nomor2\t: " + nomor2);
        System.out.println();

        //Passed by reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("passed.nomor1\t: " + passed.nomor1);
        System.out.println("passed.nomor2\t: " + passed.nomor2);

        passed.calculate(passed);
        System.out.println("Nilai sesudah passed by reference\t: ");
        System.out.println("passed.nomor1\t: " + passed.nomor1);
        System.out.println("passed.nomor2\t: " + passed.nomor2);
    }
}
