package exceptions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        double numerator =0, denominator=1;
        boolean numeratorCorrect = false;
        boolean denominatorCorrect =false;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the numbers: ");
        while (!numeratorCorrect || !denominatorCorrect){
            try {
                if (!numeratorCorrect){
                    System.out.println("Enter numerator");
                    numerator = Double.parseDouble(scan.nextLine());
                    if (numerator !=0) {
                        numeratorCorrect = true;
                    }else System.out.println("Not ok with divide with 0");

                }
                if (!denominatorCorrect){
                    System.out.println("Enter denominator");
                    denominator =Double.parseDouble(scan.nextLine());
                    denominatorCorrect = true;
                }
            } catch (Exception e) {
                //
                System.out.println(" Something went wrong" +e );
            }
        }
        System.out.println("Quotient is " + (numerator/denominator));
    }
}
