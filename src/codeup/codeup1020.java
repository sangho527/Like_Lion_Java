package codeup;

import java.util.Scanner;

public class codeup1020 {
    public static void main(String args[]){
        String a;

        Scanner sc = new Scanner(System.in);
        a = sc.next();

        String jumin = a.replace("-", "");
        System.out.printf(jumin);
    }
}
