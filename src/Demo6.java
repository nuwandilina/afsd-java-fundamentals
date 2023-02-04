import java.util.Scanner;

class Demo6
{
	public static void main(String[]args)
	{
		Scanner userInput=new Scanner(System.in);
		
		boolean loginState=true;
		String userName="";
		int password;

		while(loginState)
		{
			System.out.print("Enter Your User Name : ");
			userName=userInput.next();
		
			System.out.print("Enter Your Password : ");
			password=userInput.nextInt();
			
			if (userName.equals("Nuwan")&&password==12345)
			{
				loginState=false;
				System.out.println("Login Success");
			}
			else
			{
				System.out.println("Login Failed. Please try again");
				System.out.println("");
			}
		}
		
		System.out.print("Welcome : "+userName);
	}
}
