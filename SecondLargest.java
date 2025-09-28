public class SecondLargest {
    public static int findsecondlargest(int[]arr){
        int n = arr.length;
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                slargest=largest;
                largest = arr[i];
            }
            else if (arr[i]!=largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
        }
        public static void main(String[] args) {
            int[] numbers = {34, -100, -23, -89, -3, -90, -45};
            int secondlargest = findsecondlargest(numbers);
            System.out.println("The second largest number in the array is: " + secondlargest);
        }
    }
    

