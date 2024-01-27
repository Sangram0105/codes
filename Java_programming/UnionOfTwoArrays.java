import java.util.*;

public class UnionOfTwoArray {
    


    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};


        HashSet<Integer> set=new HashSet<>();//always store unique values in the hash set

        int n=arr1.length;
        int m=arr2.length;

        for(int i=0;i<n;i++){
              set.add(arr1[i]);
        }

        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }

        System.out.println(set);
    }
}
