public class RemoveDuplicates {
    public static int RemoveDuplicates (int[]arr){
        int n=arr.length;
        int j=0;
        for (int i=1;i<n;i++){
            if (arr[i]!= arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;   
    }
    public static void main(String[] args) {
        int[] numbers = {1,1,2,2,3,3,4,4,5,5};
        int length = RemoveDuplicates(numbers);
        for(int k=0;k<length;k++){
            System.out.print(numbers[k]+ " ");
        }
    
}
}
