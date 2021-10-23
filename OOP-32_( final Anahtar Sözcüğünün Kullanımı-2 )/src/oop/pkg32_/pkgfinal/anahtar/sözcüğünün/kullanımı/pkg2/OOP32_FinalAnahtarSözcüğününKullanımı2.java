package oop.pkg32_.pkgfinal.anahtar.sözcüğünün.kullanımı.pkg2;

class Bisiklet {

    final void calistir() {// metot final olarak tanımlandığı için değiştirilemezdir burda.
        System.out.println("calisiyor...");
    }
}

class Honda extends Bisiklet {

   // void calistir() {
   //     System.out.println("100 km hızla çalışıyor...");
   // }
}

public class OOP32_FinalAnahtarSözcüğününKullanımı2 {

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.calistir();

    }

}
