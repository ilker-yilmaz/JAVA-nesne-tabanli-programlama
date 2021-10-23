package oop.pkg31_.pkgsuper.anahtar.sözcüğünün.kullanımı.pkg4;

class Personel {

    int id;
    String isim;

    Personel(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }
}

class Emekci extends Personel {

    float ucret;

    Emekci(int id, String isim, float ucret) {
        super(id, isim);
        this.ucret = ucret;
    }

    void goster() {
        System.out.println(id + " " + isim + " " + ucret);
    }
}

public class OOP31_SuperAnahtarSözcüğününKullanımı4 {

    public static void main(String[] args) {
        Emekci e1 = new Emekci(76, "ilker", 45000f);
        e1.goster();
    }

}
