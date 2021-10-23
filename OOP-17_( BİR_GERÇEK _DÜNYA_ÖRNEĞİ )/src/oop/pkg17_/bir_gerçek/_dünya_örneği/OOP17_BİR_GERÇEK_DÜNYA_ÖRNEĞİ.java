package oop.pkg17_.bir_gerçek._dünya_örneği;

class Hesap {
//örnek değişkenlerimiz:
    int hesapNumarasi;
    String hesapAdi;
    float miktar;

    void musteriEkle(int hn, String ha, float m) {
        hesapNumarasi = hn;
        hesapAdi = ha;
        miktar = m;
    }

    void paraYatir(float tutar) {
        miktar = miktar + tutar;
        System.out.println(tutar + " TL hesaba para yatırıldı");
    }

    void paraCek(float tutar) {
        if (tutar > miktar) {
            System.out.println("Hesapta yeterli para yok");
        } else {
            miktar = miktar - tutar;
            System.out.println(tutar + "  TL hesaptan para çekildi");
        }
    }

    void kontrol() {
        System.out.println("Hesabın güncel bakiyesi: " + miktar);
    }

    void goster() {
        System.out.println(hesapNumarasi + " " + hesapAdi + " " + miktar);
    }
}

public class OOP17_BİR_GERÇEK_DÜNYA_ÖRNEĞİ {

    public static void main(String[] args) {
        Hesap musteri1;
        musteri1 = new Hesap();
        musteri1.musteriEkle(1, "ilker yılmaz", 10000);
        musteri1.goster();
        musteri1.paraYatir(5000);
        musteri1.kontrol();
        musteri1.paraCek(3000);
        musteri1.kontrol();
        musteri1.paraCek(3000);
        musteri1.goster();
    }

}
