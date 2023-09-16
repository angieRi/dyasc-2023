package untref.dysac.fibo.comportamiento;
import untref.dysac.fibo.recursos.CalcularSumatoria;
import untref.dysac.fibo.recursos.EscribirArchivo;

public class FormatoSalida {
    EscribirArchivo escribirArchivo;
    public FormatoSalida(EscribirArchivo escribirArchivo){
        this.escribirArchivo = escribirArchivo;
    }
    /**
     * imprime fibonacci vertical y directo
     * @param fibonacciArray
     * @return
     */
    public String printFibonacciVerticalDirecto(int[] fibonacciArray,String cabecera) {
        StringBuilder texto = new StringBuilder(cabecera+"\n");
        for (int nro : fibonacciArray) {
            texto.append(nro).append("\n");
        }
        texto.append("\n");
        return String.valueOf(texto);
    }
    /**
     * imprime fibonacci vertical y inverso
     *
     * @param fibonacciArray
     * @return
     */
    public String printFibonacciVerticalInversa(int[] fibonacciArray, String cabecera) {
        StringBuilder texto = new StringBuilder(cabecera+"\n");
        for (int i = fibonacciArray.length - 1; i >= 0; i--) {
            texto.append(fibonacciArray[i] + " ").append("\n");
        }
        texto.append("\n");
        return String.valueOf(texto);
    }
    /**
     * imprime fibonacci horizontal y directo
     *
     * @param fibonacciArray
     * @return
     */
    public String printFibonacciHorizontalDirecto(int[] fibonacciArray, String cabecera) {
        StringBuilder texto = new StringBuilder(cabecera+" ");
        for (int nro : fibonacciArray) {
            texto.append(nro).append(" ");
        }
        texto.append("\n");
        return String.valueOf(texto);
    }
    /**
     * imprime fibonacci horizontal y inverso
     *
     * @param fibonacciArray
     * @return
     */
    public String printFibonacciHorizontalInversa(int[] fibonacciArray,String cabecera) {
        StringBuilder texto = new StringBuilder(cabecera+" ");
        for (int i = fibonacciArray.length - 1; i >= 0; i--) {
            texto.append(fibonacciArray[i]).append(" ");
        }
        texto.append("\n");
        return String.valueOf(texto);
    }
    /**
     * escribe en archivo
     * @param texto nombreArchivo numero
     */
    public void escribirEnArchivo(int numero,String nombreArchivo,String texto) {
        this.escribirArchivo.escribirEnArchivo(nombreArchivo,texto);
        System.out.println("fibo <" + numero + "> guardado en "+nombreArchivo);
    }
    public String consegirSumatoria(int[] fibonacciArray,String cabecera)
    {
        StringBuilder texto = new StringBuilder(cabecera+"\n");
        CalcularSumatoria sumatoria = new CalcularSumatoria();
        int suma  = sumatoria.sumatoria(fibonacciArray);
        texto.append("\n");
        texto.append(suma);
        return String.valueOf(texto);
    }
}