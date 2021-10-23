package oop.pkg19_.java.da_constructor_aşırı_yüklenmesi;

class Ogrenci {

    int ogrenciNo;
    String isim;

    Ogrenci(int ogr, String ad) {
        ogrenciNo = ogr;
        isim = ad;
    }

    Ogrenci(int ogr) {
        ogrenciNo = ogr;
    }

    void bilgileriGoster() {
        System.out.println(ogrenciNo + " " + isim);
    }
}

public class OOP19_JAVADA_CONSTRUCTOR_AŞIRI_YÜKLENMESİ {

    public static void main(String[] args) {
        Ogrenci nesne1 = new Ogrenci(76);
        Ogrenci nesne2 = new Ogrenci(23, "Yılmaz");
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();
    }

}
