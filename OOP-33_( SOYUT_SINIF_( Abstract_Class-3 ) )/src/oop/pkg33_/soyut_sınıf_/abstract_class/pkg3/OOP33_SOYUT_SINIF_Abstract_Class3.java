package oop.pkg33_.soyut_sınıf_.abstract_class.pkg3;

abstract class Banka {

    abstract int faizOrani();
}

class YapiKredi extends Banka {

    int faizOrani() {
        return 7;
    }
}

class Garanti extends Banka {

    int faizOrani() {
        return 8;
    }
}

public class OOP33_SOYUT_SINIF_Abstract_Class3 {

    public static void main(String[] args) {
        Banka b;
        b = new YapiKredi();
        System.out.println("Bankanın faiz oranı: %" + b.faizOrani());
        b = new Garanti();
        System.out.println("Bankanın faiz oranı: %" + b.faizOrani());
    }

}
