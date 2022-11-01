package programmers;

public class PrimeNumber {

    boolean isPrime(int num){ // 소수인지 아닌지 판별하는 메소드

        for (int i = 2; i < num; i++) {
            System.out.printf("%d remainder:%d\n", i, num % i);
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println();
    }
}
