package untref.dysac.fibo.comportamiento;
import untref.dysac.fibo.recursos.SucesionFibonacci;
import java.util.Objects;

public class GenerarSalida {
    private static final String ARCHIVO_MODO_SUMATORIA = "fms" ;
    private static final String ARCHIVO_MODO_LISTA = "fml" ;
    private static final String ARCHIVO_DEFAULT = "f";
    private static final String OPCION_NO_VALIDA = "nv";
    final String MODO_SUMATORIA = "s";
    final String MODO_LISTA = "l";
    final String HORIZONTAL_DIRECTA = "hd";
    final String HORIZONTAL_INVERSA = "hi";
    final String VERTICAL_DIRECTA = "vd";
    final String VERTICAL_INVERSA = "vi";
    public String comportamiento;
    public String archivo;
    public String modo;
    public int numero;
    private FormatoSalida formatoSalida;
    private GenerarEntrada entradaFibo;
    public GenerarSalida(GenerarEntrada entradaFibo, FormatoSalida formatoSalida, String[] argumento)
    {
        this.formatoSalida = formatoSalida;
        this.entradaFibo = entradaFibo;
        this.validarEntradasDeArgumento(argumento);
    }
    /**
     * valida el contenido del argumento
     */
    public void validarEntradasDeArgumento(String[] argumento) {
        String ultimoValor = argumento[argumento.length - 1];//obtengo el valor del número para la sucesión
        try {
            this.numero = this.entradaFibo.conseguirNumeroValido(ultimoValor);
            if (this.numero >= 0) {
                SucesionFibonacci sucesion = new SucesionFibonacci();
                int[] fibonacciArray = new int[this.numero];
                for (int i = 0; i < this.numero; i++) {
                    fibonacciArray[i] = sucesion.fibonacci(i); //llama a la sucesion fibonacci
                }
                String comportamientoAux = this.entradaFibo.conseguirOrientacionDireccion(argumento);
                this.comportamiento = comportamientoAux != null?comportamientoAux:OPCION_NO_VALIDA;//valida guarda orientación y dirección
                this.archivo = this.entradaFibo.conseguirArchivo(argumento);//valida y guarda nombre de archivo
                this.modo = this.entradaFibo.conseguirModo(argumento);//valida y guarda el modo de escritura sumatoria o lista
                this.salidaEnConsolaOArchivo();
            }
        } catch (ExceptionInInitializerError error) {
            System.err.println("Ocurrió un error al conseguir datos del argumento: " + error.getMessage());
        }
    }
    /**
     * @return retorna el comportamiento de salida según entrada por argumento
     * guarfa el valor en un String
     */
    public String obtenerComportamientoSalida() {
        String comportamientoSalida= (this.numero < 0)?null:HORIZONTAL_DIRECTA;
        if (this.archivo != null && this.modo != null) {
            comportamientoSalida = this.modo.equals(MODO_SUMATORIA) ? ARCHIVO_MODO_SUMATORIA : ARCHIVO_MODO_LISTA;
        }
        if (this.archivo != null && this.modo == null) {
            comportamientoSalida = ARCHIVO_DEFAULT;
        }
        if (this.archivo == null && this.modo != null  && (this.modo.equals(MODO_SUMATORIA) || this.modo.equals(MODO_LISTA))) {
            comportamientoSalida = this.modo.equals(MODO_SUMATORIA) ? MODO_SUMATORIA : MODO_LISTA;
        }

        if (!Objects.equals(this.comportamiento, OPCION_NO_VALIDA) && this.archivo == null && this.modo == null) {
            comportamientoSalida = this.comportamiento;
        } else if (Objects.equals(this.comportamiento, OPCION_NO_VALIDA)) {
            comportamientoSalida = OPCION_NO_VALIDA;
        }
        return comportamientoSalida;
    }

    /**
     *escribe o imprime en cosolo según lo ingresado en el argumento
     */
    public void salidaEnConsolaOArchivo()
    {
        try{
        String  cabecera = "fibo <" + this.numero + ">:";
        String opcion = this.obtenerComportamientoSalida();
         switch (opcion) {
             case ARCHIVO_MODO_SUMATORIA:
                 cabecera = "fibo <" + this.numero + ">:s";
                 this.escribirEnArchivo(this.archivo, cabecera, this.numero, MODO_SUMATORIA);
                 break;
             case ARCHIVO_MODO_LISTA:
                 this.escribirEnArchivo(this.archivo, cabecera, this.numero, this.comportamiento);//ver comportamiento
                 break;
             case ARCHIVO_DEFAULT:
                 this.escribirEnArchivo(this.archivo, cabecera, this.numero, HORIZONTAL_DIRECTA);
                 break;
             case MODO_SUMATORIA:
                 cabecera = "fibo <" + this.numero + ">:s";
                 System.out.print(this.conseguirComportamiento(this.numero, MODO_SUMATORIA, cabecera));
                 break;
             case HORIZONTAL_DIRECTA:
                 System.out.print(this.conseguirComportamiento(this.numero, HORIZONTAL_DIRECTA, cabecera));
                 break;
             default:
                 System.out.print(this.conseguirComportamiento(this.numero, this.comportamiento, cabecera));
                 break;
            }
         } catch (ExceptionInInitializerError e){
            System.err.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }
    /**
     * escribe en archivo la sucesión
     * @param archivo
     * @param cabecera
     * @param numero
     * @param comportamiento
     */
    public void escribirEnArchivo(String archivo,String cabecera,int numero,String comportamiento)
    {
        String texto = this.conseguirComportamiento(numero,comportamiento,cabecera);
        formatoSalida.escribirEnArchivo(numero,archivo,texto);
    }
    /**
     * Consigue fibonacci por orientación y direción
     * @return
     */
    public String conseguirComportamiento(int numero, String comportamiento, String cabecera) {
        String texto="";
                SucesionFibonacci sucesion = new SucesionFibonacci();
        int[] fibonacciArray = new int[numero];
        for (int i = 0; i < numero;i++) {
            fibonacciArray[i] = sucesion.fibonacci(i); //llama a la sucesion fibonacci
        }
        switch (comportamiento){
            case HORIZONTAL_DIRECTA:
                texto= formatoSalida.printFibonacciHorizontalDirecto(fibonacciArray,cabecera);
                break;
            case HORIZONTAL_INVERSA:
                texto= formatoSalida.printFibonacciHorizontalInversa(fibonacciArray,cabecera);
                break;
            case VERTICAL_DIRECTA:
                texto= formatoSalida.printFibonacciVerticalDirecto(fibonacciArray,cabecera);
                break;
            case VERTICAL_INVERSA:
                texto=  formatoSalida.printFibonacciVerticalInversa(fibonacciArray,cabecera);
                break;
            case MODO_SUMATORIA:
                texto=  formatoSalida.consegirSumatoria(fibonacciArray,cabecera);
                break;
            default:
                texto="Opciones no válidas";
                break;
        }
        return texto;
    }
}