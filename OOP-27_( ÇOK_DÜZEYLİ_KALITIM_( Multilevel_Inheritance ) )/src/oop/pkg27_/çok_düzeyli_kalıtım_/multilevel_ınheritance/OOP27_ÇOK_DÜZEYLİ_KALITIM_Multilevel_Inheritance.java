package oop.pkg27_.çok_düzeyli_kalıtım_.multilevel_ınheritance;
class Hayvan{
    void beslenme(){
        System.out.println("yemek yiyor...");
    }
}
class Kopek extends Hayvan{
    void havla(){
        System.out.println("köpek havlıyor...");
    }
}
class BebekKopek extends Kopek{
    void agla(){
        System.out.println("ağlıyor...");
    }
}
public class OOP27_ÇOK_DÜZEYLİ_KALITIM_Multilevel_Inheritance {

    public static void main(String[] args) {
        BebekKopek bk=new BebekKopek();
        bk.agla();
        bk.havla();
        bk.beslenme();

    }
    
}
