import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option=0;
        int suboption=0;
        String Cadena;
        boolean ER_validada;
        Validar validador_cadena;    //Variable para un objeto
        validador_cadena=new Validar();    //Instanciar objeto

        do {
            System.out.println("Menu"+"\n"+"Introduzca una opcion");
            System.out.println("1.- Capturar cadena de entrada");
            System.out.println("2.- Creditos");
            System.out.println("3.- Salir");
            System.out.print("Opcion:");
            option=input.nextInt();

            switch (option){
                case 1:
                    do{
                        System.out.println();
                        System.out.println("Para salir introduzca '/'");
                        System.out.println("--------------------------------");
                        System.out.println("Capturar cadena");
                        Cadena=input.next();
                        if(!Cadena.equals("/")) {
                            ER_validada = validador_cadena.ValidarExpresion(Cadena);  //Funcion para el automata, se envia una cadena de texto
                            if (ER_validada)
                                System.out.println("Expresion valida");
                            else
                                System.out.println("La expresion no es valida");
                        }
                    }while(!Cadena.equals("/"));
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Creditos");
                    System.out.println("----------------------------------------");
                    System.out.println("Carrera: Desarrollo de software multiplataforma");
                    System.out.println("Materia: Estructura de Datos");
                    System.out.println("Grado: 4   |   Seccion: B");
                    System.out.println("Ricardo Sanchez Gonzalez |  22170038");
                    System.out.println("Jesus Aranda Rodriguez |  22170016");
                    System.out.println("Alfredo Cholico Brizuela |  22170184");
                    System.out.println();
                    System.out.println("1.- Salir");
                    suboption=input.nextInt();      //Para parar el ciclo de las opciones y no se quiten los creditos
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                default:
                    System.out.println("Saliendo......");
                    break;
            }

        }while(option!=3);

    }
}