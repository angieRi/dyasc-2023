package untref.dysac.fibo.recursos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class EscribirArchivo {

    /**
     * escribe en archivo el texto pasado por parametro
     * @param nombreArchivo
     * @param texto
     */
    public void escribirEnArchivo(String nombreArchivo,String texto) {
        try {
            //ruta del archivo
            Path rutaArchivo = Path.of(nombreArchivo);
            //Escribe el texto en el archivo (si el archivo no existe, lo crea)
            Files.write(rutaArchivo, texto.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }
}