class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1){
                currentCount++;
            } else {
                if(max < currentCount) max = currentCount;
                currentCount = 0;
            }
        }
        if(max < currentCount) max = currentCount;
        return max;
    }
}