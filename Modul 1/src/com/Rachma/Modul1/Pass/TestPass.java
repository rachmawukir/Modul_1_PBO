package com.Rachma.Modul1.Pass;

public class TestPass {
    int nomor1, nomor2;

    public TestPass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    //Passed by value
    void calculate (int a, int n) {
        a = a * 10;
        n = n / 2;
    }

    //Passed by reference
    void calculate (TestPass passed) {
        passed.nomor1 = passed.nomor1 * 10;
        passed.nomor2 = passed.nomor2 / 2;
    }

}
