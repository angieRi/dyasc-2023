package untref.dysac.fibo.recursos;
public class SucesionFibonacci {
    /**
     * # Ejemplo
     fibo<8>: 0 1 1 2 3 5 8 13
     * @param numero
     * @return valor de la sucesión encontrada
     */
    public int fibonacci(int numero)
    {
        if(numero >= 0) {
            int fbncNumero;
            switch (numero) {
                case 0:
                    fbncNumero = numero;
                    break;
                case 1:
                    fbncNumero = numero;
                    break;
                default:
                    fbncNumero = fibonacci(numero - 1) + fibonacci(numero - 2);
                    break;
            }
            return fbncNumero;
        }else{
            return -1;
        }
    }
}
