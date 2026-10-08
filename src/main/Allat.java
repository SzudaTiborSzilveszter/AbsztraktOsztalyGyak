package main;

public abstract class Allat {
    private String nev;

    public Allat(String nev) {
        this.nev = nev;
    }
    
    public void eszik(){
        System.out.printf("%s eszik\n",nev);
    }

    public String getNev() {
        return nev;
    }
    
    public abstract void hangotAd(); 
}
