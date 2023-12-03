package Array_PW;

import java.util.Arrays;
import java.util.HashSet;

public class Arr_problem_2 {

    /**
     * 1 - Given an unsorted array arr[] of size N having both negative and
     * positive integers, place all negative elements at the end of array
     * without changing the order of positive elements and negative element
     */
    static void positive_negitiv_Arr(int arr[]) {
        int ans[] = new int[arr.length];
        int p = 0, n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                ans[p++] = arr[i];
            }
            if (arr[i] < 0) {
                ans[n--] = arr[i];
            }
        }
        printArr(ans);

    }

    /*2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find 
 union between these two arrays and print the number of elements of the union set.
 Union of the two arrays can be defined as the set containing distinct elements from both 
 the arrays. If there are repetitions, then only one occurrence of element should be printed 
 in the union*/

    static void uniouOFArr_El(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        int i = 0;
        while (i < arr2.length) {
            hs.add(arr1[i]);
            hs.add(arr2[i]);
            i++;
        }
        for (; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        System.out.println("union of two arr. number of element of union set  : " + hs.size());
    }

    /*Given an array arr[] and an integer K where K is smaller than size of array, the task is to 
 find the Kth smallest element in the given array. It is given that all array elements are 
 distinct.*/
    static void kthSmallest_el(int arr[], int k) {
        Arrays.sort(arr);
        System.out.println("k th smallest element " + arr[k - 1]);
    }

    /* - Given an unsorted array A of size N that contains only non-negative integers, find a 
 continuous sub-array which adds to a given number S.
 In case of multiple subarrays, return the subarray which comes first on moving from left 
 to right.
 You need to print the start and end index of answer subarray.*/
      static void sub_Arr(int arr[], int s){
         
          for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                  int sum =0;
                  for(int k=i;k<=j;k++){
                      sum += arr[k];
                  }
                  if(sum==s){
                      System.out.println(i+1 + " "+ (j+1));
                      return;
                  }
              }
          }
          
      }
    
      static void  printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
        positive_negitiv_Arr(arr);

        uniouOFArr_El(new int[]{1, 1}, new int[]{4, 4});

        kthSmallest_el(arr, 3);
        sub_Arr(new int[]{1,2,3,7,5}, 12);
    }
}
