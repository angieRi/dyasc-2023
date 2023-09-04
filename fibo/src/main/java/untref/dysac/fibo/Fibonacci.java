package untref.dysac.fibo;

public class Fibonacci {
    String orientacion;
    String direccion;
    int numero;
    public Fibonacci(int n, String orientacion, String direccion)
    {
        this.numero= n;
        this.orientacion = orientacion;
        this.direccion = direccion;
    }
    /**
     * # Ejemplo
     fibo<8>: 0 1 1 2 3 5 8 13
     * @param numero
     * @return valor de la sucesión encontrada
     */
    public int fibonacci(int numero)
    {
        int fbncNumero;
        switch (numero) {
            case 0:
                fbncNumero=numero;
                break;
            case 1:
                fbncNumero=numero;
                break;
            default:
                fbncNumero = fibonacci(numero-1) + fibonacci(numero-2);
                break;
        }
        return fbncNumero;
    }
    /**
     * imprime el fibonacci por orientación y direción
     */
    public void generarFibonacci() {

        int[] fibonacciArray = new int[this.numero];
        for (int i = 0; i < this.numero; i++) {
            fibonacciArray[i]= this.fibonacci(i); //llama a función fibonacci
        }
        String opcion = this.orientacion+this.direccion;
        switch (opcion){
            case "hd":
                this.printFibonacciHorizontalDirecto(fibonacciArray);
                break;
            case "hi":
                this.printFibonacciHorizontalInversa(fibonacciArray);
                break;
            case "vd":
                this.printFibonacciVerticalDirecto(fibonacciArray);
                break;
            case "vi":
                this.printFibonacciVerticalInversa(fibonacciArray);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    /**
     * imprime fibonacci vertical y directo
     * @param fibonacciArray
     */
    private void printFibonacciVerticalDirecto(int[] fibonacciArray) {
        for (int numero : fibonacciArray) {
            System.out.println(numero);
        }
    }
    /**
     * imprime fibonacci vertical y inverso
     * @param fibonacciArray
     */
    private void printFibonacciVerticalInversa(int[] fibonacciArray) {
        for (int i = fibonacciArray.length - 1; i >= 0; i--) {
            System.out.println(fibonacciArray[i]);
        }
    }
    /**
     * imprime fibonacci horizontal y directo
     * @param fibonacciArray
     */
    private void printFibonacciHorizontalDirecto(int[] fibonacciArray) {
        for (int numero : fibonacciArray) {
            System.out.print(numero + " ");
        }
    }
    /**
     * imprime fibonacci horizontal y inverso
     * @param fibonacciArray
     */
    private void printFibonacciHorizontalInversa(int[] fibonacciArray) {
        for (int i = fibonacciArray.length - 1; i >= 0; i--) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}
