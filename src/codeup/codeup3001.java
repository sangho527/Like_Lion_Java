package codeup;

import java.util.Scanner;

public class codeup3001 { // 이분 탐색


    public static void main(String[] args) {
        int targetNum = 7;

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int startIdx = 0;
        int endIdx = nums.length - 1;
        int targetIdx = -1;

        while (startIdx <= endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            int midValue = nums[midIdx];
            if (midValue > targetNum) {
                endIdx = midIdx - 1;
            } else if (midValue < targetNum) {
                startIdx = midIdx + 1;
            } else {
                System.out.println(midIdx);
                targetIdx = midIdx;
                break;
            }
        }
        System.out.println(targetIdx);
    }
}



//        // 중간값 찾기
//        int startIdx = 0;
//        int midIdx = nums.length / 2;
//        int endIdx = nums.length / 2;
//        int midValue = nums[midIdx];
//
//        if (midValue > targetNum) { // 비교 후 작은것 모두 버림
//            startIdx = midIdx + 1;
//        } else if (midValue < targetNum) { // 6 이상을 모두 버림
//            endIdx = midIdx - 1;
//        } else {
//            // 같은경우 = 답
//            // 같은지 비교하기
//            System.out.println(midIdx);

            // 인덱스(시작점, 끝점) 옮기기
