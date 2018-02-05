package codingbat.AP1.scoreUp;

public class Solution {
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == "?")
                continue;
            if(answers[i].equals(key[i]))
                score+=4;
            else
                score -=1;
        }
        return score;
    }
}
