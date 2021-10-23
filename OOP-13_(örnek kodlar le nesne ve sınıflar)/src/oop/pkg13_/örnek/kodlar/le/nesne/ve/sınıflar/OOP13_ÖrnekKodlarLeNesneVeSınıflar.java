package oop.pkg13_.örnek.kodlar.le.nesne.ve.sınıflar;

public class OOP13_ÖrnekKodlarLeNesneVeSınıflar {    
    //özelliklerin (fields) tanımlanması

    int OgrenciNo;//field veya veri üyesi(dat member) veya instance variable
    String isim;
    //Ögrenci sınıfının içerisinde main yöntemi tanımlanıyor     

    public static void main(String[] args) {
        //Bir nesne (object) veya örneğin (instance) oluşturulması
        Ogrenci nesne1 = new Ogrenci();
        //nesnenin değerlerine ulaşım
        System.out.println(nesne1.OgrenciNo);//reference variable üyelere erişme
        System.out.println(nesne1.isim);
    }

}
