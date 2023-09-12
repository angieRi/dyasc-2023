package untref.dysac.fibo;

import org.junit.Test;
import untref.dysac.fibo.sucesion.SucesionFibonacci;

import static org.junit.Assert.assertEquals;

public class SucesionFibonacciTest {
    SucesionFibonacci sucesion;
    @Test
    public void testFibonacci()
    {
        sucesion = new  SucesionFibonacci();
        assertEquals(21, sucesion.fibonacci(8));
    }

}
