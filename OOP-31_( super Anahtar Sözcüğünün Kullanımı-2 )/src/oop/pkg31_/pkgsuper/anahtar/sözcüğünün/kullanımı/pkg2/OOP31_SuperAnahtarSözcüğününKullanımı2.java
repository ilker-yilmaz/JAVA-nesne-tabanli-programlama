package oop.pkg31_.pkgsuper.anahtar.sözcüğünün.kullanımı.pkg2;

class Hayvan {

    void beslenme() {
        System.out.println("yemek yiyor...");
    }
}

class Kopek extends Hayvan {

    void beslenme() {
        System.out.println("ekmek yiyor...");

    }

    void havlama() {
        System.out.println("havlıyor...");
    }

    void calis() {
        super.beslenme();
        havlama();
    }
}

public class OOP31_SuperAnahtarSözcüğününKullanımı2 {

    public static void main(String[] args) {
        Kopek k = new Kopek();
        k.calis();
    }

}
