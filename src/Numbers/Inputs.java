package Numbers;
import java.util.Scanner;
class  UserInputs
{
public static void main(String [] args)
{  Scanner sc= new Scanner(System.in);
   System.out.println("Enter any Name:");
   String n=sc.nextLine();
   System.out.println("Enter any age:");
   int a=sc.nextInt();
   System.out.println("Enter Your Gender:");
   char g =sc.next().charAt(0);
   System.out.println("-----------------------------------------------");
   System.out.println("Name: "+n);
   System.out.println("Age: "+a);
   System.out.println("Gender: "+g);
}
}
