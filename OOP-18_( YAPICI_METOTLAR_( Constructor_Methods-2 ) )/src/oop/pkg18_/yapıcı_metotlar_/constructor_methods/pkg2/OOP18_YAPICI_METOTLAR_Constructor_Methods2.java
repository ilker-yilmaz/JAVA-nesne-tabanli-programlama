package oop.pkg18_.yapıcı_metotlar_.constructor_methods.pkg2;

class Ogrenci {

    int ogrenciNo;
    String isim;

    Ogrenci(int ogr, String ad) {
        ogrenciNo = ogr;
        isim = ad;
    }

    void bilgileriGoster() {
        System.out.println(ogrenciNo + " " + isim);
    }
}

public class OOP18_YAPICI_METOTLAR_Constructor_Methods2 {

    public static void main(String[] args) {
        Ogrenci nesne1 = new Ogrenci(23, "İlker");
        Ogrenci nesne2 = new Ogrenci(76, "Yılmaz");
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();

    }

}
