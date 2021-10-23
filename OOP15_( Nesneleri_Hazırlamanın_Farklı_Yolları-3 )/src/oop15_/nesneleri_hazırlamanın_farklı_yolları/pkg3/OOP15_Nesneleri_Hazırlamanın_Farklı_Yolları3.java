package oop15_.nesneleri_hazırlamanın_farklı_yolları.pkg3;

class Dortgen {

    int uzunluk;
    int genislik;

    void ekle(int u, int g) {
        uzunluk = u;
        genislik = g;
    }

    void alanHesapla() {
        System.out.println(uzunluk * genislik);
    }
}

public class OOP15_Nesneleri_Hazırlamanın_Farklı_Yolları3 {

    public static void main(String[] args) {
        Dortgen nesne1 = new Dortgen();
        Dortgen nesne2 = new Dortgen();
        nesne1.ekle(11, 5);
        nesne2.ekle(3, 15);
        nesne1.alanHesapla();
        nesne2.alanHesapla();

    }

}
