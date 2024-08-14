import java.util.Scanner;

public class IT24101757Lab4Q2
{
     public static void main(String[] args)
     {

     double examMark, labMark, examPercentage, labPercentage, finalExam;
     Scanner input = new Scanner(System.in);
     
     System.out.print("Please enter exam marks (out of 100) : ");
     examMark = input.nextDouble();

     if (examMark > 100)
     {
     System.out.println("Invalid input for exam marks. Terminating program.");
     }
     else
     {
          System.out.print("Please enter lab submission marks (out of 100) : ");
          labMark = input.nextDouble();

          if (labMark > 100)
          {
          System.out.println("Invalid input for exam marks. Terminating program.");
          }
          else
          {

               System.out.print("Please enter the percentage given for the exam :");
               examPercentage = input.nextDouble();

               System.out.print("Please enter the percentage given for the lab submission :");
               labPercentage = input.nextDouble();

               if ((labPercentage + examPercentage) > 100)
               {
               System.out.println("The percentages must add up to 100. Terminating program.");
               }
               else
               {
               finalExam = (examMark * examPercentage/100) + (labMark * labPercentage/100);
               System.out.println("Final exam mark is " + finalExam);
               }
          }
     }
     }
}