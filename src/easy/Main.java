package easy;

public class Main {

    public static void main(String[] args) {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        int[] solution = TwoSum.solve(new int[]{2,7,11,15}, 9);
//        System.out.println(solution[1] == 1);
//        System.out.println(solution[0] == 0);


//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//        System.out.println(PalindromeNumber.isPalindrome(1));


//        Input: s = "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
//        System.out.println(RomanToInt.romanToInt("MCMXCIV"));


//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        System.out.println(LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
//        System.out.println(LongestCommonPrefix.longestCommonPrefix(new String[]{"dog","cat","nat"}));


//        Input: s = "()[]{}"
//        Output: true

//        System.out.println(ValidParentheses.isValid("()[]{}"));
//        System.out.println(ValidParentheses.isValid("(]"));


//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//        MergeTwoSortedLists.ListNode l1 = new MergeTwoSortedLists.ListNode(1);
//        MergeTwoSortedLists.ListNode l2 = new MergeTwoSortedLists.ListNode(2);
//        MergeTwoSortedLists.ListNode l3 = new MergeTwoSortedLists.ListNode(4);
//        l1.next =  l2;
//        l2.next = l3;
//
//        MergeTwoSortedLists.ListNode l4 = new MergeTwoSortedLists.ListNode(1);
//        MergeTwoSortedLists.ListNode l5 = new MergeTwoSortedLists.ListNode(3);
//        MergeTwoSortedLists.ListNode l6 = new MergeTwoSortedLists.ListNode(4);
//        l4.next = l5;
//        l5.next = l6;
//
//        MergeTwoSortedLists.mergeTwoLists(l1, l4);


//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//                It does not matter what you leave beyond the returned k (hence they are underscores).
//        int[] test = new int[]{1,1,2,6,6,8};
//
//        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(test));

//        Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//        It does not matter what you leave beyond the returned k (hence they are underscores).

//        System.out.println(RemoveElement.removeElement(new int[]{3,2,2,4,6,2,3}, 3));

//        Input: haystack = "hello", needle = "ll"
//        Output: 2

//        System.out.println(ImplementStrStr.strStr("hello", "ll"));
//        System.out.println(ImplementStrStr.strStr("hello", "he"));

//        Input: nums = [1,3,5,6], target = 5
//        Output: 2

//        System.out.println(SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5));
//
//        System.out.println(SearchInsertPosition.searchInsert(new int[]{2,7,11,12,20}, 12));
//
//        System.out.println(SearchInsertPosition.searchInsert(new int[]{2,7,11,12,20}, 3));
//
//        System.out.println(SearchInsertPosition.searchInsert(new int[]{1,3}, 2));

//        System.out.println(SearchInsertPosition.searchInsert(new int[]{1,3,5}, 4));


//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.

//        System.out.println(MaximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

//        Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//        A word is a maximal substring consisting of non-space characters only.

        int lengthOfWord1 = LengthOfLastWord.lengthOfLastWord("leet23 dead red rambo");
        System.out.println(lengthOfWord1 == 5);

        int lengthOfWord2 = LengthOfLastWord.lengthOfLastWord("leet23 dead red ramb23o");
        System.out.println(lengthOfWord2 == 7);

        int lengthOfWord3 = LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(lengthOfWord3 == 4);
    }
}
