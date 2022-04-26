package TryCatch;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        System.out.println("Please enter a number");
	        int num = s.nextInt();

	        int arr[] = new int[10];

	        try {
	            arr[num] = 10 / num;
	            System.out.println(arr[num]);
	        } 
	        catch (ArithmeticException e)
	        {
	            System.out.println("Please enter non-zero input");
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Please enter the correct array index");
	        }
	    }
	}
