package oop.pkg29_.method.overloading_.parametre.sayısını.değiştirerek;
class Toplayici{
    static int topla(int a,int b){
        return a+b;
    }
    static int topla(int a,int b,int c){
        return a+b+c;
    }
}
public class OOP29_METHODOVERLOADİNG_ParametreSayısınıDeğiştirerek {

    public static void main(String[] args) {
        System.out.println(Toplayici.topla(11, 11));
        System.out.println(Toplayici.topla(11, 11,11));

    }
    
}
