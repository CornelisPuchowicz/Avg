package Kornel;

import java.util.Scanner;

public class    Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade;
        int avarge;
        int total = 0;
        int counter = 0;

        while (counter < 10) {

            grade = input.nextInt();
            total = total + grade;
            counter++;

        }

        avarge = total/10;
        System.out.println("Avarage is: " + avarge);

    }
}
