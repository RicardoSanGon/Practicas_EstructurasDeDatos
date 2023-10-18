import java.util.Scanner;

public class Cola {
    private int MAX=5;
    private static int I=-1,F=-1;
    private int [] Cola=new int[MAX];
    private Scanner input=new Scanner(System.in);
    private int valor;

    public void Inicializar(){
        I=F=-1;
    }
    public void Mostrar(){
        int Inicio=I,Fin=F;
        if(Inicio==-1)
            System.out.println("Cola vacia");
        else
        {
            if (Fin<Inicio){
                for(int i=Inicio;i<=MAX-1;i++)
                    System.out.println(Cola[i]);
                for(int i=0;i<=Fin;i++)
                    System.out.println(Cola[i]);
            }
            else
                for(int i=Inicio;i<=Fin;i++)
                    System.out.println(Cola[i]);
        }
    }
    public void Insertar(int Valor){
        if(I==-1)
        {
            I=F=0;
            Cola[I]=Valor;
        }
        else {
            System.out.println("¿Quiere insertar por el Final?");
            System.out.println("1-Si / 2-No");
            int Res=input.nextInt();
            if(Res==1)
            {
                if(F==MAX-1 && I==0)
                    System.out.println("Cola llena desde el final");
                else if(F==MAX-1 && I!=0)
                {
                    F=0;
                    Cola[F]=Valor;
                }
                else
                {
                    F++;
                    Cola[F]=Valor;
                }
            }
            else
            {
                if(I==0 && F==MAX-1)
                    System.out.println("Cola llena desde el inicio");
                else if(I==0 && F!=MAX-1)
                {
                    I=MAX-1;
                    Cola[I]=Valor;
                }
                else
                {
                    I--;
                    Cola[I]=Valor;
                }
            }
        }
    }
    public int Eliminar(){
        if(I==-1)
        {
            System.out.println("Cola Vacia");
            return -1;
        }
        else
        {
            System.out.println("¿Quiere eliminar del inicio?");
            System.out.println("1-Si / 2-No");
            int Res=input.nextInt();
            if(Res==1){
                if(I==F){
                    valor=Cola[I];
                    I=F=-1;
                    return valor;
                }
                else{
                    if(I==MAX-1){
                        valor=Cola[I];
                        I=0;
                    }
                    else{
                        valor=Cola[I];
                        I++;
                    }
                    return valor;
                }
            }
            else
            {
                if(F==I){
                    valor=Cola[F];
                    I=F=-1;
                    return valor;
                }
                else{
                    if(F==0){
                        valor=Cola[F];
                        F=MAX-1;
                    }
                    else
                    {
                        valor=Cola[F];
                        F--;
                    }
                    return valor;
                }
            }
        }
    }
}
