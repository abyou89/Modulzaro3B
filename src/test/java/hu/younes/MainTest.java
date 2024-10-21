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

}