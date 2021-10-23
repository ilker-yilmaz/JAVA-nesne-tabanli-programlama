package oop.pkg25_.this_anahtar_sözcüğünün_gerekli_olmadığı_program;

public class Ogrenci {
int ogrenciNo;
    String isim;
    float burs;
    
    Ogrenci(int o, String i, float b){
    ogrenciNo=o;
    isim=i;
    burs=b;
}
    void bilgileriGoster(){
        System.out.println(ogrenciNo+" "+isim+" "+burs);
    }
   
}
class TestOgrenci{
    public static void main(String[] args) {
        Ogrenci nesne1=new Ogrenci(111,"İlker",5000f);
        Ogrenci nesne2=new Ogrenci(222, "Yılmaz",6000f);
        nesne1.bilgileriGoster();
        nesne2.bilgileriGoster();
    }
}