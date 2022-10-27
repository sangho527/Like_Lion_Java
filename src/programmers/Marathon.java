package programmers;

import java.util.ArrayList;

public class Marathon {

    public String Marathon(String[] participant, String[] completion) {

        String answer = "";

        ArrayList<String> participantList = new ArrayList<String>();

        for (String name : participant) {

            participantList.add(name);
        }

        for (String name : completion) {

            for (int i = 0; i < participantList.size(); i++) {

                if (participantList.get(i).equals(name)) {

                    participantList.remove(i);

                    break;
                }
            }
        }
        answer = participantList.get(0);
        return answer;
    }
}