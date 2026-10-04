class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int res = nums[0];


        while(low <= high){
            int mid = low + (high - low)/2;

            res = Math.min(res,nums[mid]);

            if(nums[low] <= nums[mid]){
                //left half is sorted
                res = Math.min(res, nums[low]);
                low = mid + 1;


            }else{
                high = mid - 1;
            }
        }

        return res;
    }
}
