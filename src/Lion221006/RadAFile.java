package Lion221006;

import java.io.FileReader;
import java.io.IOException;

public class RadAFile {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("src/a_file.txt");
        char c = (char) reader.read();
        System.out.println(c);

    }
}
