package Lion221007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {


    public void readByChar(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);


        String fileCmotentes = "";
        while (fileCmotentes.length() < 1_000) {
            char c = (char)fileReader.read();
            fileCmotentes += c;
        }

        System.out.println("fileCmotentes :  " + fileCmotentes);

    }

    public void readFileByLineV2(String filename) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }



    public List<PopulationMove> readFileByLine(String fileName) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }


    public PopulationMove parse(String data) {
        String[] eachData = data.split(",");
        return new PopulationMove(eachData[0],eachData[1]);
    }



    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void write(List<String> strs, String fileName) throws IOException {

        File file = new File(fileName);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);

        for (String str : strs) {
            writer.write(str);
        }

        writer.close();
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

    // 1. List<PopulationMove>를 순환하면서 "11,26" 이런 형태의 key를 만든다
    // 2. moveCntMap에서 해당 key에 해당하는 object가 없으면 생성하고 1이라고 체크한다.
    // 3. key로 꺼내서 +1
    // 4. 리턴 moveCntMap
    public static Map<String, Integer> getMoveCntMap(List<PopulationMove> pml){
        Map<String,Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm:pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\PC\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics statistics = new PopulationStatistics();

        List<PopulationMove> pml = statistics.readFileByLine(address);
        List<String> strings = new ArrayList<>();

        Map<String, Integer> map = PopulationStatistics.getMoveCntMap(pml);
        for (String key : map.keySet()) {
            System.out.println("key:%s value");
        }

        for (PopulationMove pm : pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());

        }

        Map<String, Integer> moveCntMap = new HashMap<>();


    }
}