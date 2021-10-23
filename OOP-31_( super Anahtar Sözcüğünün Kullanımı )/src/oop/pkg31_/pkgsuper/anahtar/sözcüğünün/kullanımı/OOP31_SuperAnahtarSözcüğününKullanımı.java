package oop.pkg31_.pkgsuper.anahtar.sözcüğünün.kullanımı;

class Hayvan {

    String renk = "beyaz";

}

class Kopek extends Hayvan {

    String renk = "siyah";

    void renkYazdir() {
        System.out.println(renk);//köpek sınıfının renk değeri yazılacak
        System.out.println(super.renk);//hayvan sınıfının renk değeri yazılacak
    }
}

public class OOP31_SuperAnahtarSözcüğününKullanımı {

    public static void main(String[] args) {
        Kopek k = new Kopek();
        k.renkYazdir();

    }

}
