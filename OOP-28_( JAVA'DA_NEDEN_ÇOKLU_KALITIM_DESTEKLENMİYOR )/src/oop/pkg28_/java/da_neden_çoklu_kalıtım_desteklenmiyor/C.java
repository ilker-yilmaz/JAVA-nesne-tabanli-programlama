package oop.pkg28_.java.da_neden_çoklu_kalıtım_desteklenmiyor;

/**
 *
 * @author İLKER
 */
class A{
    void mesajYaz(){
        System.out.println("java");
    }
}
class B{
    void mesajYaz(){
        System.out.println("phyton");
    }
}
public class C extends A{
//public class C extends A,B{ } olacağını varsayalım. bu şekilkde çoklu kalıtım desteklenmediği için hata verecektir.
    public static void main(String[] args) {
        C nesne=new C();
        nesne.mesajYaz();//hangi mesajYaz
    }
}
