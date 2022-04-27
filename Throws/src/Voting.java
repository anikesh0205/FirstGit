import java.util.Scanner;
class Youngerageexception extends RuntimeException
{
	Youngerageexception(String msg) //constructor
	{
		super(msg);
	}
}
public class Voting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		try
		{
			if(age<18)
			{
				throw new Youngerageexception("You can not vote");
			}
			else
			{
				System.out.println("You can vote");
			}
		}
		catch(Youngerageexception e)
		{
			e.printStackTrace();
		}
		System.out.println("End of code");
	}

}
