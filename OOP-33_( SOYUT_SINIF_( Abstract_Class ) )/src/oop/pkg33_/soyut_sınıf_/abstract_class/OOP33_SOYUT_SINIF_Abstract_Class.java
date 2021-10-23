package oop.pkg33_.soyut_sınıf_.abstract_class;

abstract class Bisiklet {

    abstract void calistir();//metot soyut olunca gövdesi yok, ne iş yapacağı burada belli değil
}

class Honda extends Bisiklet {

    void calistir() {
        System.out.println("güvenli çalışıyor...");
    }
}

public class OOP33_SOYUT_SINIF_Abstract_Class {

    public static void main(String[] args) {
        Bisiklet nesne = new Honda();
        nesne.calistir();
    }

}
