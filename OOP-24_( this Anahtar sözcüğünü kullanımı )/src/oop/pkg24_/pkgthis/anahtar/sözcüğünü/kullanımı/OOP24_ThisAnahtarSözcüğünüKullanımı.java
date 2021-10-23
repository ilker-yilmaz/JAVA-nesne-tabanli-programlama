package oop.pkg24_.pkgthis.anahtar.sözcüğünü.kullanımı;
// this geçerli sınıf örnek değişkenini belirtmek için kullanımı

class Ogrenci {

    int ogrenciNo;
    String isim;
    float burs;

    Ogrenci(int ogrenciNo, String isim, float burs) {
//parametreli yapıcı metot: yaptığı işlem ise sınıfın özelliklerine ilk değer atamak
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;//this anahtar sözcüğünü kullandığımız zaman mevcut sınıfın değişkenlerini kullanabilir duruma geliyoruz.
        this.burs = burs;
    }

    void bilgileriGoster() {
        System.out.println(ogrenciNo + " " + isim + " " + burs);
    }
}

public class OOP24_ThisAnahtarSözcüğünüKullanımı {

    public static void main(String[] args) {
        Ogrenci nesne1 = new Ogrenci(111, "İlker", 5000f);//nesne oluşturma
        Ogrenci nesne2 = new Ogrenci(222, "Yılmaz", 6000f);
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();

    }

}
