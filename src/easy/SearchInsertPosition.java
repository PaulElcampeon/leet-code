package easy;
/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 * */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int start = 1;
        int end = nums.length - 1;

        if (nums[end] < target) return end + 1;

        if (nums[0] >= target) return 0;

        if (nums.length == 2) {
            return 1;
        }

        int middleIndex = (nums.length/2);

        if (nums[middleIndex] == target) return middleIndex;

        if (nums[middleIndex] > target) {
            end = middleIndex;
        } else {
            start = middleIndex;
        }

        for (int i = start; i <= end; i++) {
            if (nums[i] == target) return i;
            if (nums[i] > target) {
                return i;
            } else {
                if (nums[i + 1] >= target) return i + 1;
            }
        }

        return 0;
    }
}
