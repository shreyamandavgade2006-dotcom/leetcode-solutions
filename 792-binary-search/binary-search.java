class Solution {
    public int search(int[] nums, int target) {

        int mid = (nums.length-1)/2;
        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {
            if(target == nums[mid])
            return mid;

            if(target < nums[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

            mid = (start+end)/2;
        }

        return -1;

        
        
    }
}