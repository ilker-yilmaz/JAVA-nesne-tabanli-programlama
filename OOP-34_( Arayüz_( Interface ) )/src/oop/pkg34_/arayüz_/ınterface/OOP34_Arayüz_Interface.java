package oop.pkg34_.arayüz_.ınterface;

interface yazdirilabilir {// arayüzleri tanımlayabilmek için interface anahtar sözcüğünü kullanırız.

    void yaz();
}

class A6 implements yazdirilabilir {

    public void yaz() {
        System.out.println("Merhaba");
    }
}

public class OOP34_Arayüz_Interface {

    public static void main(String[] args) {
        A6 nesne = new A6();
        nesne.yaz();
    }

}
