package codeup;

import java.util.Scanner;

public class codeup1019 {
    public static void main(String args[]){
        String time;

        Scanner sc = new Scanner(System.in);
        time = sc.next();

        String date[] = time.split("\\.");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day =Integer.parseInt(date[2]);

        System.out.printf("%02d-%02d-%04d", day,month,year);
    }
}
