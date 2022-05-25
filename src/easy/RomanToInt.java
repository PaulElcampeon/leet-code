package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {

        Map<Character, Integer> symbolsToValueMap = new HashMap<>();
        symbolsToValueMap.put('I', 1);
        symbolsToValueMap.put('V', 5);
        symbolsToValueMap.put('X', 10);
        symbolsToValueMap.put('L', 50);
        symbolsToValueMap.put('C', 100);
        symbolsToValueMap.put('D', 500);
        symbolsToValueMap.put('M', 1000);

        int integerEquivalent = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = symbolsToValueMap.get(s.charAt(i));

            int nextValue = i + 1 < s.length()?symbolsToValueMap.get(s.charAt(i + 1)) : 0;

            integerEquivalent += nextValue > currentValue? -currentValue : currentValue;
        }

        return integerEquivalent;
    }
}
