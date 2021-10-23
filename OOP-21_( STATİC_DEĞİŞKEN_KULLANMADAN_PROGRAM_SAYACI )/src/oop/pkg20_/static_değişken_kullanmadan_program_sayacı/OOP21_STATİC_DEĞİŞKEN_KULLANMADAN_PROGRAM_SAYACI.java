package oop.pkg20_.static_değişken_kullanmadan_program_sayacı;

class Sayici {

    static int sayac = 0;//static olmazsa hep aynı kalır 1 olur...

    Sayici() {
        sayac++;
        System.out.println(sayac);
    }
}

public class OOP21_STATİC_DEĞİŞKEN_KULLANMADAN_PROGRAM_SAYACI {

    public static void main(String[] args) {
        Sayici nesne1 = new Sayici();
        Sayici nesne2 = new Sayici();
        Sayici nesne3 = new Sayici();
    }

}
 