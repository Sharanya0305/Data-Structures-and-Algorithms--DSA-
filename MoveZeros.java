public class MoveZeros {
    public static void moveZerosToEnd (int[]arr){
        int n=arr.length;
        int j=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[]nums={1,2,0,4,6,0,6,0,8};
        moveZerosToEnd(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " " );
        }
    }
    
}
