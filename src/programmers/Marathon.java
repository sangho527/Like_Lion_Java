package programmers;

import java.util.HashMap;

public class Marathon { // completion 의 길이는 participant의 길이보다 1작아야함

    public String Marathon(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String name : participant)

        {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion)
        {
            map.put(name, map.get(name) - 1);
        }

        return answer;
    }

}
