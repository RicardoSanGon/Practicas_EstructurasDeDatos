import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int op;
        Cola cola=new Cola();

        do{
            System.out.println("---------------------");
            System.out.println("Practica colas");
            System.out.println("---------------------");
            System.out.println("1-Inicializar cola");
            System.out.println("2-Mostrar cola");
            System.out.println("3-Agregar elemento");
            System.out.println("4-Eliminar elemento");
            System.out.println("5-Creditos");
            System.out.println("6-Salir");
            op=input.nextInt();
            switch (op){
                case 1->{
                    System.out.println();
                    System.out.println();
                    System.out.println("Inicializando Cola");
                    cola.Inicializar();
                }
                case 2->{
                    System.out.println();
                    System.out.println();
                    System.out.println("Mostrando...");
                    cola.Mostrar();
                }
                case 3->{
                    System.out.println();
                    System.out.println();
                    System.out.println("Valor a insertar");
                    int valor=input.nextInt();
                    cola.Insertar(valor);
                }
                case 4->{
                    System.out.println();
                    System.out.println();
                    System.out.println(cola.Eliminar());
                }
                case 5->{
                    System.out.println("------------");
                    System.out.println("Credios");
                    System.out.println("------------");
                    System.out.println("Estructura de datos");
                    System.out.println("Practica pilas");
                    System.out.println("Jesus Aranda Rodriguez || 22170016");
                    System.out.println("Ricardo Ramon Sanchez Gonzalez || 22170038");
                    System.out.println("Salir '/'");
                    char salir=input.next().charAt(0);}
                default -> op=6;
            }
        }while (op<6);
    }
}