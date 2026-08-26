class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length-1;
        int n=((len+1)*2-1);
        int arr[]=new int[n+1];
        while(len>=0){
            arr[len]=nums[len];
            arr[n--]=nums[len--];
        }
        return arr;
    }
}