class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
    public static void rev(int [] p,int l,int r){
        while(l<r){
            int tem=p[l];
            p[l]=p[r];
            p[r]=tem;
            l++;
            r--;
        }
    }
    }
