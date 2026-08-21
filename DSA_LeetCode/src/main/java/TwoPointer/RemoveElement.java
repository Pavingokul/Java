class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int k=0;
        while(l<=r){
            if(nums[l]==val){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                r--;
            }
            else{
                l++;
                k++;
            }
        }
        return k;
    }
}
