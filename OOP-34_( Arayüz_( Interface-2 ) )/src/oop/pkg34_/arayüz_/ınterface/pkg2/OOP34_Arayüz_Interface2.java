package oop.pkg34_.arayüz_.ınterface.pkg2;

//import javafx.scene.shape.Circle;

interface Cizilebilir {

    void ciz();
}

class Dikdortgen implements Cizilebilir {

    public void ciz() {
        System.out.println("dikdortgen çiziliyor...");
    }
}

class Cember implements Cizilebilir {

    public void ciz() {
        System.out.println("çember çiziliyor...");
    }
}

public class OOP34_Arayüz_Interface2 {

    public static void main(String[] args) {
        Cizilebilir nesne =new Circle();
        nesne.ciz();
    }

}
