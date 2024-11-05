package test;

import main.Iguales;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTest {

    @Test
    void letraDNI() {
        assertEquals(17, Iguales.Sample.suma(5, 12));
    }
}
