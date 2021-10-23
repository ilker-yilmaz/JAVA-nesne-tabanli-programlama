package oop.pkg15_.nesneleri_hazırlamanın_farklı_yolları;

class Ogrenci {

    int ogrenciNo;
    String isim;
}

public class OOP15_Nesneleri_Hazırlamanın_Farklı_Yolları {

    public static void main(String[] args) {
        //Nesneleri oluştur
        Ogrenci nesne1 = new Ogrenci();
        Ogrenci nesne2 = new Ogrenci();
        //Nesneleri hazırla
        nesne1.ogrenciNo = 101;
        nesne1.isim = "İlker";
        nesne2.ogrenciNo = 102;
        nesne2.isim = "Yılmaz";
        //Verileri yazdır
        System.out.println(nesne1.ogrenciNo + " " + nesne1.isim);
        System.out.println(nesne2.ogrenciNo + " " + nesne2.isim);

    }

}


