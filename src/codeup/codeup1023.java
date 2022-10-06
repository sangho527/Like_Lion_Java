
package codeup;

import java.util.Scanner;

public class codeup1023 {
    public static void main(String args[]){
        String a;

        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        String []b = a.split("\\.");
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}