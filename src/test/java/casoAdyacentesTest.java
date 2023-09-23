package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class casoAdyacentesTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void productoAdyacentes() {
        int[] arreglo = {1, 0, 3, 7, 0, 5};
        int[] arreglo2 = {-3,2,-5,1,-8,2};
        int[] arreglo3 = {2,2,2,2,2};
        int[] arreglo4 = {7,3};
        assertEquals(21, casoAdyacentes.productoAdyacentes(arreglo));
        assertEquals(-5, casoAdyacentes.productoAdyacentes(arreglo2));
        assertEquals(4, casoAdyacentes.productoAdyacentes(arreglo3));
        assertEquals(21 , casoAdyacentes.productoAdyacentes(arreglo4));
    }
}
