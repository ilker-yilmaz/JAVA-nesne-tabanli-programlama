package oop.pkg25_.örnek;

class Ogrenci {

    int ogrenciNo;
    String isim, ders;
    float burs;

    Ogrenci(int ogrenciNo, String isim, String ders) {
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.ders = ders;
    }

    Ogrenci(int ogrenciNo, String isim, String ders, float burs) {
        this(ogrenciNo, isim, ders);//öncelikle çağrılmalı aksi takdirde hata verir
        this.burs = burs;
    }

    void bilgileriGoster() {
        System.out.println(ogrenciNo + " " + isim + " " + ders + " " + burs);
    }
}

public class OOP25_ÖRNEK {

    public static void main(String[] args) {
        Ogrenci nesne1 = new Ogrenci(76, "ilker", "java");
        Ogrenci nesne2 = new Ogrenci(23, "yılmaz", "java", 6000f);
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();

    }

}
