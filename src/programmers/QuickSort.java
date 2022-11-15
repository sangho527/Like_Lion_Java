package programmers;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        var arr = new int[]{20, 16, 3, 4, 17, 43, 24};

        // 기준값 뽑는 로직
        int pivot = arr[arr.length/2];
        System.out.println(pivot);

        // 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (pivot > arr[i]) left.add(arr[i]);
        }
        System.out.println(left);
        System.out.println(right);
    }
}
