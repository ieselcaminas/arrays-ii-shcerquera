
import EJERCICIOS.Duplicados;
import jdk.internal.foreign.abi.Binding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicadosTest {
    @Test
    void duplicados() {
        assertEquals("10, 30,", Duplicados.duplicados(new int[]{10, 10, 4, 20, 30, 65, 30}).trim());
    }

    @Test
    void todosDuplicados() {
        assertEquals("10, 4, 20, 30, 65,", Duplicados.duplicados(new int[]{10, 10, 4, 4, 20, 30, 65, 30, 65, 20}).trim());
    }

    @Test
    void sinDuplicados() {
        assertEquals("", Duplicados.duplicados(new int[]{1, 2, 3, 4}).trim());
    }
}

