class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int expectedSum = n * (n+1) / 2;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        return expectedSum - sum;
    }
}  

 /* int i = 0;

    while(i < nums.length){

        // place number at correct index
        if(nums[i] < nums.length && nums[i] != nums[nums[i]]){

            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;

        } else {
            i++;
        }
    }

    // find missing index
    for(int index = 0; index < nums.length; index++){

        if(nums[index] != index){
            return index;
        }
    }

    return nums.length; */
