package Assignment1;
import java.io.*;
public class Logical {

	public static void main(String[] args) {
		int a=10, b=20, c=20, d=0;
		
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);
		System.out.println("Var3 = " + c);
		
		if((a<b) && (b==c))
		{
			d= a+b+c;
			System.out.println("The sum is: " + d);
		}
		else
			System.out.println("False Conditions");
			
	}

}
