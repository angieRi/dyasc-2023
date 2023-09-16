package untref.dysac.fibo;

import org.junit.Test;
import untref.dysac.fibo.recursos.SucesionFibonacci;
import static org.junit.Assert.assertEquals;

public class SucesionFibonacciTest {
    SucesionFibonacci sucesion;
    @Test
    public void sucesionFibonacciDe8()
    {
        sucesion = new  SucesionFibonacci();
        assertEquals(21, sucesion.fibonacci(8));
    }
    @Test
    public void sucesionFibonacciDe5() {
        sucesion = new  SucesionFibonacci();
        assertEquals(5, sucesion.fibonacci(5));
    }
    @Test
    public void sucesionFibonacciDe6() {
        sucesion = new  SucesionFibonacci();
        assertEquals(8, sucesion.fibonacci(6));
    }

    @Test
    public void sucesionFibonacciDe9() {
        sucesion = new  SucesionFibonacci();
        assertEquals(34, sucesion.fibonacci(9));
    }
    @Test
    public void sucesionFibonacciDe0() {
        sucesion = new  SucesionFibonacci();
        assertEquals(0, sucesion.fibonacci(0));
    }
    @Test
    public void sucesionFibonacciDeNegativo() {
        sucesion = new  SucesionFibonacci();
        assertEquals(-1, sucesion.fibonacci(-1));
        assertEquals(-1, sucesion.fibonacci(-8));
    }
}
