//predefine s/w - pluged
import java.util.Scanner;

class Demo4 {
    public static void main(String[] args) {

        //setuped
        Scanner scan = new Scanner(System.in);

        //true/false/a statement that genarates true or false
        boolean isExamPass = false;

        //logic 1
        if (isExamPass) {
            System.out.println("G.U");
        }

        //logic 2 
        if (isExamPass) {
            System.out.println("G.U");
        } else {
            System.out.println("P.U");
        }

        //multiple logics

        System.out.print("Enter your mark : ");

        //scan.nextInt() / scan.nextDouble() / scan.next()
        int mark = scan.nextInt();

        if (mark > 75) {
            System.out.println("Car");
        } else if (mark > 50) {
            System.out.println("Phone");
        } else {
            System.out.println("Nothing");
        }

        //switch case

        String month = "January";

        switch (month) {
            case "January":
                System.out.println("Duruthu");
                break;
            case "February":
                System.out.println("Navam");
                break;
            case "March":
                System.out.println("Madin");
                break;
            default:
                System.out.println("No matching month found");
        }


        if (month.equals("January")) {
            System.out.println("Duruthu");
        } else if (month.equals("February")) {
            System.out.println("Navam");
        } else if (month.equals("March")) {
            System.out.println("Madin");
        }

        //>, <, <=, >=, ==, != - Logical Oprators

        double y = 6.6;

        if (y < 7) {
            System.out.println("Entered !");
        }

        if (y > 7) {
            System.out.println("Entered 1 !");
        }

        if (y <= 6) {
            System.out.println("Entered 2 !");
        }

        if (y >= 6) {
            System.out.println("Entered 3 !");
        }

        //int / double --> ==
        if (y == 6.6) {
            System.out.println("Entered 4 !");
        }

        //String name = "Yasindu"; --> matched
        String name = scan.next(); //not matched

        //.equals ---> String match

        if (name.equals("Yasindu")) {
            System.out.println("Entered 5 !");
        }


        if (y != 6.7) {
            System.out.println("Entered 6 !");
        }


		switch(month)
		{
			case "January":
			System.out.println("1");
			break;
			
			case "February":
			System.out.println("2");
			break;
			
			default:
			System.out.println("Nothing");
		}

    }
}
