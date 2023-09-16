package untref.dysac.fibo;

import untref.dysac.fibo.recursos.EscribirArchivo;
import untref.dysac.fibo.comportamiento.FormatoSalida;
import untref.dysac.fibo.comportamiento.GenerarSalida;
import untref.dysac.fibo.comportamiento.GenerarEntrada;
import untref.dysac.fibo.comportamiento.ValidarEntrada;

public class Main {
	public static void main(String[] args) {
		ValidarEntrada validador = new ValidarEntrada();
		GenerarEntrada dataEntrada = new GenerarEntrada(validador);
		EscribirArchivo escribir = new EscribirArchivo();
		FormatoSalida formatoSalida = new FormatoSalida(escribir);
		GenerarSalida salidaFibonacci = new GenerarSalida(dataEntrada,formatoSalida,args);
	}
}