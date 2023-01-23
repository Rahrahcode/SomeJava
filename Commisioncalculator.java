package cop2805;
import java.util.Scanner;
public class Commisioncalculator {
	
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Sales Amount : ");
       double sales=sc.nextDouble();
       System.out.println("The overall income for $"+sales+ " worth of sales for the month is : $"+computeIncome(sales));

   }

   public static double computeIncome(double sales)
   {

       double overallIncome = 0.00;
       if(sales>0.00 && sales<=5000)
       {

           overallIncome = 5000 + sales*0.08;
          
       }
      else if(sales>5000.01 && sales<=10000)
       {

           overallIncome = 5000 + (5000 * 0.08) + (sales - 5000)*0.10;
          
       }
      else if(sales>10000.01)
       {

           overallIncome = 5000 + (5000 * 0.08) + (5000 * 0.10) + (sales - 10000)*0.12;
          
       }

       return overallIncome;
   }
}
