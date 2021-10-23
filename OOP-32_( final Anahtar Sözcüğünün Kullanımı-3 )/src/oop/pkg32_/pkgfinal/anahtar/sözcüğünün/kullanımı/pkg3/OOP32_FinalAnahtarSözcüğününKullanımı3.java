package oop.pkg32_.pkgfinal.anahtar.sözcüğünün.kullanımı.pkg3;
class Bisiklet{//final olursa hata verir

}
class Honda extends Bisiklet{
    void calistir(){
        System.out.println("çalışıyor...");
    }
}
public class OOP32_FinalAnahtarSözcüğününKullanımı3 {

    public static void main(String[] args) {
        Honda honda=new Honda();
        honda.calistir();

    }
    
}
