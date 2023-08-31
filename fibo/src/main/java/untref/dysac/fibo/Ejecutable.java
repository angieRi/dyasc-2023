package untref.dysac.fibo;

public class Ejecutable {
	public static void main(String[] args) {

		//# Ejemplo 4, sin -o
		if (args.length == 1) {
			int n = Integer.parseInt(args[0]);
			System.out.print("fibo <" + n + ">: ");
			for (int i = 0; i < n; i++) {
				System.out.print(fibonacci(i) + " ");//realiza y muestra la sucesión
			}
		}
		if (args.length > 1) {
			String orientacion = null;
			String direccion=null;
			int n = 0;
			for (String arg : args) {
				if (arg.startsWith("-o=")) {
					orientacion = arg.substring(3, 4);
					direccion = arg.substring(4, 5);
				} else {
					n = Integer.parseInt(arg);
				}
			}
			generarFibonacci(n,orientacion,direccion);//imprime fibonacci de n por orientación y dirección
		}
	}
	/**
	 * imprime el fibonacci por orientación y direción
	 * @param n
	 * @param orientation
	 * @param direction
	 */
	private static void generarFibonacci(int n, String orientation, String direction) {
		int[] fibonacciArray = new int[n];
		for (int i = 0; i < n; i++) {
			fibonacciArray[i]=fibonacci(i); //llama a función fibonacci
		}
		String opcion = orientation+direction;
		switch (opcion){
			case "hd":
				printFibonacciHorizontalDirecto(fibonacciArray);
				break;
			case "hi":
				printFibonacciHorizontalInversa(fibonacciArray);
				break;
			case "vd":
				printFibonacciVerticalDirecto(fibonacciArray);
				break;
			case "vi":
				printFibonacciVerticalInversa(fibonacciArray);
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
	private static void printFibonacciVerticalDirecto(int[] fibonacciArray) {
		for (int numero : fibonacciArray) {
			System.out.println(numero);
		}
	}
	/**
	 * imprime fibonacci vertical y inverso
	 * @param fibonacciArray
	 */
	private static void printFibonacciVerticalInversa(int[] fibonacciArray) {
		for (int i = fibonacciArray.length - 1; i >= 0; i--) {
			System.out.println(fibonacciArray[i]);
		}
	}
	/**
	 * imprime fibonacci horizontal y directo
	 * @param fibonacciArray
	 */
	private static void printFibonacciHorizontalDirecto(int[] fibonacciArray) {
		for (int numero : fibonacciArray) {
			System.out.print(numero + " ");
		}
	}
	/**
	 * imprime fibonacci horizontal y inverso
	 * @param fibonacciArray
	 */
	private static void printFibonacciHorizontalInversa(int[] fibonacciArray) {
		for (int i = fibonacciArray.length - 1; i >= 0; i--) {
			System.out.print(fibonacciArray[i] + " ");
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
