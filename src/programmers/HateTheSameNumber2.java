package programmers;

import java.util.Stack;

public class HateTheSameNumber2 {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(st.peek() != arr[i]) st.push(arr[i]);
        }
        var answer = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
        return answer;
    }
}
