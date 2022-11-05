package com.nawaz;
import java.util.HashSet;

public class InterSectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{15, 17, 27, 27, 29, 15};
        int[] arr2 = new int[]{16, 17, 28, 17, 51, 17};
        int m = arr1.length;
        int n = arr2.length;
        int ans = interSection(arr1, m, arr2, n);
        System.out.println(ans);
    }

    static int interSection(int[] arr1, int m, int[] arr2, int n)
    {
        HashSet<Integer> result = new HashSet<>();
        int count = 0;
        for (int i=0; i<m; i++){
            result.add(arr1[i]);
        }
        for(int j=0; j<n; j++){
            if(result.add(arr2[j])){
                count++;
                result.remove(arr2[j]);
            }
        }
        return count;
    }
}
