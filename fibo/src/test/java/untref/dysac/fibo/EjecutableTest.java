package untref.dysac.fibo;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class EjecutableTest
{
    @Test
    public void testVerticalDirecto() {
        String[] args = {"-o=vd", "8"};
        Ejecutable.main(args);
        assertEquals(21, Ejecutable.fibonacci(8));
    }

    @Test
    public void testVerticalInversa() {
        String[] args = {"-o=vi", "5"};
        Ejecutable.main(args);
        assertEquals(5, Ejecutable.fibonacci(5));

    }

    @Test
    public void testHorizontalDirect0() {
        String[] args = {"-o=hd", "6"};
        Ejecutable.main(args);
        assertEquals(8, Ejecutable.fibonacci(6));
    }

    @Test
    public void testHorizontalInversa() {
        String[] args = {"-o=hi", "9"};
        Ejecutable.main(args);
        assertEquals(34, Ejecutable.fibonacci(9));
    }
    @Test
    public void testFibonacci() {
        assertEquals(0, Ejecutable.fibonacci(0));
        assertEquals(1, Ejecutable.fibonacci(1));
        assertEquals(1, Ejecutable.fibonacci(2));
        assertEquals(2, Ejecutable.fibonacci(3));
        assertEquals(3, Ejecutable.fibonacci(4));
    }
}
