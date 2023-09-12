package untref.dysac.fibo.comportamiento;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class EscribirSalidaArchivo {

    public void escribirEnArchivo(String textoSucesion, String nombreArchivo, String mensaje) {
        try {
            // ruta del archivo
            Path rutaArchivo = Path.of(nombreArchivo);

            // Escribe el texto en el archivo (si el archivo no existe, lo crea)
            Files.write(rutaArchivo, textoSucesion.getBytes(), StandardOpenOption.CREATE);

            System.out.println(mensaje);
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }
}
