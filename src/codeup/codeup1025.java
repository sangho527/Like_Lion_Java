
package codeup;

import java.util.Scanner;

public class codeup1025 {
    public static void main(String args[]){
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        String[] b = a.split("");

        System.out.println(Integer.parseInt(b[0])*10000);
        System.out.println(Integer.parseInt(b[1])*1000);
        System.out.println(Integer.parseInt(b[2])*100);
        System.out.println(Integer.parseInt(b[3])*10);
        System.out.println(Integer.parseInt(b[4])*1);

    }
}
