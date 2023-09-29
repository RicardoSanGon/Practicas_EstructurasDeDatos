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
        this.N=-1;
    }

    public void Mostrar()
    {
        if(this.N==-1)
        {
            System.out.println();
            System.out.println("Arreglo vacio");
            System.out.println();
        }
        else
        {
            for(int i=0;i<=this.N;i++)
            {
                System.out.println(Arreglo[i]);
            }
        }
    }

    public int Buscar_Ordenado(char valor)
    {
        for(int i=0;i<this.N;)
        {
            if(Arreglo[i]<valor)
                i++;
            else
                return i;
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
            for(int i=res;i<this.N;)
            {
                Arreglo[i]=Arreglo[i+1];
                i++;
            }
            this.N--;
            System.out.println("Elemento eliminado");
        }
    }

    public void Insertar_Ordenado()
    {
        if (this.N==Max-1)
            System.out.println("No hay espacio");
        else
        {
            System.out.println("Ingrese nuevo valor");
            char valor=input.next().charAt(0);
            int res=Buscar_Ordenado(valor);
            if (res==-1)
            {
                this.N=this.N+1;
                Arreglo[this.N]=valor;
                Mostrar();
            }
            else
            {
                for(int i=this.N;i>=res;)
                {
                    Arreglo[i+1]=Arreglo[i];
                    i--;
                }
                Arreglo[res]=valor;
                N++;
            }
        }
    }

}
