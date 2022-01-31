public class  CheckLeapYear
{
public static void main(String [] args)
{
int year=2020;
if(year%4==0)
{if(year%100==0)
{if(year%400==0)
{System.out.println("Yes! it is a leap year.");}
else
{
System.out.println("No! it is not leap year.");}
}
else
{System.out.println("Yes! it is a leap year.");
}
}
else
{
System.out.println("No! it is not leap year.");
}
}
} 