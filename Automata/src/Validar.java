public class Validar {

    private static int Estado=0;  //El estado del Automata
    protected static char Caracter;     //El caracter que va estar leyendo el automata

    private static boolean ciclo=true;   //Para finalizar el ciclo

    public static boolean ValidarExpresion(String Cadena)
    {
        int i = 0;
        while (i < Cadena.length() && ciclo) {
            Caracter = Cadena.charAt(i);
            System.out.println(Caracter);   //Comprueba que si lee cada caracter de la cadena
            i++;
        }
        return false;      //Aqui se envia si se cumple o no la validacion
    }

}
