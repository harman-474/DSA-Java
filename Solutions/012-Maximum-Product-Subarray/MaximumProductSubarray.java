public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {

        int currentMax = nums[0];
        int currentMin = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int oldMax = currentMax;

            currentMax = Math.max(nums[i], 
                    Math.max(currentMax * nums[i], currentMin * nums[i]));
            
            currentMin = Math.min(nums[i], 
                    Math.min(oldMax * nums[i], currentMin * nums[i]));
            
            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}