import java.util.*;
public class Union {
    public static int[] UnionOfArrays (int[]arr1,int[]arr2){
        Set<Integer> Unionset = new HashSet<>();
        for (int num:arr1){
            Unionset.add(num);
        } 
        for(int num:arr2){
            Unionset.add(num);
        }
        int[]result = new int[Unionset.size()];
        int index=0;
        for (int num:Unionset){
            result[index++]=num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2={3,4,5,6,7};
        int[]union=UnionOfArrays(arr1,arr2);
        System.out.println("Union of the two arrays is: ");
        for (int num:union){
            System.out.print(num+" ");
        }
    }
    
}
