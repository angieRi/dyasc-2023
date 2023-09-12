package untref.dysac.fibo.salida;

public class ValidarComportamiento {
    final String MODO_SUMATORIA = "s";
    final String MODO_LISTA = "l";
    /***
     * s= sumatoria, l=lista
     * java -jar fibo.jar 5
     * java -jar fibo.jar -o=hd 5
     * java -jar fibo.jar -o=hd -m=s 5
     * java -jar fibo.jar -o=vd -f=salida.txt 5
     * java -jar fibo.jar -o=vd -f=salida.txt -m=s 5
     * java -jar fibo.jar -o=vd -f=salida.txt -m=l 5
     */
    /**
    public String validarTipoComportamiento(String[] args)
    {
        String comportamiento = "";
        int opcion= args.length;
        switch (opcion){
            case 1:
                comportamiento = this.validarNumero( argumento);
                break;
            case 2:
                comportamiento = this.validarNumero( argumento);
                break;
            case 3:
                comportamiento = this.validarNumero(argumento;
                break;
            case 4:
                comportamiento = this.validarNumero(argumento;
                break;
            default:
                System.out.println(" ");
                break;
        }
    }
     **/
    /**
     * Válida que el valor de args sea un numero entero mayor a cero
     * @return número
     */
    public int validarNumero( int argumento)
    {
        int numero = -1;
        try{
            numero = argumento >= 0 ? argumento : numero;
            return numero;
            // System.out.println(numero);
        }catch (NumberFormatException e) {
            return numero;
        }
    }

    /**
     *
     * @param valor
     * @return true si valor es entero
     */
    public boolean esEntero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     *
     * @param argumento
     * @return orientacion si el argumento contiene -o
     */
    public String validarOrientacionDireccion(String[] argumento)
    {
        String orientacion="";
        for (String arg : argumento) {
            if (arg.startsWith("-o=")) {
                orientacion = arg.substring(3, 5);
            }
        }
        return orientacion;
    }
    /**
     *
     * @param argumento
     * si el argumento contiene -f y tiene extensión .txt
     * @return nombre de archivo o null
     */
    public String validarArchivo(String[] argumento)
    {
        String archivo="";
        for (String arg : argumento) {
            if (arg.startsWith("-f=")) {
                archivo = arg.substring(3);
            }
        }
        // Verifica si la extensión del archivo es .txt
        if (archivo.endsWith(".txt")) {
            return archivo; // El archivo tiene una extensión válida
        } else {
            System.err.println("Error: El archivo debe tener extensión .txt");
            return null; // Devuelve null
        }
    }
    /**
     *
     * @param argumento
     * si argumento contiene -m y si es MODO_SUMATORIA O MODO_LISTA
     * @return modo  o null
     */
    public String validarModo(String[] argumento)
    {
        String modo="";
        for (String arg : argumento) {
            if (arg.startsWith("-m=")) {
                modo = arg.substring(3);
            }
        }
        if(modo.equals(MODO_SUMATORIA) || modo.equals(MODO_LISTA)){
            return modo;
        }
        return modo;
    }
}