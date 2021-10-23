package oop.pkg27_.hiyerarşik.kalıtım_.hierarchicak_ınheritance;

class Hayvan {

    void beslenme() {
        System.out.println("yemek yiyor...");
    }
}

class Kopek extends Hayvan {

    void havla() {
        System.out.println("köpek havlıyor...");
    }
}

class Kedi extends Hayvan {

    void miyavla() {
        System.out.println("kedi miyavlıyor...");
    }
}

public class OOP27_HİYERARŞİKKALITIM_Hierarchicak_Inheritance {

    public static void main(String[] args) {
        Kedi k = new Kedi();
        k.miyavla();
        k.beslenme();
        // k.havla();//compile time error

    }

}
