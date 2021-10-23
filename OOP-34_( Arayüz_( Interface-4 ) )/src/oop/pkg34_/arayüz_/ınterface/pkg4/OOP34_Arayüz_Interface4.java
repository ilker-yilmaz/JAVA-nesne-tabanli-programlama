package oop.pkg34_.arayüz_.ınterface.pkg4;

interface Yazdirilabilir {

    void yaz();
}

interface Gosterilebilir {

    void goster();
}
class A4 implements Yazdirilabilir,Gosterilebilir{
    public void yaz(){
        System.out.println("Merhaba");
        
    }public void goster(){
        System.out.println("Hoşgeldiniz");
        
    }
}
public class OOP34_Arayüz_Interface4 {

    public static void main(String[] args) {
        A4 nesne=new A4();
        nesne.yaz();
        nesne.goster();
    }

}
