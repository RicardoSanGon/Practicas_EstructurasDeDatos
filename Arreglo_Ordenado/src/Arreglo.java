import java.util.Scanner;

public class Arreglo {

    private int Max=20;
    private char []Arreglo=new char[Max];
    private static int N=-1;

    private static char []Mayusculas={'A','B','C','D','E','F','G','H','I','J','K','L',
                                      'M','N','O','P','Q','R','S','T','U','V','W','X',
                                      'Y','Z'};

    private static char []Minusculas={'a','b','c','d','e','f','g','h','i','j','k','l',
                                      'm','n','o','p','q','r','s','t','u','v','w','x',
                                      'y','z'};


    private Scanner input=new Scanner(System.in);

    public void Inicializar()
    {
        N=-1;
    }

    public void Mostrar()
    {
        if(N==-1)
        {
            System.out.println();
            System.out.println("Arreglo vacio");
            System.out.println();
        }
        else
        {
            for(int i = 0; i<= N; i++)
            {
                System.out.println(Arreglo[i]);
            }
        }
    }

    public int Buscar_Ordenado(char valor)
    {
        for(int i=0;i<=N;)
        {
            if(Arreglo[i]==valor)
                return i;
            else
                i++;
        }
        return -1;
    }
    public void Eliminar(char valor)
    {
        int res=Buscar_Ordenado(valor);
        if(res==-1)
            System.out.println("Elemento no encontrado");
        else
        {
            for(int i=res;i<N;)
            {
                Arreglo[i]=Arreglo[i+1];
                i++;
            }
            N--;
            System.out.println("Elemento eliminado");
        }
    }

    public void Insertar_Ordenado()
    {
        int []ValoresArreglos=new int[Max];
        int posicion = 0;
        int ValorCaracter;
        if (N==Max-1){
            System.out.println("No hay espacio");
        return;}
        System.out.println("Ingrese nuevo valor");
        char valor=input.next().charAt(0);
        if (!Character.isAlphabetic(valor)){
            System.out.println("Carcater invalido");
            return;
        }
        if (N == -1) {
            Arreglo[0] = valor;
            N = 0;
            return;
        }
        ValorCaracter=BuscarValorCaracter(valor);
        for (int i=0;i<=N;i++){
            ValoresArreglos[i]=BuscarValorCaracter(Arreglo[i]);
        }

        if (Character.isUpperCase(valor)){
            for (int i =0;i<=N;){
                if (ValorCaracter<=ValoresArreglos[i]){
                    posicion=i;
                    break;
                }
                else {i++;if (i>N){posicion=i;}}
            }
        }
        else {
            for (int i =0;i<=N;){
                if (ValorCaracter<ValoresArreglos[i]){
                    posicion=i;
                    break;
                }
                else {i++;if (i>N){posicion=i;}}
            }
        }
        for (int i = N; i >= posicion; i--) {
            Arreglo[i + 1] = Arreglo[i];
        }
        Arreglo[posicion] = valor;
        N++;
        Mostrar();
    }
    public void Modificar(char valor){
        Eliminar(valor);
        Insertar_Ordenado();
    }

    public int BuscarValorCaracter(char valor)
    {
        for(int i=0;i<Mayusculas.length;)
            {
                if(Mayusculas[i]==valor )
                    return i;
                else if ( Minusculas[i]==valor)
                    return i;
                else
                    i++;
            }
        return -1;
    }
}
