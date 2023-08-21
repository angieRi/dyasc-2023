package ar.edu.untref.dyasc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SucesionFibonacci {

	public static void main(String[] args) {
       	Scanner reader = new Scanner(System.in);
    	int numero = 0;
    	System.out.println("Introduce un número para la sucesión:");
    	try {
    		numero = reader.nextInt();
    		//mientras el número es menor a cero muestra msj de advertencia
    		while(numero < 0) {
    			 System.out.println("¡Cuidado! Solo puedes insertar un número mayor a cero. ");
    			 numero = reader.nextInt();
    		}
			System.out.println("Fibonacci <"+numero+">:");
			for (int i = 0; i < numero; i++) {
			   System.out.print(fibonacci(i) + " ");//realiza y muestra la sucesión
			}
		  } catch (InputMismatchException ime){
			  System.out.println("Solo puedes insertar números. ");
			  reader.next();
		}
    }
    /**
     * # Ejemplo
		fibo<8>: 0 1 1 2 3 5 8 13
     * @param numero
     * @return valor de la sucesión encontrada
     */
    public static int fibonacci(int numero) 
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
}
