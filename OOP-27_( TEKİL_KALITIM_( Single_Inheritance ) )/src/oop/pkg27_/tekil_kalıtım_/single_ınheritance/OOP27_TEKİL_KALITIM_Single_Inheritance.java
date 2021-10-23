package oop.pkg27_.tekil_kalıtım_.single_ınheritance;
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
public class OOP27_TEKİL_KALITIM_Single_Inheritance {

    public static void main(String[] args) {
        Kopek k=new Kopek();
        k.havla();
        k.beslenme();
    }

}
