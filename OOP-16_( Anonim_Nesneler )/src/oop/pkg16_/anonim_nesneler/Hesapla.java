package oop.pkg16_.anonim_nesneler;

class Hesapla {

    void factoriyel(int n) {
        int sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc = sonuc * i;
        }
        System.out.println("Hesaplanan değer: " + sonuc);
    }
//bir nesneyi sadece bir kez kullanmanız gerekiyorsa, anonim bir nesne iyi bir yaklaşımdır.

    public static void main(String[] args) {
        new Hesapla().factoriyel(5);//anonim nesnelerin metodu çağrılıyor
    }

}
