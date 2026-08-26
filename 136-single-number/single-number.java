class Solution {
    public int singleNumber(int[] nums) {
        int y=0;
       for(int num : nums){
        y^=num;
       }
       return y;
    }
}