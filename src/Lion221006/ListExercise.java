package Lion221006;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students;// 리스트 뒤에는 s 붙여주기


    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("김상민");

    }
    public List<String> getStudents() {
        return this.students;
    }
}
