package programmers;

import java.util.Arrays;

public class PrimeNumber2 {
    //2의 배수 지울때 2, 4, 6 순서
    //3의 배수 지울 때 4, 7, 10 …
    //4의 배수 지울 때 6, 10, 14… (4의 배수 꼭 지워보기)
    //5의 배수 지울 때 8, 13, 18 ...
    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true); //
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2;

    }
}
