package oop.pkg30_.java_poliformizmi_.method.overriding;

class Arac {

    void calistir() {
        System.out.println("araç çalışıyor...");
    }
}

class Bisiklet extends Arac {

    void calistir() {
        System.out.println("Bisklet çalışıyor...");
    }
}

public class OOP30_JAVA_POLİFORMİZMİ_METHODOVERRİDİNG {

    public static void main(String[] args) {
        Bisiklet nesne = new Bisiklet();
        nesne.calistir();

    }

}
