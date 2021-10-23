package oop.pkg31_.pkgsuper.anahtar.sözcüğünün.kullanımı.pkg3;

class Hayvan {

    Hayvan() {
        System.out.println("hayvan oluşturuldu");
    }
}

class Kopek extends Hayvan {

    Kopek() {
        super();// türetilen sınıfın yapıcı metoduna ulaşabilme imkânı sağlıyor
        System.out.println("köpek oluşturuldu");
    }
}

public class OOP31_SuperAnahtarSözcüğününKullanımı3 {

    public static void main(String[] args) {
        Kopek k = new Kopek();
    }

}
