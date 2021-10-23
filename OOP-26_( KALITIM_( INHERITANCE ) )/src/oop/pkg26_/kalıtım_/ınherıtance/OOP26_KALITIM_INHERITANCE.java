package oop.pkg26_.kalıtım_.ınherıtance;

class Calisan {

    float maas = 40000;
}

class Programci extends Calisan {

    //extends anahtar sözcüğü gördüğümüzde diyoruz ki bu Programci sınıfı başka bir sınıftan türetilmiş.
//türetildiği sınıfın özelliklerini ve davranışlarını kullanabilme yeteneğine sahip
    int ekUcret = 10000;
}

public class OOP26_KALITIM_INHERITANCE {

    public static void main(String[] args) {
        Programci p = new Programci();
        System.out.println("programcının ücreti: " + p.maas);
        System.out.println("programcının ek ücreti: " + p.ekUcret);
    }

}
