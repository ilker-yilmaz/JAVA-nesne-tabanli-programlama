package oop.pkg25_.this_anahtar_sözcüğünün_kullanımı.pkg2;

class A {

    A() {
        this(5);
        System.out.println("merhaba a");
    }

    A(int x) {
        System.out.println(x);
    }
}

public class OOP25_This_Anahtar_Sözcüğünün_Kullanımı2 {

    public static void main(String[] args) {
        A a = new A();
    }

}
