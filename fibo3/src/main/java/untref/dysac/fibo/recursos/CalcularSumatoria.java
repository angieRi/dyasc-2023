package untref.dysac.fibo.recursos;

public class CalcularSumatoria {
    /**
     * suma el contenido del arreglo
     * @param fibonacciArray
     * @return
     */
    public int sumatoria(int[] fibonacciArray)
    {
        int auxSumatoria= 0;
        for (int i = 0; i < fibonacciArray.length; i++) {
            auxSumatoria +=fibonacciArray[i];
        }
        return auxSumatoria;
    }
}
