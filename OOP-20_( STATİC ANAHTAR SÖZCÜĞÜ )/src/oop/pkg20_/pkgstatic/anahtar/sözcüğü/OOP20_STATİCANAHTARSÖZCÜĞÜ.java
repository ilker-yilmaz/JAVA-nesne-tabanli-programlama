package oop.pkg20_.pkgstatic.anahtar.sözcüğü;

class Ogrenci {

    int ogrenciNo;
    String isim;
    static String fakulteAdi = "Teknoloji";

    Ogrenci(int ogr, String ad) {
        ogrenciNo = ogr;
        isim = ad;
    }

    void bilgileriGoster() {
        System.out.println(ogrenciNo + " " + isim);
    }
}

public class OOP20_STATİCANAHTARSÖZCÜĞÜ {

    public static void main(String[] args) {

        Ogrenci nesne1 = new Ogrenci(76, "İlker");
        Ogrenci nesne2 = new Ogrenci(76, "Yılmaz");
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();
    }

}
