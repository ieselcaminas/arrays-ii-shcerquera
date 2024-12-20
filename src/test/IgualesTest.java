package test;

import main.Iguales;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class IgualesTest {

    @Test
    void sonIguales() {
        assertTrue(Iguales.sonIguales(new int[]{2, 5, 8, 9}, new int[]{2, 5, 8, 9}));
    }

    @Test
    void difiereElPrimero() {
        assertFalse(Iguales.sonIguales(new int[]{2, 5, 8, 9}, new int[]{3, 5, 8, 9}));
    }

    @Test
    void difiereElUltimo() {
        assertFalse(Iguales.sonIguales(new int[]{3, 5, 8, 10}, new int[]{3, 5, 8, 9}));
    }

    @Test
    void difiereInterior() {
        assertFalse(Iguales.sonIguales(new int[]{2, 5, 4, 9}, new int[]{2, 5, 8, 9}));
    }

    @Test
    void sonIgualesVacio() {
        assertTrue(Iguales.sonIguales(new int[]{}, new int[]{}));
    }

}
