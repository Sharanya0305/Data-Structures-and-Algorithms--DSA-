public class LargestInAnArray {

    public static int Largest (int[]arr){
        int n = arr.length;
        int maxi = arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]>maxi){
                maxi = arr[i];
            }}
            return maxi;
        

    }
    public static void main(String[] args) {
        int[] numbers = {34, 67, 23, 89, 12, 90, 45};
        int largest = Largest(numbers);
        System.out.println("The largest number in the array is: " + largest);
    }

}