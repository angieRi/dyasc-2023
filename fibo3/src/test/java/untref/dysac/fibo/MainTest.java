package untref.dysac.fibo;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static junit.framework.TestCase.assertEquals;

/**
 * Unit test for simple App.
 */
public class MainTest
{
    @Test
    public void iniciaFibo3() {
        String[] args = {"-o=vd", "8"};
        Main.main(args);
    }
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void metodoQueImprimeEnConsola() {
        String[] args = {"-o=vd","-f=salida.txt", "5"};
        // Llama al método que imprime en la consola
        Main.main(args);
        // Captura la salida estándar y verifica la salida esperada
        String expectedOutput = "fibo <5> guardado en salida.txt\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
