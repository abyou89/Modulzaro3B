package hu.younes;

import hu.younes.modell.Ember;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void testNyelvHozzaad() {
        Ember ember = new Ember("Jóska",22,"angol");
        ember.hozzaadNyelv("spanyol");
        boolean kapott = ember.getNyelvek().contains("spanyol");
        Assertions.assertEquals(true,kapott);
    }

    @Test
    public void testAlapertelmezettNyelv() {
        Ember ember = new Ember("Béla",18);
        boolean kapott = ember.getNyelvek().contains("nem beszél");
        Assertions.assertEquals(true,kapott);
    }

    @Test
    public void testTobbnyelvHozzaad() {
        Ember ember = new Ember("Éva",20,"olasz");
        ember.hozzaadNyelv("francia");
        ember.hozzaadNyelv("angol");
        int kapott = ember.getNyelvek().size();
        Assertions.assertEquals(3,kapott);
    }

}