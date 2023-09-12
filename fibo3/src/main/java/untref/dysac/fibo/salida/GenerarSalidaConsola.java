package untref.dysac.fibo.salida;

import untref.dysac.fibo.comportamiento.FormatoSalidaConsola;
import untref.dysac.fibo.sucesion.SucesionFibonacci;

public class GenerarSalidaConsola {
    final String HORIZONTAL_DERECHA = "hd";
    final String HORIZONTAL_IZQUIERDA = "hi";
    final String VERTICAL_DERECHA = "vd";
    final String VERTICAL_IZQUIERDA = "vi";
    final String OPCION_DEFAULT = "Opciones no válidas";
     int numero;
     String comportamiento;
    private FormatoSalidaConsola formatoSalida;
    public GenerarSalidaConsola(FormatoSalidaConsola formatoSalida,int numero,String comportamiento)
    {
        this.formatoSalida = formatoSalida;
        this.numero=numero;
        this.comportamiento=comportamiento;
    }
    /**
     * imprime el fibonacci por orientación y direción
     */
    public void generarSalida()
    {
        SucesionFibonacci sucesion = new SucesionFibonacci();
        int[] fibonacciArray = new int[this.numero];
        for (int i = 0; i < this.numero; i++) {
            fibonacciArray[i]= sucesion.fibonacci(i); //llama a función fibonacci
        }
        String opcion = this.comportamiento;
        switch (opcion){
            case HORIZONTAL_DERECHA:
                formatoSalida.printFibonacciHorizontalDirecto(fibonacciArray,this.numero);
                break;
            case HORIZONTAL_IZQUIERDA:
                formatoSalida.printFibonacciHorizontalInversa(fibonacciArray,this.numero);
                break;
            case VERTICAL_DERECHA:
                formatoSalida.printFibonacciVerticalDirecto(fibonacciArray,this.numero);
                break;
            case VERTICAL_IZQUIERDA:
                formatoSalida.printFibonacciVerticalInversa(fibonacciArray,this.numero);
                break;
            default:
                System.out.println(OPCION_DEFAULT);
                break;
        }
    }
}
