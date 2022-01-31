package Variables;

public class Local {
     void prt()
    {int a=10;
     int b=20;
     System.out.println(a+b);

    }

    public static void main(String[] args) {
        Local L1=new Local();
        L1.prt();//cannot put void typefunction inside sout statement.
    }
}
