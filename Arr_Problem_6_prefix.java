package Array_PW;

import java.util.Scanner;

public class Arr_Problem_6_prefix {
    
    public static int arrSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
        }
        return sum;
    }
    
    public static boolean equalPartation(int arr[]) {
        int totalsum = arrSum(arr);
        int presum = 0;
        for (int i = 0; i < arr.length; i++) {
            presum += arr[i];
            if (presum == totalsum - presum) {
                System.out.println("indexes 0 to "+i);
                System.out.println("indexes  "+(i+1)+" to " +arr.length);
                return true;
            }
        }
        return false;
    }
    
    public static void prefixArr(int arr[]) {//question 1
        
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i - 1] + arr[i];
            
        }
        printArr(arr);
        System.out.println("prefix arr sum :");
        printArr(pre);
    }
    
    public static void prefixArrQueries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arr :");
        int arr[] = new int[sc.nextInt() + 1];
        System.out.println("enter element in arr :");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        int pre[] = new int[arr.length];
        pre[1] = arr[1];
        for (int i = 2; i < arr.length; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }
        System.out.println("enter how mani queries entering :");
        int x = sc.nextInt();
        while (x > 0) {
            System.out.println("enter  range  l and r :");
            int l = sc.nextInt(), r = sc.nextInt();
            System.out.println("sum with in the range l and r : " + (pre[r] - pre[l - 1]));
            x--;
        }
        
    }
    
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            
        }
        System.err.println();
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arr :");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter element in arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        //  prefixArr();
        //  prefixArrQueries();
        System.out.println("equal partation is posible  " + equalPartation(arr));
    }
}
