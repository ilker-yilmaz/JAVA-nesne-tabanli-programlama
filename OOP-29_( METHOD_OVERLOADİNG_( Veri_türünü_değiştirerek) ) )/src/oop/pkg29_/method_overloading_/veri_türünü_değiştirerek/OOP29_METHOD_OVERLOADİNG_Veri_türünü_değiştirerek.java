package oop.pkg29_.method_overloading_.veri_türünü_değiştirerek;

class Toplayici {

    static int topla(int a, int b) {
        return a + b;
    }

    static double topla(double a, double b) {
        return a + b;
    }
}

public class OOP29_METHOD_OVERLOADİNG_Veri_türünü_değiştirerek {

    public static void main(String[] args) {
        System.out.println(Toplayici.topla(43, 33));
        System.out.println(Toplayici.topla(12.4, 64.2));
    }

}
