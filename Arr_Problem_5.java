package Array_PW;

import java.util.Scanner;

public class Arr_Problem_5 {
    
    public static void sortNonDec_sqrt(int arr[]) {
        int ans[] = new int[arr.length];
        int i = 0, k = arr.length - 1, j = arr.length - 1;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k--] = arr[i] * arr[i];
                i++;
            } else {
                ans[k--] = arr[j] * arr[j];
                j--;
                
            }
        }
        printArr(ans);
    }

    public static void even_OddArr(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                int p = arr[i];
                arr[i] = arr[j];
                arr[j] = p;
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 == 1) {
                j--;
            }
        }
        printArr(arr);
        
    }
    
    public static void sorting0_1s(int arr[]) {
        // optimize  approach
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i++] = 0;
                arr[j--] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        printArr(arr);
    }
    
    public static void sorting0_1(int arr[]) {
        // broot force approach
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < countZero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            
        }
        printArr(arr);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr size :");
        
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter value in arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //  sorting0_1s(arr);
        // even_OddArr(arr);
        sortNonDec_sqrt(arr);
    }
    
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
}
