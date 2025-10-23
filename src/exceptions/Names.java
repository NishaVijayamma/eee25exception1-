package exceptions;

//import java.util.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        String[] names ={"Ada", "Beda", "Cålle"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        try {
            int index = scan.nextInt();
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("something went wrong in array index" +aiobe);;
        } catch (InputMismatchException ime){
            System.out.println(" Wrong input" + ime );
        } catch (Exception e) {
            System.out.println("Something went wrong " +e);;
        }
    }
}
