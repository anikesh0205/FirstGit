
import java.util.Scanner;

interface add //creating   interface
{
public void add_numbers(); //abstract method
}

public class Addition implements add
{
public void add_numbers() 
{
Scanner sc=new Scanner(System.in);
int a,b,result;

System.out.print("Enter value of a: ");
a=sc.nextInt();

System.out.print("Enter value of b: ");
b=sc.nextInt();

result=a+b;

System.out.println("\nAddition of "+ a + " and " + b + " is: "+result); 
}

public static void main(String args[])
{
//add ob1=new addition();
Addition ob= new Addition();
ob.add_numbers();
}
}
