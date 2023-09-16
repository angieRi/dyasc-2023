package untref.dysac.fibo.comportamiento;

public class GenerarEntrada {
    private static final String DEFAULT_OD = "hd";
    private ValidarEntrada validacion;
    public GenerarEntrada(ValidarEntrada validacion)
    {
        this.validacion = validacion;
    }
    /**
     * Válida que el valor de args sea un numero entero mayor a cero
     * @return número
     */
    public int conseguirNumeroValido( String numero)
    {
        int numeroValido= -1;
        try{
            if(validacion.esEntero(numero)){
                numeroValido=Integer.parseInt(numero);
                numeroValido =  validacion.validarNumeroFibo(numeroValido)? Integer.parseInt(numero):-1;
            }
            return numeroValido;
        }catch (NumberFormatException e) {
            System.out.println("El número no es válido");
        }
        return numeroValido;
    }
    /**
     *
     * @param argumento
     * @return orientacion si el argumento contiene -o
     */
    public String conseguirOrientacionDireccion(String[] argumento)
    {
        String orientacion=null;
        if(this.validacion.validarOrientacionDireccion(argumento)){
            for (String arg : argumento) {
                if (arg.startsWith("-o=")) {
                    orientacion = arg.length() == 5?arg.substring(3, 5):arg.substring(3,4);
                }
            }
        }else{
            orientacion=DEFAULT_OD;
        }

        return orientacion;
    }
    /**
     *
     * @param argumento
     * si el argumento contiene -f y tiene extensión .txt
     * @return nombre de archivo o null
     */
    public String conseguirArchivo(String[] argumento)
    {
        String archivo=null;
        if(this.validacion.validarArchivo(argumento)){
            for (String arg : argumento) {
                if (arg.startsWith("-f=")) {
                    archivo = arg.substring(3);
                }
            }
        }
        return archivo;
    }
    /**
     *
     * @param argumento
     * si argumento contiene -m y si es MODO_SUMATORIA O MODO_LISTA
     * @return modo  o null
     */
    public String conseguirModo(String[] argumento)
    {
        String modo=null;
        if(this.validacion.validarModo(argumento)) {
            for (String arg : argumento) {
                if (arg.startsWith("-m=")) {
                    modo = arg.substring(3);
                }
            }
        }
        return modo;
    }
}