import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int option;
        Conversion convertir=new Conversion();
        do{
            System.out.println("-------------------------");
            System.out.println("Practica Pilas");
            System.out.println("-------------------------");
            System.out.println("1-Introducir expresión");
            System.out.println("2-Mostrar");
            System.out.println("3-Creditos");
            System.out.println("4-Salir");
            System.out.print("Opcion: ");
            option=input.nextInt();
            switch (option){
                case 1->{
                    String EI;
                    System.out.println();
                    System.out.println();
                    System.out.println("Ingrese expresion infija");
                    EI=input.next();
                    System.out.println(convertir.Convertir(EI));
                }
                case 2->{System.out.println(convertir.Mostrar());}
                case 3->{
                    System.out.println("------------");
                    System.out.println("Credios");
                    System.out.println("------------");
                    System.out.println("Estructura de datos");
                    System.out.println("Practica pilas");
                    System.out.println("Jesus Aranda Rodriguez || 22170016");
                    System.out.println("Ricardo Ramon Sanchez Gonzalez || 22170038");
                    System.out.println("Salir '/'");
                    char salir=input.next().charAt(0);
                }
                default -> {
                    option=4;
                    System.out.println("Saliendo...");
                }
            }
        }while (option!=4);
    }
}