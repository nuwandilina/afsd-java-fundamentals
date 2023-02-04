import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        double []arr= new double[7];
        double totalVolume=0;
        double avg=0;

        for (int i=0; i<arr.length; i++)
        {
            System.out.print("Enter Rain Volume (ml) For Day "+ (i+1) + " : ");
            arr[i]=userInput.nextDouble();
            totalVolume+=arr[i];
        }

        avg=(totalVolume/arr.length)*100;

        System.out.print("");
        System.out.print("Total Rain Volume (ml) For 7 Days :" + avg);

        for (double item:arr) {
            System.out.println(item);
        }
    }
}


