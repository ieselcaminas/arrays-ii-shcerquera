import main.Eliminar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EliminarTest {

    @Test
    void eliminar() {
        assertArrayEquals(new int[]{4, 8, 9, 5},
            Eliminar.eliminar(new int[]{4, 5, 8, 9}, 1));
    }

    @Test
    void moverAlFinal() {
        assertArrayEquals(new int[]{4, 8, 9, 5},
            Eliminar.moverAlFinal(new int[]{4, 5, 8, 9}, 1));
    }

    @Test
    void eliminarUltimo() {
        assertArrayEquals(new int[]{4, 5, 8, 9},
            Eliminar.eliminar(new int[]{4, 5, 8, 9}, 3), "No funciona cuando se elimina el último" );
    }

    @Test
    void moverUltimo() {
        assertArrayEquals(new int[]{4, 5, 8, 9},
            Eliminar.moverAlFinal(new int[]{4, 5, 8, 9}, 3), "No funciona cuando se elimina el último" );
    }

    @Test
    void eliminarPrimero() {
        assertArrayEquals(new int[]{5, 8, 9, 4},
            Eliminar.eliminar(new int[]{4, 5, 8, 9}, 0), "No funciona cuando se elimina el primero");
    }

    @Test
    void moverPrimero() {
        assertArrayEquals(new int[]{5, 8, 9, 4},
            Eliminar.moverAlFinal(new int[]{4, 5, 8, 9}, 0), "No funciona cuando se elimina el primero");
    }

    @Test
    void eliminarDeUnArrayMuyGrande() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 6},
            Eliminar.eliminar(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5), "No funciona cuando se elimina el primero");
    }

    @Test
    void moverUnArrayMuyGrande() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 6},
            Eliminar.moverAlFinal(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5), "No funciona cuando se elimina el primero");
    }

}
