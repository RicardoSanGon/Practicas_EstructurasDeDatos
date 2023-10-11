public class Conversion {
    private String EI="";
    private static char[] EP=new char[50];
    private char c,t;
    private static int j;

    public String Convertir(String infija)
    {
        EI="";
        j=0;
        Pila pila=new Pila();
        for(int i=0;i<infija.length();)
        {
            this.c=infija.charAt(i);
            if(c=='(')
                pila.Push(c);
            else if(c==')')
            {
                this.t=pila.Pop();
                while (t!='(')
                {
                    EP[j]=t;
                    j++;
                    t= pila.Pop();
                }
            }
            else
            {
                if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
                    t= pila.Pop();
                    while (Jerarquia_Operadores(c,t))
                    {
                        EP[j]=t;
                        j++;
                        t= pila.Pop();
                    }
                    if(t!='!'){
                        pila.Push(t);
                    }
                    pila.Push(c);
                }
                else {
                    EP[j]=c;
                    j++;
                }
            }
            i++;

        }
        do{
            t= pila.Pop();
            while (t!='!')
            {
                EP[j]=t;
                j++;
                t=pila.Pop();
            }
        }while (t!='!');
        return Mostrar();
    }
    private boolean Jerarquia_Operadores(char opr1,char opr2)
    {
        int num1=0,num2=0;
        switch (opr1)
        {
            case '+'->{num1=1;}
            case '-'->{num1=1;}
            case '*'->{num1=2;}
            case '/'->{num1=2;}
            case '^'->{num1=3;}
        }
        switch (opr2)
        {
            case '+'->{num2=1;}
            case '-'->{num2=1;}
            case '*'->{num2=2;}
            case '/'->{num2=2;}
            case '^'->{num2=3;}
        }
        if(num1<=num2)
            return true;
        else
            return false;
    }
    public String Mostrar()
    {

        if(EI=="")
        {
            for(int i=0;i<j;i++)
            {
                EI=EI+EP[i];
            }
        }
        return EI;
    }
}
