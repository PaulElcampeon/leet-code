package easy;

/**
 * Implement strStr().
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * */
public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        if (needle.equals(haystack)) return 0;

//        for (int i = 0; i < haystack.length(); i++) {
//            if (i + needle.length() > haystack.length()) return -1;
//            if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                return i;
//            }
//        }
        int i = 0;
        while(i + needle.length() < haystack.length()) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
