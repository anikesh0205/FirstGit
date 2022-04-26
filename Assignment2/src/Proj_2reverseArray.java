import java.util.Scanner;
public class Proj_2reverseArray {

	public static void main(String[] args) {
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n=sc.nextInt();
		int a[] =new int[n];
		int b[] =new int[n];
		System.out.println("\n Enter the elements of array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Proj_2reverseArray ob= new Proj_2reverseArray();
		b=ob.reverse(a);
		System.out.print("Original array: ");
		ob.display(a);
		System.out.print("Reversed array: ");
		ob.display(b);
				
	}
	public int[] reverse(int a[])
	{
		int n= a.length;
		int i, k=n-1,b[]=new int[n];
		for(i=0;i<n;i++)
		{
			b[i]=a[k--];
		}
		return b;
	}
	public void display(int a[])
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
