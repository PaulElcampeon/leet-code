package easy;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        char[] letters = s.toCharArray();
        int lengthOfLastWord = 0;

        for (int i = letters.length - 1; i >= 0; i--) {
            if (letters[i] == ' ' && lengthOfLastWord != 0)  {
                return lengthOfLastWord;
            } else if (letters[i] == ' ' && lengthOfLastWord == 0) {
                continue;
            }

            lengthOfLastWord++;
        }

        return lengthOfLastWord;
    }
}
