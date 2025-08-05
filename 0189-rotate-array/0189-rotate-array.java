class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length; //if the array len is 1 and k=2
        //entire rev 
        r(nums,0,nums.length-1);
        //till k elements
        r(nums,0,k-1);
        //after k elements
        r(nums,k,nums.length-1);
    }

    public void r(int nums[],int s,int e){
        while(s<e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
}