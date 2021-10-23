package oop.pkg25_.this_anahtar_sözcüğünün_kullanımı;

class A {

    A() {
        System.out.println("merhaba a");

    }

    A(int x) {
        this();
        System.out.println(x);
    }
}

public class OOP25_This_Anahtar_Sözcüğünün_Kullanımı {

    public static void main(String[] args) {
        A a = new A(10);
    }

}
