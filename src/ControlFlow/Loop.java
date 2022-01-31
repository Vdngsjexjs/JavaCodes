package ControlFlow;
import java.util.Scanner;
class Table
{
    public static void main(String  [] args)
    { Scanner s= new Scanner(System.in);
      System.out.println("Enter the Number.");
      int a=s.nextInt();
      System.out.println("Table of "+ a+"is.");
      for(int i=1;i<=10;i++)
      {
          System.out.println(a+"x"+i+"="+a*i);
      }

    }
}