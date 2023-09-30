import java.util.Scanner;

public class Arreglo {
    int operacion=0;
    private int Max=20;
    private char []Arreglo=new char[Max];
    private static int N=-1;

    private static char []Mayusculas={'A','B','C','D','E','F','G','H','I','J','K','L',
                                      'M','N','O','P','Q','R','S','T','U','V','W','X',
                                      'Y','Z'};

    private static char []Minusculas={'a','b','c','d','e','f','g','h','i','j','k','l',
                                      'm','n','o','p','q','r','s','t','u','v','w','x',
                                      'y','z'};

    private int []Posicion=new int[Max];

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
        if (N==Max-1)
            System.out.println("No hay espacio");
        else
        {
            System.out.println("Ingrese nuevo valor");
            char valor=input.next().charAt(0);
            operacion=0;
            int CaracterPosicion=BuscarPosicionCaracter(valor,operacion);
            if (CaracterPosicion==-1)
            {
                System.out.println("Caracter no valido");
            }
            else
            {
                if (N==-1)
                {
                    N++;
                    Arreglo[N]=valor;
                }
                else
                {
                    int ArregloCaracteresPoasicion;
                    operacion=1;
                    for (int i=0;i<=N;i++){
                        ArregloCaracteresPoasicion=BuscarPosicionCaracter(Arreglo[i],operacion);
                        Posicion[i]=ArregloCaracteresPoasicion;
                    }
                    if (CaracterPosicion < 26)
                    {
                        int PosicionCaracter=Max;
                        for (int i=0;i<=N;){
                            if (CaracterPosicion>Posicion[i])
                            {
                                i++;
                            }
                            else
                            {
                                PosicionCaracter=i;
                                    i=N+1;
                            }
                        }
                        if (PosicionCaracter==Max)
                        {
                            N++;
                            Arreglo[N]=valor;
                        }
                        else
                        {
                            for(int i=N;i>=PosicionCaracter;)
                            {
                                Arreglo[i+1]=Arreglo[i];
                                i--;
                            }
                            Arreglo[PosicionCaracter]=valor;
                            N++;
                        }
                    }
                    else
                    {
                        int PosicionCaracter=Max;
                        CaracterPosicion=CaracterPosicion-26;
                        int i=0;
                        for (int y=0 ; y<=N;){
                            if (CaracterPosicion>=Posicion[y])
                            {
                                y++;
                            }
                            else
                            {
                                PosicionCaracter=y;
                                y=N+1;
                            }
                            i++;
                        }
                        if (i>N)
                        {
                            PosicionCaracter=i;
                        }
                        if (PosicionCaracter==Max)
                        {
                            N++;
                            Arreglo[N]=valor;
                        }
                        else
                        {

                            for(i=N;i>=PosicionCaracter;)
                            {
                                Arreglo[i+1]=Arreglo[i];
                                i--;
                            }
                            Arreglo[PosicionCaracter]=valor;
                            N++;
                        }
                    }

                }
            }
        }
    }

    public int BuscarPosicionCaracter(char valor,int operacion)
    {
        if (operacion == 1) {
            for(int i=0;i<Mayusculas.length;)
            {
                if(Mayusculas[i]==valor )
                    return i;
                else if ( Minusculas[i]==valor)
                    return i;
                else
                    i++;
            }

        }
    else {
            for(int i=0;i<Mayusculas.length;)
            {
                if(Mayusculas[i]==valor )
                    return i;
                else if ( Minusculas[i]==valor)
                    return i+26;
                else
                    i++;
            }
            return -1;
        }
        return -1;
    }
    public void Modificar(char valor){
        Eliminar(valor);
        Insertar_Ordenado();
    }
}
