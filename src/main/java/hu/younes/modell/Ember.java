package hu.younes.modell;

public class Ember {

    private String nev;
    private int kor;
    private String nyelv;


    public Ember(String nev, int kor) {
        this(nev,kor, "nem beszél");
    }

    public Ember(String nev, int kor,String nyelv) {
        this.nev = nev;
        this.kor = kor;
        this.nyelv = nyelv;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNyelv() {
        return nyelv;
    }
}
