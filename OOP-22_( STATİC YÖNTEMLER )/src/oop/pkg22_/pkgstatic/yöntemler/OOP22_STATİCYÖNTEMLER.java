package oop.pkg22_.pkgstatic.yöntemler;

class Ogrenci {

    int ogrenciNo;
    String isim;
    static String fakulteAdi = "Teknoloji";

    static void degistir() {
        fakulteAdi = "Mühendislik";

    }

    Ogrenci(int ogr, String ad) {
        ogrenciNo = ogr;
        isim = ad;
    }

    void bilgileriGoster() {
        System.out.println(ogrenciNo + " " + isim + " " + fakulteAdi);
    }
}

public class OOP22_STATİCYÖNTEMLER {

    public static void main(String[] args) {
        Ogrenci.degistir();
        Ogrenci nesne1 = new Ogrenci(76, "ilker");
        Ogrenci nesne2 = new Ogrenci(76, "Yılmaz");
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();

    }

}
