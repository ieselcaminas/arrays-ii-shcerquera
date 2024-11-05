import main.EJERCICIOS.Inverso;
import org.junit.jupiter.api.Test;

class InversoTest {

    @Test
    void revertBigArray() {
        assertArrayEquals(new int[]{10, 9, 8, 5, 3, 2}, Inverso.invertir(new int[]{2, 3, 5, 8, 9, 10}));
    }

    @Test
    void revertSmallArray() {
        assertArrayEquals(new int[]{5, 3, 2}, Inverso.invertir(new int[]{2, 3, 5}));
    }

    @Test
    void revertExerciseArray() {
        assertArrayEquals(new int[]{65, 50, 45,30,25,10}, Inverso.invertir(new int[]{10, 25, 30, 45, 50, 65}));
    }
}
