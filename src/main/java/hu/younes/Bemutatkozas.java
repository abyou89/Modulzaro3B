package hu.younes;

import hu.younes.modell.Ember;

public class Bemutatkozas {

    private Ember[] emberek;

    public Bemutatkozas(){
        this.emberek = new Ember[5];
        emberek[0] = new Ember("Béla", 18);
        emberek[1] = new Ember("Jóska", 22, "angol");
        emberek[2] = new Ember("Éva", 20,"olasz");
        emberek[3] = new Ember("Evelin", 28,"angol,francia");
        emberek[4] = new Ember("Béla", 31,"német");

        megjelenit();


    }

    public void megjelenit(){
        String szoveg = "";
        for (int i = 0; i < emberek.length; i++) {
            String nev = emberek[i].getNev();
            int kor = emberek[i].getKor();
            String nyelv = emberek[i].getNyelv();
            szoveg += nev + " " + kor + " " + nyelv;
        }
        System.out.println(szoveg);
    }

}
