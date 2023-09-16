package untref.dysac.fibo;

import org.junit.Test;
import untref.dysac.fibo.recursos.EscribirArchivo;
import untref.dysac.fibo.comportamiento.FormatoSalida;
import untref.dysac.fibo.recursos.SucesionFibonacci;

public class FormatoSalidaTest {
    @Test
    public void escribeEnArchivo()
    {
        SucesionFibonacci sucesion = new SucesionFibonacci();
        int[] fibonacciArray = new int[5];
        for (int i = 0; i < 5;i++) {
            fibonacciArray[i] = sucesion.fibonacci(i); //llama a la sucesion fibonacci
        }
        EscribirArchivo escribir = new EscribirArchivo();
        FormatoSalida formato = new FormatoSalida(escribir);
        String texto =formato.printFibonacciHorizontalDirecto(fibonacciArray,"fibo <" + 5 + ">:");
        formato.escribirEnArchivo(5,"text.txt",texto);
    }
    @Test
    public void escribirEnArchivoLaSumatoria()
    {
        SucesionFibonacci sucesion = new SucesionFibonacci();
        int[] fibonacciArray = new int[5];
        for (int i = 0; i < 5;i++) {
            fibonacciArray[i] = sucesion.fibonacci(i); //llama a la sucesion fibonacci
        }
        EscribirArchivo escribir = new EscribirArchivo();
        FormatoSalida formato = new FormatoSalida(escribir);
        String texto =formato.consegirSumatoria(fibonacciArray,"fibo <" + 5 + ">:s");
        formato.escribirEnArchivo(5,"text.txt",texto);
    }
}
