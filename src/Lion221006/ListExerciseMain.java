package Lion221006;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        for (String student : listExercise.getStudents()) {
            System.out.println(student);
        }
    }
}
