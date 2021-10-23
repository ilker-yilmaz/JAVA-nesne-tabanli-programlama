package oop.pkg30_.java_polimorfizmi_.method_overriding.pkg2;

class Banka {

    int faizOrani() {
        return 0;
    }
}

class YapiKredi extends Banka {

    int faizOrani() {
        return 8;
    }
}

class Garanti extends Banka {

    int faizOrani() {
        return 7;
    }
}

class İsBankasi extends Banka {

    int faizOrani() {
        return 9;
    }
}

public class OOP30_JAVA_POLİMORFİZMİ_METHOD_OVERRİDİNG2 {

    public static void main(String[] args) {
        YapiKredi yb = new YapiKredi();
        Garanti gb = new Garanti();
        İsBankasi ib = new İsBankasi();

        System.out.println("YapıKredi Bankası Faiz Oranı: " + yb.faizOrani());
        System.out.println("Garanti Bankası Faiz Oranı: " + gb.faizOrani());
        System.out.println("İş Bankası Faiz Oranı: " + ib.faizOrani());

    }

}
