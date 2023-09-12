package untref.dysac.fibo.comportamiento;

public class FormatoSalidaConsola {

    /**
     * imprime fibonacci vertical y directo
     * @param fibonacciArray
     */
    public void printFibonacciVerticalDirecto(int[] fibonacciArray,int numero) {
        System.out.print("fibo <" + numero + ">: ");
        System.out.println();
        for (int nro : fibonacciArray) {
            System.out.println(nro);
        }
    }
    /**
     * imprime fibonacci vertical y inverso
     * @param fibonacciArray
     */
    public void printFibonacciVerticalInversa(int[] fibonacciArray,int numero) {
        System.out.print("fibo <" + numero + ">: ");
        System.out.println();
        for (int i = fibonacciArray.length - 1; i >= 0; i--) {
            System.out.println(fibonacciArray[i] + " ");
        }
    }
    /**
     * imprime fibonacci horizontal y directo
     * @param fibonacciArray
     */
    public void printFibonacciHorizontalDirecto(int[] fibonacciArray,int numero) {
        System.out.print("fibo <" + numero + ">: ");

        for (int nro : fibonacciArray) {
            System.out.print(nro + " ");
        }
    }
    /**
     * imprime fibonacci horizontal y inverso
     * @param fibonacciArray
     */
    public void printFibonacciHorizontalInversa(int[] fibonacciArray,int numero) {
        System.out.print("fibo <" + numero + ">: ");
        for (int i = fibonacciArray.length - 1; i >= 0; i--) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}
