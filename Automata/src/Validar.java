public class Validar {

  //El estado del Automata
    protected static char Caracter;     //El caracter que va estar leyendo el automata

    private static boolean Aceptacion=true;   //Para finalizar el ciclo
    
    private static char[] NumerosPares = {'0','2','4','6','8'};
    private static char[] NumerosInPares = {'1','3','5','7','9'};
    private static char[] ConsonantesMayus = {'B','C','D','F','G','H','J','K','L','M','N','Ñ','P','Q','R','S','T','V','W','X','Y','Z'};
    private static char[] Simbolo = {'@','#','&','%','$',};

    public static boolean ValidarExpresion(String Cadena)
    {
        int Estado=0;
        int i = 0;
        while (i < Cadena.length() && Aceptacion) {

            Caracter = Cadena.charAt(i);


            switch (Estado) {
                case 0 -> {
                    for (int y = 0; y < NumerosInPares.length; y++) {
                        if (Caracter == NumerosInPares[y]) {
                            Estado = 1;
                            Aceptacion = true;
                            y = NumerosInPares.length;
                        } else {
                            Aceptacion = false;
                        }
                    }
                }
                case 1 -> {
                    for (int y = 0; y < ConsonantesMayus.length; y++) {
                        if (Caracter == ConsonantesMayus[y]) {
                            Estado = 2;
                            Aceptacion = true;
                            y = ConsonantesMayus.length;
                        } else {
                            Aceptacion = false;
                        }
                    }
                }
                case 2 -> {
                    for (int y = 0; y < NumerosInPares.length; y++) {
                        if (Caracter == NumerosInPares[y]) {
                            Estado = 4;
                            Aceptacion = true;
                            y = NumerosInPares.length;
                        } else {
                            Aceptacion = false;
                        }
                    }
                    if (!Aceptacion){
                        for (int y = 0; y < NumerosPares.length; y++) {
                            if (Caracter == NumerosPares[y]) {
                                Estado = 8;
                                Aceptacion = true;
                                y = NumerosPares.length;
                            } else {
                                Aceptacion = false;
                            }
                        }
                        if (!Aceptacion){
                            for (int y = 0; y < Simbolo.length; y++) {
                                if (Caracter == Simbolo[y]) {
                                    Estado = 3;
                                    Aceptacion = true;
                                    y = Simbolo.length;
                                } else {
                                    Aceptacion = false;
                                }
                            }
                        }
                    }

                }
                case 4 -> {
                    for (int y = 0; y < NumerosInPares.length; y++) {
                        if (Caracter == NumerosInPares[y]) {
                            Estado = 5;
                            Aceptacion = true;
                            y = NumerosInPares.length;
                        } else {
                            Aceptacion = false;
                        }
                    }
                }
                case 5 -> {
                    for (int y = 0; y < NumerosInPares.length; y++) {
                        if (Caracter == NumerosInPares[y]) {
                            Estado = 5;
                            Aceptacion = true;
                            y = NumerosInPares.length;
                        } else {
                            Aceptacion = false;
                        }
                    }
                    if (!Aceptacion){
                        for (int y = 0; y < NumerosPares.length; y++) {
                            if (Caracter == NumerosPares[y]) {
                                Estado = 6;
                                Aceptacion = true;
                                y = NumerosPares.length;
                            } else {
                                Aceptacion = false;
                            }
                        }
                    }

                }
                case 6 -> {
                    for (int y = 0; y < Simbolo.length; y++) {
                        if (Caracter == Simbolo[y]) {
                            Estado = 7;
                            Aceptacion = true;
                            y = Simbolo.length;
                        } else {
                            Aceptacion = false;
                        }
                    }
                }

                case 8 -> {
                    for (int y = 0; y < NumerosInPares.length; y++) {
                        if (Caracter == NumerosInPares[y]) {
                            Estado = 9;
                            Aceptacion = true;
                            y = NumerosInPares.length;
                        } else {
                            Aceptacion = false;
                        }
                    }
                    if (!Aceptacion){
                        for (int y = 0; y < NumerosPares.length; y++) {
                            if (Caracter == NumerosPares[y]) {
                                Estado = 8;
                                Aceptacion = true;
                                y = NumerosPares.length;
                            } else {
                                Aceptacion = false;
                            }
                        }
                    }

                }
                case 9 -> {
                    for (int y = 0; y < Simbolo.length; y++) {
                        if (Caracter == Simbolo[y]) {
                            Estado = 10;
                            Aceptacion = true;
                            y = Simbolo.length;
                        } else {
                            Aceptacion = false;
                        }
                    }
                }
            }
            ;

            //System.out.println(Caracter);   //Comprueba que si lee cada caracter de la cadena
            i++;
        }
        if (Estado==3||Estado==7||Estado==10){

            if (Aceptacion){
                return true;
            }
            else {
                return false;
            }

        }
        else
        {return false;}

    }

}
