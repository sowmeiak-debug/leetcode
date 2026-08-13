class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0,k=0,flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[k++]!=i){
                count=i;
                break;
            }
            flag=1;
        }
        if(count==0 && flag==1 )
        return (nums.length);
        else
        return count;
    }
}