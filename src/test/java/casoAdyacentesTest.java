import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class casoAdyacentesTest {

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void productoAdyacentes() {
        int[] arreglo = {1, 0, 3, 7, 0, 5};
        int resultado = casoAdyacentes.productoAdyacentes(arreglo);
        assertEquals(21, resultado);

    }
}