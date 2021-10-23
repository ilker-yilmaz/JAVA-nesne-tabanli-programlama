package oop.pkg30_.method_overrıdıng;

/**
 *
 * @author İLKER
 */
class Arac{
    void calistir(){
        System.out.println("Araç Çalışıyor");
    }
}
public class Bisiklet extends Arac{
@Override
void calistir(){
    System.out.println("bisiklet çalışıyor");
}
    public static void main(String[] args) {
        Bisiklet nesne = new Bisiklet();
        nesne.calistir();
    }
    
}
