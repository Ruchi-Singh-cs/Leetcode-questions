class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            
            // Add current element to the window
            sum += nums[right];

            // Shrink the window while sum is >= target
            while (sum >= target) {
                
                // Update minimum length
                minLength = Math.min(minLength, right - left + 1);

                // Remove leftmost element
                sum -= nums[left];
                left++;
            }
        }

        // If no valid subarray was found, return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}