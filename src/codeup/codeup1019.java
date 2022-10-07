package codeup;

import java.util.Scanner;

public class codeup1019 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] commandBits = sc.nextLine().split("\\.");

        int year = Integer.parseInt(commandBits[0]);
        int month = Integer.parseInt(commandBits[1]);
        int day = Integer.parseInt(commandBits[2]);

        System.out.printf(String.format("%04d.%02d.%02d",year,month,day));
    }
}