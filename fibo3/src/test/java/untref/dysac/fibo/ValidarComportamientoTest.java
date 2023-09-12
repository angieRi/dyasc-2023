package untref.dysac.fibo;

import org.junit.Test;
import static org.junit.Assert.*;
import untref.dysac.fibo.salida.ValidarComportamiento;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class ValidarComportamientoTest {
    ValidarComportamiento validacion;
    @Test
    public void validaNoEsEntero(){
        String[] args = {"S"};
        validacion = new ValidarComportamiento();
        assertFalse(validacion.esEntero(args[args.length-1]));
    }
    @Test
    public void validaSiEsEntero(){
        String[] args = {"8"};
        validacion = new ValidarComportamiento();
        assertTrue(validacion.esEntero(args[args.length-1]));
    }
    @Test
    public void entradaNoValidaComoNumero(){
        String[] args = {"Bug"};
        validacion = new ValidarComportamiento();
        int numero = validacion.esEntero(args[args.length-1])? Integer.parseInt(args[args.length-1]):-1;
        assertNotEquals(3, validacion.validarNumero(numero));
    }
    @Test
    public void entradaSiValidaComoNumero(){
        String[] args = {"10"};
        validacion = new ValidarComportamiento();
        int numero = validacion.esEntero(args[args.length-1])? Integer.parseInt(args[args.length-1]):-1;
        assertEquals(10, validacion.validarNumero(numero));
    }
    @Test
    public void entradaEsValidaComoOrientacionDireccion(){
        String[] args = {"-o=hd -m=s 5"};
        validacion = new ValidarComportamiento();
        assertEquals("hd", validacion.validarOrientacionDireccion(args));
    }
    @Test
    public void entradaNoValidaComoOrientacionDireccion(){
        String[] args = {"-o=er -m=s 5"};
        validacion = new ValidarComportamiento();
        assertNotEquals("hd", validacion.validarOrientacionDireccion(args));
    }
    @Test
    public void entradaEsValidaComoArchivo(){
        String[] args =  {"-o=vd", "-f=salida.txt", "5"};
        validacion = new ValidarComportamiento();
        assertEquals("salida.txt", validacion.validarArchivo(args));
    }
    @Test
    public void entradaNoValidaComoArchivo(){
        String[] args =  {"-o=vd", "-f=test.txt", "5"};
        validacion = new ValidarComportamiento();
        assertNotEquals("salida.txt", validacion.validarArchivo(args));
    }
    @Test
    public void entradaNoEsValidaArchivoExtensionInvalida(){
        String[] args =  {"-o=vd", "-f=salida.doc", "5"};
        validacion = new ValidarComportamiento();
        assertNull(validacion.validarArchivo(args));
    }
    @Test
    public void entradaNoEsValidaArchivoSinExtension(){
        String[] args =  {"-o=vd", "-f=salidatxt", "5"};
        validacion = new ValidarComportamiento();
        assertNull(validacion.validarArchivo(args));
    }
    @Test
    public void validarArchivoSinArgumentoF() {
        String[] args = {"-o=vd", "5"};
        validacion = new ValidarComportamiento();
        assertNull(validacion.validarArchivo(args));
    }
    @Test
    public void entradaEsModoValido(){
        String[] args =  {"-o=vd", "-f=salida.txt","-m=s", "5"};
        validacion = new ValidarComportamiento();
        assertEquals("s", validacion.validarModo(args));
    }
    @Test
    public void entradaNoEsModoValido(){
        String[] args =  {"-o=vd", "-f=test.txt","-m=b","5"};
        validacion = new ValidarComportamiento();
        assertNotEquals("s", validacion.validarModo(args));
    }

}
