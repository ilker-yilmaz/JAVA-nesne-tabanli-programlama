package oop.pkg33_.soyut_sınıf_.abstract_class.pkg2;

abstract class Sekil {

    abstract void ciz();
}

class Dikdortgen extends Sekil {

    void ciz() {
        System.out.println("dikdörtgen çizliyor");
    }
}

class Cember extends Sekil {

    void ciz() {
        System.out.println("çember çizliyor");
    }
}

public class OOP33_SOYUT_SINIF_Abstract_Class2 {

    public static void main(String[] args) {
        Sekil s = new Cember();
        s.ciz();
    }

}
