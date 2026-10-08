package main;

public class Program {
    public static void main(String[] args) {
        Allat allatAkiKutya = new Kutya("KutyaÁllat");
        Allat allatAkiMacska = new Macska("MacskaÁllat");
        
        Kutya k1 = new Kutya("Dobby");
        Kutya k2 = new Kutya("Félix");
        k1.eszik();
        k1.hangotAd();
        k2.eszik();
        k2.hangotAd();
        
        Macska m1 = new Macska("Poppy");
        Macska m2 = new Macska("Feline");
        m1.eszik();
        m1.hangotAd();
        m2.eszik();
        m2.hangotAd();
        
        Kutya[] kutyak = {k1, k2, new Kutya("Pizsi")};
        Macska[] macskak = {m1, m2, new Macska("Cirmi")};
        Allat[] allatok = {allatAkiKutya, allatAkiMacska, k1, m1, k2, m2};
        
        System.out.println("Állatok, akik esznek: ");
        for (Allat allat : allatok) {
            allat.eszik();
            allat.hangotAd();
        }
    }
}
