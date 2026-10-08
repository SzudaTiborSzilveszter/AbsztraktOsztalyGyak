package main;

public class Kutya extends Allat{

public Kutya(String nev) {
    super(nev);//az ős String paramétert váró konstruktorának a hívása
}

@Override
public void hangotAd(){
        System.out.println("Vau");
    }
}