package Interface;

public class Dog implements Animal{

	public static void main(String[] args) {
		

	}
	@Override
	public void run()
	{
		System.out.println("Run Fast");
	}
    @Override
    public void eat()
    {
    	System.out.println("Dog eats meat and biscuit");
    }
}
