package untref.dysac.fibo;

import org.junit.Test;
import static org.junit.Assert.*;
import untref.dysac.fibo.comportamiento.GenerarEntrada;
import untref.dysac.fibo.comportamiento.ValidarEntrada;
import static org.junit.Assert.assertNotEquals;

public class GenerarEntradaTest {
    ValidarEntrada validarDato;
    GenerarEntrada entrada;
    @Test
    public void entradaNoEsNumero(){
        String[] args = {"Bug"};
        entrada = new GenerarEntrada(new ValidarEntrada());
        String numero = args[args.length-1];
        assertNotEquals(1, entrada.conseguirNumeroValido(numero));
    }
    @Test
    public void entradaSiEsNumero(){
        String[] args = {"10"};
        entrada = new GenerarEntrada(new ValidarEntrada());
        String numero = args[args.length-1];
        assertEquals(10, entrada.conseguirNumeroValido(numero));
    }
    @Test
    public void entradaSiEsOrientacionDireccion(){
        String[] args = {"-o=h -m=s 5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        System.out.print(entrada.conseguirOrientacionDireccion(args));
        assertEquals("h", entrada.conseguirOrientacionDireccion(args));
    }
    @Test
    public void entradaNoEsOrientacionDireccion(){
        String[] args = {"-o=er -m=s 5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        assertNotEquals("hd", entrada.conseguirOrientacionDireccion(args));
    }
    @Test
    public void entradaEsNombreArchivo(){
        String[] args =  {"-o=vd", "-f=salida.txt", "5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        assertEquals("salida.txt", entrada.conseguirArchivo(args));
    }
    @Test
    public void entradaNoValidaComoArchivo(){
        String[] args =  {"-o=vd", "-f=test.txt", "5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        assertNotEquals("salida.txt", entrada.conseguirArchivo(args));
    }
    @Test
    public void entradaNoEsValidaArchivoExtensionInvalida(){
        String[] args =  {"-o=vd", "-f=salida.doc", "5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        assertNull(entrada.conseguirArchivo(args));
    }
    @Test
    public void entradaNoEsValidaArchivoSinExtension(){
        String[] args =  {"-o=vd", "-f=salidatxt", "5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        assertNull(entrada.conseguirArchivo(args));
    }
    @Test
    public void entradaArchivoSinArgumentoF() {
        String[] args = {"-o=vd", "5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        assertNull(entrada.conseguirArchivo(args));
    }
    @Test
    public void entradaEsModoValido(){
        String[] args =  {"-o=vd", "-f=salida.txt","-m=s", "5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        assertEquals("s", entrada.conseguirModo(args));
    }
    @Test
    public void entradaNoEsModoValido(){
        String[] args =  {"-o=vd", "-f=test.txt","-m=b","5"};
        entrada = new GenerarEntrada(new ValidarEntrada() );
        assertNotEquals("s", entrada.conseguirModo(args));
    }

}