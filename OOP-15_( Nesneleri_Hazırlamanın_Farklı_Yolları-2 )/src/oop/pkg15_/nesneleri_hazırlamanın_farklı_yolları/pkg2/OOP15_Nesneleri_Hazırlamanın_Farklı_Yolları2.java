package oop.pkg15_.nesneleri_hazırlamanın_farklı_yolları.pkg2;           

class Ogrenci {

    int ogrenciNo;
    String isim;

    void kayitEkle(int ogr, String ad) {
        ogrenciNo = ogr;
        isim = ad;
    }

    void bilgileriGoster() {
        System.out.println(ogrenciNo + " " + isim);
    }
}

public class OOP15_Nesneleri_Hazırlamanın_Farklı_Yolları2 {

    public static void main(String[] args) {
        Ogrenci nesne1 = new Ogrenci();
        Ogrenci nesne2 = new Ogrenci();
        nesne1.kayitEkle(76, "İlker");
        nesne2.kayitEkle(23, "Yılmaz");
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();
    }

}
