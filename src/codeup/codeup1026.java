
package codeup;
import java.util.Scanner;

public class codeup1026 {
    public static void main(String args[]){
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        String[] b = a.split(":");

        System.out.println(Integer.parseInt(b[1]));
    }
}
