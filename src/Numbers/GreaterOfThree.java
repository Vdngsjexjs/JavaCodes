package Numbers;

public class GreaterOfThree {

    public static void main(String[] args) {
        int a=110,b=220,c=330;
      if(a>b&&a>c)
      {
          System.out.println(a+" is Greatest");
      }
      else if (b>a&&b>c)
      {
          System.out.println(b+" is Greatest");
      }
      else
          System.out.println(c+" is Greatest");
    }
}
