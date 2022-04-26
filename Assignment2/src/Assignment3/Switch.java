package Assignment3;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		String s= " ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr -a to implement continue statement. \nEnter -b to implement break statement");
		s=sc.nextLine();
		
		switch(s)
		{
		case "a":
			System.out.println("\nValues are: ");
			for(int i=0;i<5;i++)
			{
				if(i==3)
					continue;
				System.out.println(i);
			}
			break;
		case "b":
			System.out.println("\nvalues are: ");
			for(int i=0;i<5;i++)
			{
				if(i==4)
					break;
				System.out.println(i);
			}
			break;
			default:
				System.out.println("Wrong choice");
						
		}

	}

}
