package Rating;
import java.util.Scanner;
public class Proj3_rating {

	public static void main(String[] args) {
		double Rating;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rating out of 5: ");
		Rating=sc.nextDouble();
		if (Rating<=1.0)
		{
			System.out.println("Bad rating" + Rating);
		}
		else if(Rating> 1.0 && Rating<5.0)
		{
			System.out.println("Average rating" + Rating);
		}
		else if(Rating==5.0)
		{
			System.out.println("Good rating" + Rating);
		}	

	}

}
