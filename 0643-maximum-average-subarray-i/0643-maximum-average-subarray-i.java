class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        
        // Iterate through the array with sliding window approach
        while (j < nums.length) {
            sum += nums[j];
            
            // If the window size is less than k, expand the window
            if (j - i + 1 < k) {
                j++;
            }
            // When the window size reaches k, calculate the max sum
            else if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[i]; // Subtract the element that is going out of the window
                i++;
                j++;
            }
        }
        
        // Return the maximum average by dividing the max sum by k
        return (double) maxSum / k;
    }
}
