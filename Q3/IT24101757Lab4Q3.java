import java.util.Scanner;

public class IT24101757Lab4Q3
{
     public static void main(String[] args)
     {
     int num;
     String answer;

     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter a number: ");
     num = input.nextInt();

     answer = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

     System.out.println("The number is :" + answer);

     }
}