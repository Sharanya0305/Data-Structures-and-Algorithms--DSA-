public class CheckIfSorted {
    public static boolean isSorted (int[]arr){
        int n = arr.length;
        for (int i=1;i<n;i++){
            if (arr[i-1]>arr[i]){
                return false;
            }}
            return true;
        }
        public static void main(String[] args) {
            int[] numbers = {0, 2, 3, 4, 5, 6, 7};
            boolean sorted = isSorted(numbers);
            if (sorted) {
                System.out.println("The array is sorted ");
            } else {
                System.out.println("The array is not sorted");
            }
        }
    }
    
