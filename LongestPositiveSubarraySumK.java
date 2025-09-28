public class LongestPositiveSubarraySumK {
    public static int LongestSubarray (int[]arr,int k){
        int n=arr.length;
        int sum =0;
        int maxlength=0;
        int left=0;
        for(int right=0; right<n;right++){
            sum+=arr[right];
            while(sum>k &&left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlength = Math.max(maxlength,right-left+1);
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int[]nums={1,1,1,2,3};
        int k=3;
        int length = LongestSubarray(nums,k);
        System.out.println(length); 
    }
}
