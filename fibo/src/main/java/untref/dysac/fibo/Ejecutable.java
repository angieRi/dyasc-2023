package untref.dysac.fibo;


public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
            System.out.println("java -jar fibo.jar n");
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.print("fibo <" + n + ">: ");
    	
		for (int i = 0; i < n; i++) {
		   System.out.print(fibonacci(i) + " ");//realiza y muestra la sucesión
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
