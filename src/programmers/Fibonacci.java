package programmers;

public class Fibonacci {
    public static int fib(int n) {
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int r = fib(6);
        System.out.println(r);
    }
}
