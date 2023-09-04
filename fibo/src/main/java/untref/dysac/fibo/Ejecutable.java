package untref.dysac.fibo;
public class Ejecutable {

	public static void main(String[] args) {
		Fibonacci sucesionFibonacci ;
		//# Ejemplo 4, sin -o
		if (args.length == 1) {
			int n = Integer.parseInt(args[0]);
			sucesionFibonacci = new Fibonacci(n, null, null);
			System.out.print("fibo <" + n + ">: ");
			for (int i = 0; i < n; i++) {
				System.out.print(sucesionFibonacci.fibonacci(i) + " ");//realiza y muestra la sucesión
			}
		}
		if (args.length > 1) {
			String orientacion = null;
			String direccion=null;
			int n = 0;
			Fibonacci sucesionFibonacci2 ;
			for (String arg : args) {
				if (arg.startsWith("-o=")) {
					orientacion = arg.substring(3, 4);
					direccion = arg.substring(4, 5);
				} else {
					n = Integer.parseInt(arg);
				}
			}
			sucesionFibonacci2 = new Fibonacci(n, orientacion, direccion);
			sucesionFibonacci2.generarFibonacci();//imprime fibonacci de n por orientación y dirección
		}
	}


}
