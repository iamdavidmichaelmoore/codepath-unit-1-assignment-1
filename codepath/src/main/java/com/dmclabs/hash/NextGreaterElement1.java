package com.dmclabs.hash;

import java.util.*;

public class NextGreaterElement1 {
    
    private int[] arr1;
    private int[] arr2;

    public NextGreaterElement1(int[] numbers1, int[] numbers2) {
        arr1 = numbers1;
        arr2 = numbers2;
    }

    
    //NOTE - NextGreaterElement1 Time Complexity: O(n) + O(m*n)
    public int[] find() {
        int[] ans = new int[arr1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i],i);
        }

        for (int j = 0; j < arr1.length; j++) {
            int nextGreaterElement = -1;
            for (int k = map.get(arr1[j]); k < arr2.length; k++) {
                if (arr2[k] > arr1[j]) {
                    nextGreaterElement = arr2[k];
                    break;
                }
            }
            ans[j] = nextGreaterElement;
        }
        return ans;
    }
}
