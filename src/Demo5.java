import java.util.Scanner;

class Demo5
{
	public static void main(String[]args)
	{
		Scanner userInput=new Scanner(System.in);

		System.out.print("Enter Your User Name : ");
		String userName=userInput.next();
		
		System.out.print("Enter Your Password : ");
		int password=userInput.nextInt();
		
		if (userName.equals("Yasindu@gmail.com") && password == 1245)
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");
		}
			
	}
}
