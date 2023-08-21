package ar.edu.untref.dyasc;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EjemploTest {

    @Test
    public void pruebaDeFibonacci() {
        assertEquals(0, SucesionFibonacci.fibonacci(0));
        assertEquals(1, SucesionFibonacci.fibonacci(1));
        assertEquals(3, SucesionFibonacci.fibonacci(5));
        assertEquals(13, SucesionFibonacci.fibonacci(8));
    }

}
