package one.digitalinnovation.basecamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int presentYear = 2022;
        int i = scan.nextInt();
        int old = presentYear - i;

        System.out.println("Your old is: " + old);

        if (old > 1) {
            System.out.println("years old!");
        } else {
            System.out.println("year old!");
        }
    }
}