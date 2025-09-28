public class LeftRotateByOne {
    public static void leftRotateByOne(int[] arr) {
        int n=arr.length;
        int first = arr[0];
        for (int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=first;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        leftRotateByOne(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
            
        }
    }}