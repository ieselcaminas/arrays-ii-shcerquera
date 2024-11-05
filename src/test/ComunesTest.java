package test;

import main.Comunes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComunesTest {

    @Test
    void comunes() {
        assertEquals("2, 3, 5,", Comunes.comunes(new int[]{2, 4, 8, 3, 5}, new int[]{9, 1, 2, 3, 5}).trim());
    }

    @Test
    @DisplayName("Se repite el mismo varias veces")
    void comunesRepetidos() {
        assertEquals("2, 4, 2, 5,", Comunes.comunes(new int[]{2, 4, 2, 3, 5}, new int[]{9, 1, 2, 4, 5, 5}).trim());
    }

    @Test
    @DisplayName("No se repite nada")
    void comunesVacio() {
        assertEquals("", Comunes.comunes(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}).trim());
    }

    @Test
    @DisplayName("Se repite todo")
    void comunesSeRepitenTodos() {
        assertEquals("1, 2, 3, 4, 5,", Comunes.comunes(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}).trim());
    }

}
