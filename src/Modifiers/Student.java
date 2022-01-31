package Modifiers;
import java.util.Scanner;
public    class Student  {  String name;
    int rollno;
    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in) ;
    Student st1= new Student();
    String a=sc.next();
    int b =sc.nextInt();
        st1.setName(a);
        st1.setRollno(b);
        System.out.println(st1.getName());
        System.out.println(st1.getRollno());

    }
}
class demo{
    String name;
    int Rollno;

    public static void main(String[] args) {
        System.out.println("hello");
    }
}


class dem
{   String name;
    int Rollno;

    public static void main(String[] args) {
        System.out.println("hi");
    }


}