package oop.pkg34_.arayüz_.ınterface.pkg5;

interface Yazdirilabilir {

    void yaz();
}

interface Gosterilebilir {

    void yaz();
}

class TestInterface implements Yazdirilabilir, Gosterilebilir {

    public void yaz() {
        System.out.println("Merhaba");
    }
}

public class OOP34_Arayüz_Interface5 {

    public static void main(String[] args) {
        TestInterface nesne = new TestInterface();
        nesne.yaz();
    }

}
