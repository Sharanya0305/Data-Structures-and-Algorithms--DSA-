import java.util.*;
public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set = new HashSet<>();
        Set<Integer>resultset = new HashSet<>();
        for (int num:nums1){
            set.add(num);
        }
        for (int num:nums2){
            if (set.contains(num)){
                resultset.add(num);
            }
        }
        int[]result = new int [resultset.size()];
        int index=0;
        for (int num:resultset){
            result[index++]=num;
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[]arr1={1,2,2,1,3};
        int[]arr2={2,2,3};
        int[]intersection=intersection(arr1,arr2);
        System.out.println("Intersection of the two arrays is: ");
        for (int num:intersection){
            System.out.print(num+" ");
        }
    }}
