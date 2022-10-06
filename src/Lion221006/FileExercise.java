package Lion221006;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExercise {

    public static void main(String[] args) throws FileNotFoundException{

        /*File dir = new File("./"); //현재 디렉토리의 첫번째 파일명
        File files[] = dir.listFiles();
        System.out.println(files[0]);*/

        File dir = new File("./"); //현재 디렉토리 파일 목록
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

}
