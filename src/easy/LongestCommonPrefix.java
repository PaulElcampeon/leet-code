package easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String subString = "";
        for (int i = 1; i <= strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(strs[0].substring(0, i))) {
                    break;
                }
                if (j == strs.length - 1) {
                    subString = strs[0].substring(0, i);
                }
            }
        }

        return subString;
    }
}
