package oop.pkg24_.this_anahtar_sözcüğünün_kullanımı.pkg2;

class A {

    void m() {
        System.out.println("merhaba m");
    }

    void n() {
        System.out.println("merhaba n");
        //m() yazmak ile this.m() yazmak arasında bir fark yok
        this.m();
    }
}

public class OOP24_This_Anahtar_Sözcüğünün_Kullanımı2 {

    public static void main(String[] args) {
        A a = new A();
        a.n();
    }

}
