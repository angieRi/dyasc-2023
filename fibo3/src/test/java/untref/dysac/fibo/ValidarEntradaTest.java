package untref.dysac.fibo;

import org.junit.Test;
import untref.dysac.fibo.comportamiento.ValidarEntrada;
import static org.junit.Assert.*;

public class ValidarEntradaTest {
    ValidarEntrada validacion;
    @Test
    public void validaNoEsEntero(){
        String[] args = {"S"};
        validacion = new ValidarEntrada();
        assertFalse(validacion.esEntero(args[args.length-1]));
    }

    @Test
    public void validaSiEsEntero(){
        String[] args = {"8"};
        validacion = new ValidarEntrada();
        assertTrue(validacion.esEntero(args[args.length-1]));
    }
    @Test
    public void entradaNoValidaComoNumero(){
        String[] args = {"Bug"};
        validacion = new ValidarEntrada();
        int numero = validacion.esEntero(args[args.length-1])? Integer.parseInt(args[args.length-1]):-1;
        assertFalse( validacion.validarNumeroFibo(numero));
    }
    @Test
    public void entradaSiValidaComoNumero(){
        String[] args = {"10"};
        validacion = new ValidarEntrada();
        int numero = validacion.esEntero(args[args.length-1])? Integer.parseInt(args[args.length-1]):-1;
        assertTrue(validacion.validarNumeroFibo(numero));
    }
    @Test
    public void entradaEsValidaComoOrientacionDireccion(){
        String[] args = {"-o=hd -m=s 5"};
        validacion = new ValidarEntrada();
        assertTrue(validacion.validarOrientacionDireccion(args));
    }
    @Test
    public void entradaNoValidaComoOrientacionDireccion(){
        String[] args = {"-m=s 5"};
        validacion = new ValidarEntrada();
        assertFalse(validacion.validarOrientacionDireccion(args));
    }
    @Test
    public void entradaEsValidaComoArchivo(){
        String[] args =  {"-o=vd", "-f=salida.txt", "5"};
        validacion = new ValidarEntrada();
        assertTrue( validacion.validarArchivo(args));
    }
    @Test
    public void validarArchivoSinArgumentoF() {
        String[] args =  {"-o=vd", "5"};
        validacion = new ValidarEntrada();
        assertFalse( validacion.validarArchivo(args));
    }
    @Test
    public void entradaNoEsValidaArchivoExtensionInvalida(){
        String[] args =  {"-o=vd", "-f=salida.doc", "5"};
        validacion = new ValidarEntrada();
        assertFalse(validacion.validarArchivo(args));
    }
    @Test
    public void entradaNoEsValidaArchivoSinExtension(){
        String[] args =  {"-o=vd", "-f=salidatxt", "5"};
        validacion = new ValidarEntrada();
        assertFalse(validacion.validarArchivo(args));
    }
    @Test
    public void entradaEsModoValido(){
        String[] args =  {"-o=vd", "-f=salida.txt","-m=s", "5"};
        validacion = new ValidarEntrada();
        assertTrue( validacion.validarModo(args));
    }
    @Test
    public void entradaNoEsModoValido(){
        String[] args =  {"-o=vd", "-f=test.txt","-m=b","5"};
        validacion = new ValidarEntrada();
        assertFalse(validacion.validarModo(args));
    }
    @Test
    public void entradaModoValidoSinArgumentoM(){
        String[] args =  {"-o=vd", "-f=test.txt","5"};
        validacion = new ValidarEntrada();
        assertFalse(validacion.validarModo(args));
    }
}
