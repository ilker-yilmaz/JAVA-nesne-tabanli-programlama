package oop.pkg18_.yapıcı_metotlar_.constructor_methods;

class Ogrenci {

    int ogrenciNo;
    String isim;

    void bilgileriGoster() {
        System.out.println(ogrenciNo + " " + isim);
    }
}

class OOP18_YAPICI_METOTLAR_Constructor_Methods {

    public static void main(String[] args) {
        Ogrenci nesne1 = new Ogrenci();
        Ogrenci nesne2 = new Ogrenci();
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();

    }

}
