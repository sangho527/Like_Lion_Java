package programmers;

public class MockExam {
    public int[] solution(int[] answers) {

        int[] answer = {};
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == student1[ i % 5]) answer1 ++; // 1번
            if (answers[i] == student2[ i % student2.length]) answer2 ++; // 2번
            if (answers[i] == student3[ i % 10]) answer3 ++; // 3번

        }


        return answer;
    }

    public static void main(String[] args) {



    }
}
