import java.util.Scanner;

class Demo3
{
	public static void main(String[]args)
	{
		Scanner userInput=new Scanner(System.in);
		System.out.print("Enter your Marks Here : ");
		int marks=userInput.nextInt();
		
		if (marks>= 75) 
		{
			System.out.println("A");
		}
		else if (marks>= 65) 
		{
			System.out.println("B");
		}
		else if (marks>= 55) 
		{
			System.out.println("C");
		}
		else 
		{
			System.out.println("F");
		}
	}
}
