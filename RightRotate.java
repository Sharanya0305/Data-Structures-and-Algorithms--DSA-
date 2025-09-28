public class RightRotate {
    public static void rightRotate (int[] arr){
        int n = arr.length;
        int last = arr[n-1];
        for (int i=1;i<n;i++){
            arr[n-i]=arr[n-i-1];
        }
        arr[0]=last;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        rightRotate(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
            
        }
    }
}
