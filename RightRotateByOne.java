public class RightRotateByOne {
    public static void rightRotateByOne (int[]arr,int d){
        int n=arr.length;
        d=d%n;
        reverse (arr,n-d,n-1);
        reverse (arr,0,n-d-1);
        reverse (arr,0,n-1);
    }
    
    public static void reverse(int[]arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int d=3;
        rightRotateByOne(nums,d);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
            
        }   
            
    }}