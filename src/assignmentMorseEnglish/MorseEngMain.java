package assignmentMorseEnglish;

import java.util.Scanner;

public class MorseEngMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String inputEng = "";
            String inputMorse = "";

            try { System.out.println(" Do you want to enter Morsecode or English as input");
                String input = scan.nextLine();

                if (input.equalsIgnoreCase("English")) {
                    System.out.println("Enter English as input");
                    inputEng = scan.nextLine();
                    System.out.println("Morse code for the English input is  " + MorseEngLogic.engToMorseCode(inputEng));
                } else if (input.equalsIgnoreCase("Morse")) {
                    System.out.println("Enter Morsecode as input");
                    inputMorse = scan.nextLine();
                    System.out.println(" English for the morse code input is  " + MorseEngLogic.morseCodeToEnglish(inputMorse));
                } else if (input.equals("stop")){
                    System.out.println("Exit program...");
                    break;
                }else {
                    System.out.println("Invalid input! Write morse or english");
                }
            } catch (Exception e) {
                System.out.println(" Something went wrong! Try again");

            }
        }
    }

}
