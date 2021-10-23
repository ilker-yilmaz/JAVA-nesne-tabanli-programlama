package oop.pkg34_.arayüz_.ınterface.pkg3;

interface Banka {

    float faizOrani();
}

class YapiKredi implements Banka {

    public float faizOrani() {
        return 9.15f;
    }
}

class Garanti implements Banka {

    public float faizOrani() {
        return 9.7f;
    }
}

public class OOP34_Arayüz_Interface3 {

    public static void main(String[] args) {
        Banka nesne = new YapiKredi();
        System.out.println("Faiz orani: %" + nesne.faizOrani());
    }

}
