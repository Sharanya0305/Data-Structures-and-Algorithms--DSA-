public class MaximumConsOnes {
    public static int maxConsecutiveOnes(int[]arr){
        int n =arr.length;
        int count =0;
        int maxlength=0;
        for (int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxlength = Math.max(maxlength,count);
            }
            else{
                count=0;
            }
        }
        return maxlength;
    }

public static void main(String[] args) {
    int[]nums={1,1,0,1,1,1,0,1,1,1,1};
    int length = maxConsecutiveOnes(nums);
    System.out.println(length);
}
    

}
