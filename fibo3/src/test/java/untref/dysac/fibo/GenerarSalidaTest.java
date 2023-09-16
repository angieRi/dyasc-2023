package untref.dysac.fibo;

import org.junit.Test;
import static org.junit.Assert.*;
import untref.dysac.fibo.recursos.EscribirArchivo;
import untref.dysac.fibo.comportamiento.FormatoSalida;
import untref.dysac.fibo.comportamiento.GenerarEntrada;
import untref.dysac.fibo.comportamiento.ValidarEntrada;
import untref.dysac.fibo.comportamiento.GenerarSalida;

public class GenerarSalidaTest {
    GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
    EscribirArchivo archivo = new EscribirArchivo();

    @Test
    public void validaEntradaDatosDelArgumento() {
        String[] args = {"-o=vd", "8"};
        GenerarSalida salidaConsola = new GenerarSalida(dataEntrada, new FormatoSalida(archivo),args);
        assertNotNull(salidaConsola.comportamiento);
        assertEquals("vd",salidaConsola.comportamiento);
        assertNotEquals("ss",salidaConsola.comportamiento);
        assertNull(salidaConsola.archivo);
        assertNull(salidaConsola.modo);
        assertEquals(8,salidaConsola.numero);
        assertNotEquals(-1,salidaConsola.numero);
    }
    @Test
    public void imprimePorOrientacionDireccion() {
        String[] args = {"-o=vd", "8"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertEquals("vd",salida.obtenerComportamientoSalida());
        assertNotEquals("s",salida.obtenerComportamientoSalida());
    }
    @Test
    public void porOrientacionDireccionNoValida() {
        String[] args = {"-o=v", "8"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertNotEquals("s",salida.obtenerComportamientoSalida());
        assertEquals("v",salida.obtenerComportamientoSalida());
    }
    @Test
    public void escribePorOrientacionDireccionEnArchivo() {
        String[] args = {"-o=vd","-f=salida.txt", "5"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertEquals("f",salida.obtenerComportamientoSalida());
        assertNotEquals("od",salida.obtenerComportamientoSalida());
    }
    @Test
    public void escribePorOrientacionDireccionYSumatoriaEnArchivo() {
        String[] args = {"-o=vd", "-f=salida.txt","-m=s", "5"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertEquals("fms",salida.obtenerComportamientoSalida());
        assertNotEquals("fm",salida.obtenerComportamientoSalida());
    }
    @Test
    public void escribePorOrientacionDireccionYListaEnArchivo() {
        String[] args = {"-o=vd", "-f=salida.txt","-m=l", "5"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertEquals("fml",salida.obtenerComportamientoSalida());
        assertNotEquals("fm",salida.obtenerComportamientoSalida());
    }
    @Test
    public void imprimePorOrientacionDireccionYSumatoriaEnConsola() {
        String[] args = {"-o=vd","-m=s", "5"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertEquals("s",salida.obtenerComportamientoSalida());
        assertNotEquals("fm",salida.obtenerComportamientoSalida());
    }
    @Test
    public void imprimePorOrientacionDireccionYListaEnConsola() {
        String[] args = {"-o=vd","-m=l", "5"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertEquals("l",salida.obtenerComportamientoSalida());
        assertNotEquals("fm",salida.obtenerComportamientoSalida());
    }
    @Test
    public void noimprimePorNumeroNoValido() {
        String[] args = {"-1"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertNull(salida.obtenerComportamientoSalida());
        assertNotEquals("m",salida.obtenerComportamientoSalida());
    }
    @Test
    public void imprimeListaPorNumeroValido() {
        String[] args = {"1"};
        GenerarEntrada dataEntrada = new GenerarEntrada(new ValidarEntrada());
        EscribirArchivo escribir = new EscribirArchivo();
        GenerarSalida salida = new GenerarSalida(dataEntrada, new FormatoSalida(escribir), args);
        assertEquals("hd",salida.obtenerComportamientoSalida());
        assertNotEquals("m",salida.obtenerComportamientoSalida());
    }
}