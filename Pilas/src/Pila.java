public class Pila {
    private int MAX=10;
    private char[]Pila=new char[this.MAX];
    private static int TOP=-1;

    public void Push(char valor)
    {
        if(TOP==MAX-1)
            System.out.println("Pila llena / Stack OverFlow");
        else
        {
            TOP++;
            Pila[TOP]=valor;
        }
    }
    public char Pop()
    {
        if (TOP==-1){
            return '!';
        }
        else{
            char valor=Pila[TOP];
            TOP--;
            return valor;
        }
    }
}
