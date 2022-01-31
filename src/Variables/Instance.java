package Variables;
public class Instance {
    int a;
    float b;
    float  sum()
    {
        float c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Instance I1=new Instance();
        I1.a=9;
        I1.b=9;
        System.out.println(I1.sum());
   }
}
