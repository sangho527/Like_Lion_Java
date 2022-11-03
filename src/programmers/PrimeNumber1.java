package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber1 { //에라토스테네스의 체

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));

    }

    static int solution(int value) {
        int count = 0;
        ArrayList<Boolean> primeList;
        if (value <= 1) return 0;
        primeList = new ArrayList<>(value + 1);

        primeList.add(false);
        primeList.add(false);

        for (int i = 2; i <= value; i++)
            primeList.add(i, true);

        for (int i = 2; (i * i) <= value; i++){
            if (primeList.get(i)) {
                for (int j = i * i; j <= value; j += i) primeList.set(j, false);
            }
        }

        for (int i = 0; i <= value; i++ ){
            if (primeList.get(i)) {
                count++;
            }
        }
        return count;
    }
}

