package com.nawaz;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{7,8,3,5,6};
        int[] arr2 = new int[]{8,22,12,13,14};
        int m = arr1.length;
        int n = arr2.length;
        int ans = unionSize(arr1, m, arr2, n);
        System.out.println(ans);
    }

    static int unionSize(int[] arr1, int m, int[] arr2, int n) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < m; i++){
            result.add(arr1[i]);
        }
        for (int j = 0; j < n; j++){
            result.add(arr2[j]);
        }
        return result.size();
    }
}
