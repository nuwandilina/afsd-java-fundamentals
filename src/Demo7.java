import java.util.Scanner;

class Demo7
{
	public static void main(String[]args)
	{
		Scanner userInput=new Scanner(System.in);
		
		boolean state=true;
		int numberInput=0;
		int sum=0;

		while(state)
		{
			System.out.print("Enter Your Even Number : ");
			numberInput=userInput.nextInt();
			
			if (numberInput%2==0)
			{
				sum+=numberInput;
				System.out.println("Sum : "+ sum);
				state=true;
			}
			else
			{
				state=false;
				System.out.println("You entered ODD Number");
			}
		}
		
	}
}
