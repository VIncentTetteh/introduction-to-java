package mortage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float getPrincipal = 0.0F;
       while (true){
           System.out.print("Principal: ");
           getPrincipal = scanner.nextFloat();
           if(getPrincipal > 100 && getPrincipal< 100_000)
               break;
           System.out.println("Principal must be greater than 100 or less than 1k");
       }
        float getInterestRate = 0.0F;
        while(true){
            System.out.print("Interest Rate: ");
            getInterestRate = scanner.nextFloat();
            if(getInterestRate > 3.0 && getInterestRate <= 4.0)
                break;
            System.out.println("Interest Rate must be between 3.0 to 4.0");
        }
        byte getNumberOfMonth = 0;
        while (true){
            System.out.print("Number of month: ");
            getNumberOfMonth = scanner.nextByte();
            if(getNumberOfMonth > 0 && getNumberOfMonth <= 30)
                break;
            System.out.println("Month must between 1 and 12");
        }

        String TotalMortgage = NumberFormat.getCurrencyInstance()
                .format(calMortgage(getPrincipal,getInterestRate,getNumberOfMonth));
        System.out.println(TotalMortgage);


    }
    public static double calMortgage(float principal,float interestRate,byte numberOfMonth){
        final byte PERCENTAGE = 100;
        final byte MONTH_IN_YEAR = 12;

        float monthlyRate = interestRate / PERCENTAGE / MONTH_IN_YEAR;
        float numberOfPayment = numberOfMonth * 12;

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate,numberOfPayment)) /
                (Math.pow(1 + monthlyRate,numberOfPayment) - 1);
        return mortgage;
    }
}
