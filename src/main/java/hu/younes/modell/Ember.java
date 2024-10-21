package hu.younes.modell;

import java.util.ArrayList;
import java.util.List;

public class Ember {

    private String nev;
    private int kor;
    private List<String> nyelvek;


    public Ember(String nev, int kor) {
        this(nev, kor, new ArrayList<>());
        this.nyelvek.add("nem beszél");
    }

    public Ember(String nev, int kor, String nyelv) {
        this(nev, kor, new ArrayList<>());
        this.nyelvek.add(nyelv);
    }

    public Ember(String nev, int kor, List<String> nyelvek) {
        this.nev = nev;
        this.kor = kor;
        this.nyelvek = nyelvek;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public List<String> getNyelvek() {
        return nyelvek;
    }

    public void hozzaadNyelv(String nyelv) {
        this.nyelvek.add(nyelv);
    }
}
