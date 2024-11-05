package test;

import main.SumaIgual;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumaIgualTest {

    @Test
    void sumaIgual() {
        assertEquals("[2 + 4] [3 + 3] [5 + 1]",
            SumaIgual.sumaIguales(new int[]{2, 3, 3, 5, 4, 1}, 6).trim());
    }

    @Test
    void sumaIgualDaVacio() {
        assertEquals("Ninguna coincidencia",
            SumaIgual.sumaIguales(new int[]{2, 3, 3, 5, 4, 1}, 22).trim());
    }

    @Test
    void sumaIgualTodos() {
        assertEquals("[1 + 1] [1 + 1] [1 + 1] [1 + 1] [1 + 1] [1 + 1]",
            SumaIgual.sumaIguales(new int[]{1, 1, 1, 1}, 2).trim());
    }

}
