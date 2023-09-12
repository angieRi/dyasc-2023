package untref.dysac.fibo;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest
{
    @Test
    public void testValidarComportamiento() {
        String[] args = {"-o=vd", "8"};
        Main.main(args);
    }
    //Fibonacci sucesionFibonacci ;
    /**
    @Test
    public void testVerticalDirecto() {
        String[] args = {"-o=vd", "8"};
        Main.main(args);
        sucesionFibonacci = new Fibonacci(8, null, null);
        assertEquals(21, sucesionFibonacci.fibonacci(8));
    }

    @Test
    public void testVerticalInversa() {
        String[] args = {"-o=vi", "5"};
        Main.main(args);
        sucesionFibonacci = new Fibonacci(5, null, null);
        assertEquals(5, sucesionFibonacci.fibonacci(5));

    }

    @Test
    public void testHorizontalDirect0() {
        String[] args = {"-o=hd", "6"};
        Main.main(args);
        sucesionFibonacci = new Fibonacci(6, null, null);
        assertEquals(8, sucesionFibonacci.fibonacci(6));
    }

    @Test
    public void testHorizontalInversa() {
        String[] args = {"-o=hi", "9"};
        Main.main(args);
        sucesionFibonacci = new Fibonacci(9, null, null);
        assertEquals(34, sucesionFibonacci.fibonacci(9));
    }
    @Test
    public void testFibonacci() {
        sucesionFibonacci = new Fibonacci(0, null, null);
        assertEquals(0, sucesionFibonacci.fibonacci(0));
        assertEquals(1, sucesionFibonacci.fibonacci(1));
        assertEquals(1, sucesionFibonacci.fibonacci(2));
        assertEquals(2, sucesionFibonacci.fibonacci(3));
        assertEquals(3, sucesionFibonacci.fibonacci(4));
    }
    **/
}
