public class FindMissingNumber {
    public static int findMissing (int[]arr){
        int n = arr.length+1;
        int actual =0;
        for (int i=0;i<arr.length;i++){
            actual+=arr[i];
        }
        int expected = (n*(n+1))/2;
        return expected-actual;
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,6,7,8};
        System.out.println(findMissing(nums));
    }

}
