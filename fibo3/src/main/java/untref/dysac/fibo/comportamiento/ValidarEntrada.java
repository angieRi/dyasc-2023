package untref.dysac.fibo.comportamiento;

public class ValidarEntrada {
    final String MODO_SUMATORIA = "s";
    final String MODO_LISTA = "l";
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
     * valida si es número válido para sucesión
     * @param numero
     * @return boolean
     */
    public boolean validarNumeroFibo( int numero)
    {
        boolean esNumeroValido = false;
        try{
            esNumeroValido = numero >= 0 ? true : false;
            return esNumeroValido;
        }catch (NumberFormatException e) {
            return esNumeroValido;
        }
    }
    /**
     *
     * @param argumento
     * @return boolean si el argumento contiene -o
     */
    public boolean validarOrientacionDireccion(String[] argumento)
    {
        boolean tieneOrientacion= false;
        try {

            for (String arg : argumento) {
                if (arg.startsWith("-o=")) {
                    tieneOrientacion = true;
                }
            }
            return tieneOrientacion;
        } catch (Exception e) {
            return tieneOrientacion;
        }
    }
    /**
     *
     * @param argumento
     * si el argumento contiene -f y tiene extensión .txt
     * @return true si existe un nombre de archivo válido, si no false
     */
    public boolean validarArchivo(String[] argumento)
    {
        boolean escribeEnArchivo= false;
        try {
            String archivo = "";
            for (String arg : argumento) {
                if (arg.startsWith("-f=")) {
                    escribeEnArchivo = true;
                    archivo = arg.substring(3);
                    // Verifica si la extensión del archivo es .txt
                    if (archivo.endsWith(".txt")) {
                        return escribeEnArchivo; // El archivo tiene una extensión válida
                    } else {
                        System.out.print("Error: El archivo debe tener extensión .txt ");
                        return false;
                    }
                }
            }
            return escribeEnArchivo;
        } catch (Exception e) {
            return escribeEnArchivo;
        }
    }
    /**
     *
     * @param argumento
     * si argumento contiene -m y si es MODO_SUMATORIA O MODO_LISTA
     * @return true si modo contiene un valor si no falso
     */
    public boolean validarModo(String[] argumento)
    {
        boolean tieneModo= false;
        try {
            for (String arg : argumento) {
                if (arg.startsWith("-m=")) {
                    String modo = arg.substring(3);
                    if(modo.equals(MODO_SUMATORIA) || modo.equals(MODO_LISTA)){
                        tieneModo = true;
                    }
                }
            }
            return tieneModo;
        } catch (Exception e) {
            return tieneModo;
        }
    }
}