package oop.pkg32_.pkgfinal.anahtar.sözcüğünün.kullanımı;
class Bisiklet{
    final int hizLimiti=90;//final olduğu için değeri değiştirilemez
    void calistir(){
       // hizLimiti=400;//final olduğu için değeri değiştirilemezdir . hata verir
    }
}
public class OOP32_FinalAnahtarSözcüğününKullanımı {

    public static void main(String[] args) {
        Bisiklet obj=new Bisiklet();
        obj.calistir();
    }
    
}
