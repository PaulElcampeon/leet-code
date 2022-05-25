package easy;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int nextIndexEntry = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[nextIndexEntry - 1]) {
                continue;
            } else {
                nums[nextIndexEntry] = nums[i];
                nextIndexEntry++;
            }
        }

        return nextIndexEntry;
    }
}
