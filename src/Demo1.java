import java.util.Scanner;

public class Demo1 {
    Scanner userInput=new Scanner(System.in);

    public static void main(String[] args) {
        int []arr= new int[7];

        getTotal(arr);
    }

    public static void getTotal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            sum=sum+arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static double[] Calculate (double[]arr){
        double[] newMarks = new double[5];

        for (int i = 0; i < arr.length; i++) {
            newMarks[i]=arr[i]+1;
        }
        return  newMarks;
    }


}
