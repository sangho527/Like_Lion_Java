package codeup;

import java.util.Scanner;

public class codeup1024 {
    public static void main(String args[]){
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        String[] b = a.split("");

        for(int i=0; i<a.length() ; i++) {
            System.out.println("'"+b[i]+"'");
        }
    }
}
