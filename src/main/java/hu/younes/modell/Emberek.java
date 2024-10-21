package hu.younes.modell;

public class Emberek {

    private String nev;
    private int kor;
    private String[] nyelv;


    public Emberek(String nev, int kor) {
        this(nev,kor, new String[]{"nem beszél"});
    }

    public Emberek(String nev, int kor, String[] nyelv) {
        this.nev = nev;
        this.kor = kor;
        this.nyelv = nyelv;
    }

    public String getNev(String nev) {
        nev = this.nev;
        return nev;
    }

    public int getKor(int kor){
        kor = this.kor;
        return kor;
    }

    public String[] getNyelv(String[] nyelv) {
        nyelv = this.nyelv;
        return nyelv;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setNyelv(String[] nyelv) {
        this.nyelv = nyelv;
    }
}
