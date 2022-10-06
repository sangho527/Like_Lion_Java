package codeup;
import java.util.Scanner;

public class codeup1027 {
    public static void main(String args[]){
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        System.out.println(a.replaceAll("\\.", "-"));
    }
}
