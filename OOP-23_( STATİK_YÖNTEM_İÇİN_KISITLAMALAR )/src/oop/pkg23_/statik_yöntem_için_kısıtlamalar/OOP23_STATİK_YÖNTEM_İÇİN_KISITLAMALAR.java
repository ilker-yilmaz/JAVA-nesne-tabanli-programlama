package oop.pkg23_.statik_yöntem_için_kısıtlamalar;

public class OOP23_STATİK_YÖNTEM_İÇİN_KISITLAMALAR {

    static int a = 40;//static olarak tanımlanmazsa hata verir.

    public static void main(String[] args) {
        /**
         * java main() yöntemi neden statik olarak tanımlanmaktadır? -->
         * nesnenin statik bir yöntem çağırması gerekmediği içindir. --> Statik
         * olmayan bit yöntem olsaydı, JVM önce bir nesne oluşturur ve fazladan
         * bellek ayırma sorununa yola açarak main() yöntemini çağırır
         */
        System.out.println(a);
    }

}
