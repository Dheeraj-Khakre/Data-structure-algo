package Array_PW;

import java.util.Arrays;

public class Array_basices {

    public static void occurance(int arr[], int x) {
        int occu = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                occu++;
            }
        }
        System.out.println("occurans of  element   " + occu);
    }

    public static void lastoccurance(int arr[], int x) {
        int lo = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (x == arr[i]) {
                lo = i;
                System.out.println(" last occurance of an element " + lo);
                return;
            }
        }

    }

    public static void positiveEl(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(" " + arr[i]);
            }
        }
    }

    public static void oddEl(String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + str[i]);
            }
        }
    }

    public static void evenEl(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 20 == 0) {
                System.out.print(" " + arr[i]);
            }
        }

    }

    public static void mini_Max_ele(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximun element " + max);
        System.out.println("minimun element " + min);

    }

    /*Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
Peak element is the one which is greater than its immediate left neighbor and 
    its immediate right neighbor.
Leftmost and rightmost element cannot be a peak element.*/
    public static void peakElement(int[] arr) {
        int peak = 0;
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peak = arr[i];
            }

        }
        System.out.println(" peak element is " + peak);

    }

    static int stritlyGreater(int arr[], int x) {
        int sg = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                sg++;
            }
        }
        return sg;
    }

    public static boolean isSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static int[] kthsmall_big_El(int arr[], int s, int b){
        if(!!(s>=0 && s<arr.length )  && !(b>=0 && b<arr.length) ){
            System.out.println(" wronge input please chack input");
            return new int[]{-1,-1};
        } 
        Arrays.sort(arr);
       return new int[]{arr[s],arr[arr.length-b]}; 
        
    }
    static int[] small_big_El(int arr[]) {
        int ans[] = new int[2];
        ans[0] = Integer.MAX_VALUE;
        ans[1] = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans[1]) {
                ans[1] = arr[i];
            }
            if (arr[i] < ans[0]) {
                ans[0] = arr[i];
            }
        }
        return ans;
    }

    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr = {1, 6, -4, 7, -8, 9, -3, 9, -5, 19};
        positiveEl(arr);
        oddEl(new String[]{"ab", "bc", "cd", "de", "ef", "fg"});
        evenEl(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        mini_Max_ele(new int[]{1, 3, 7, 9, -3, -5, -6, -7, 10});
        peakElement(new int[]{1, 1, 3, 4, 2, 3, 5, 7, 0});
        occurance(arr, 9);
        lastoccurance(arr, 9);
        System.out.println("" + stritlyGreater(arr, 1));
        System.out.println(" is sorted array " + isSort(new int[]{1, 2, 3, 4, 7}));
        printarr(small_big_El(arr));
     
      
        printarr(kthsmall_big_El(arr, 4, 7));
        System.out.println("sort arr");
          printarr(arr);
        
        

    }
}
