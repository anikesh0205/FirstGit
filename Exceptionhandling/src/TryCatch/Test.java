package TryCatch;
import java.util.Scanner;
import java.io.*;
public class Test {

	public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
         System.out.println("please enter a number");
         int num1 = s.nextInt();

        // try block
        try {
        	int num2 = 10 / num1;
            System.out.println(num2);
        } 
        // catch block
        catch (Exception e)
        {
            System.out.println("Please enter the correct input");
        }

        System.out.println("This statement is outside try-catch blocks.");
    }
}
