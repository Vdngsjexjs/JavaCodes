package ControlFlow;
import java.util.Scanner;
class Calculator
{
public static void main(String [] args)
{ Scanner s =new Scanner(System.in);
    String w;
    do {
        System.out.println("Enter the numbers:");
        int a = s.nextInt(), b = s.nextInt();
        System.out.println("Specify the operation:");
        String op = s.next();
        switch (op) {
            case "+":
                int rs1 = a + b;
                System.out.println("Sum is " + rs1);
                break;
            case "-":
                int rs2 = a - b;
                System.out.println("Sub is " + rs2);
                break;
            case "/":
                int rs3 = a / b;
                System.out.println("Div is " + rs3);
                break;
            case "*":
                int rs4 = a * b;
                System.out.println("Mul is " + rs4);
                break;
            default:
                System.out.println("symbol not found:");
                break;
        }
        System.out.println("Do you want to continue ?");
         w=s.next();
    }while(w.equals("Y")||w.equals("y"));
}
}
