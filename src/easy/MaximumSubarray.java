package easy;

public class MaximumSubarray {
    //        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
    public static int maxSubArray(int[] nums) {
        int maximum = nums[0];

        for (int i = 1; i< nums.length; i++){
            System.out.println("Value of previous index is  " + nums[i-1]);
            if (nums[i-1] > 0) {
                nums[i] += nums[i-1];
                System.out.println("Index " + i + " now has value " + nums[i]);
            } else {
                System.out.println("Index " + i + " now has value " + nums[i]);
            }
            maximum  = Math.max(maximum, nums[i]);
            System.out.println("Maximum is: "+maximum);
        }

        return maximum;
    }
}
