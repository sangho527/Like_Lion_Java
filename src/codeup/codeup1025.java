package codeup;

import java.util.Scanner;

public class codeup1025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cmd = sc.nextLine().split("");

        System.out.println("["+Integer.parseInt(cmd[0]) * 10000+"]");
        System.out.println("["+Integer.parseInt(cmd[1]) * 1000+"]");
        System.out.println("["+Integer.parseInt(cmd[2]) * 100+"]");
        System.out.println("["+Integer.parseInt(cmd[3]) * 10+"]");
        System.out.println("["+Integer.parseInt(cmd[4]) * 1+"]");

        sc.close();
    }

}