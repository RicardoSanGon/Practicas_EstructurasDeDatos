import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        int suboption=0;
        Arreglo ar=new Arreglo();


        do {
            System.out.println("---------------------------------");
            System.out.println("Menu"+"\n"+"Introduzca una opcion");
            System.out.println("1.- Inicializar/Borrar arreglo");
            System.out.println("2.- Mostrar arreglo");
            System.out.println("3.- Buscar");
            System.out.println("4.- Insertar");
            System.out.println("5.- Eliminar");
            System.out.println("6.- Modificar");
            System.out.println("7.- Creditos");
            System.out.println("8.- Salir");
            System.out.print("Opcion:");
            option=input.nextInt();
            char Caracter;
            switch (option) {
                case 1 -> ar.Inicializar();
                case 2 -> ar.Mostrar();
                case 3 -> {
                    System.out.println("Ingrese el valo que va buscar");
                    Caracter = input.next().charAt(0);
                    int res = ar.Buscar_Ordenado(Caracter);
                    if (res == -1)
                        System.out.println("El valor no se encontro");
                    else
                        System.out.println("Posicion del valor buscado: " + res);
                }
                case 4 -> ar.Insertar_Ordenado();
                case 5 -> {
                    System.out.println("Ingrese el valor para eliminar");
                    Caracter = input.next().charAt(0);
                    ar.Eliminar(Caracter);
                }
                case 6 -> {
                    System.out.println("Ingrese el valor para eliminar");
                    Caracter = input.next().charAt(0);
                    ar.Modificar(Caracter);
                }
                case 7 -> {
                    System.out.println();
                    System.out.println("Creditos");
                    System.out.println("----------------------------------------");
                    System.out.println("Carrera: Desarrollo de software multiplataforma");
                    System.out.println("Materia: Estructura de Datos");
                    System.out.println("Grado: 4   |   Seccion: B");
                    System.out.println("Ricardo Sanchez Gonzalez |  22170038");
                    System.out.println("Jesus Aranda Rodriguez |  22170016");
                    System.out.println();
                    System.out.println("1.- Salir");
                    suboption = input.nextInt();      //Para parar el ciclo de las opciones y no se quiten los creditos
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                default -> {
                    System.out.println("Saliendo......");
                    option = 8;
                }
            }

        }while(option!=8);
        }
    }
