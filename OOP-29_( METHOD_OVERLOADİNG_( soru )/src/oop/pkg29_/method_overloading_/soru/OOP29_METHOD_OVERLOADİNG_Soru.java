package oop.pkg29_.method_overloading_.soru;

/**
 *
 * @author İLKER
 */
class Toplayici {

    static int topla(int a, int b) {
        return a + b;
    }

    static double topla(int a, int b) {
return a+b;
    }
}

public class OOP29_METHOD_OVERLOADİNG_Soru {

    public static void main(String[] args) {
        System.out.println(Toplayici.topla(11, 11));
    }

}
