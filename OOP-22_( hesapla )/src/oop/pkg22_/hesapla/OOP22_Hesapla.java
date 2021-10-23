package oop.pkg22_.hesapla;

class Hesapla {

    static int kupAl(int x) {
        return x * x * x;
    }

}

public class OOP22_Hesapla {

    public static void main(String[] args) {
        int sonuc = Hesapla.kupAl(5);
        System.out.println(sonuc);

    }
}
