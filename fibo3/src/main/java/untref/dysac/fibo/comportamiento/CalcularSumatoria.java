package untref.dysac.fibo.comportamiento;

public class CalcularSumatoria {
    public int sumatoria(int[] fibonacciArray)
    {
        int auxSumatoria= 0;
        for (int i = 0; i < fibonacciArray.length; i++) {
            auxSumatoria += i;
        }
        return auxSumatoria;
    }
}
