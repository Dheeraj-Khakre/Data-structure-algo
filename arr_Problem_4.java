package Array_PW;

import java.util.Scanner;

public class arr_Problem_4 {

    // quer. arr 
    public static void searchQuaer(int arr[]) {
        int ref[] = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            ref[arr[i]]++;
        }
        System.out.println("enter how much queri run ");
        int x = new Scanner(System.in).nextInt();
        while (x > 0) {
            System.out.println("enter seacing element ");
            int a = new Scanner(System.in).nextInt();
            if (ref[a] > 0) {
                System.out.println("yes");

            } else {
                System.out.println("no");
            }

            x--;
        }
    }

    // rotation without usig extra space
    static void reverseArr(int[] arr, int i, int j) {
        while (i < j) {
            int p = arr[i];
            arr[i] = arr[j];
            arr[j] = p;
            i++;
            j--;
        }
    }

    public static void rotationInplace(int[] arr, int k) {
        reverseArr(arr, 0, arr.length - k - 1);
        reverseArr(arr, arr.length - k, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);

        printArr(arr);
    }

    // roteting arr.  of kth position ...
    public static int[] kthRotation(int[] arr, int k) {

        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - k; i < arr.length; i++, j++) {
            ans[j] = arr[i];
        }
        for (int i = 0; i < arr.length - k; i++, j++) {
            ans[j] = arr[i];
        }
        return ans;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter arr size");
//        int arr[] = new int[sc.nextInt()];
//        System.out.println("enter elment in arr");
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        //  System.out.println("enter kth for rotation");
        //  printArr(kthRotation(arr, sc.nextInt()));
        // rotationInplace(arr, sc.nextInt());
       // searchQuaer(arr);
//       System.out.println("first occurance "+firstOccurance(arr));
//       negetive_positive_Arr(arr);
             int x=  tainArival_deprture_Problem(new int[]{900,940,950,110,1500,100}, new int[]{910,1200,1120,1130,1900,2000});

    }
    // assignment
    /*Given an array arr[] of size n, find the first repeating element. The element should occur more than
once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
(Easy)*/
    public static int firstOccurance(int arr[]){
   
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return i;
                    
                }
            }
        }
        return -1;
    }
    /*Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
every positive number is followed by a negative and vice-versa maintaining the order of appearance.
The number of positive and negative numbers need not be equal. Begin with a negative number.
If there are more positive numbers, they appear at the end of the array. If there are more negative
numbers, they too appear at the end of the array.*/
    public static void negetive_positive_Arr(int arr[]){
          System.out.println("befor positive - negetive arrangment ");
        printArr(arr);
                
        boolean flag=false;
        int ans[]= new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==0){
                    continue;
                }
                if(arr[j]<0 && flag==false){
                    ans[k++]=arr[j];
                    arr[j]=0;
                    flag=true;
                    break;
                }
                if(arr[j]>0 && flag==true){
                    ans[k++]=arr[j];
                    arr[j]=0;
                    flag=false;
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                ans[k++]=arr[i];
            }
        }
      
        System.out.println("after  positive - negetive arrangment ");
        printArr(ans);
    }
            
/*Q3. Minimum Platforms
Given arrival and departure times of all trains that reach a railway station. Find the minimum number
of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure
time can never be the same for a train but we can have arrival time of one train equal to departure time
of the other. At any given instance of time, same platform can not be used for both departure of a train
and arrival of another train. In such cases, we need different platforms.*/
    
    
    // code here
    public static int tainArival_deprture_Problem(int ari[], int dep[]){
        int platform=1;
        for(int i=0;i<ari.length;i++){
            for(int j=0;j<ari.length;j++){
                if(i==j){
                    continue;
                }
                if(ari[i]>dep[j]  && dep[i] <=ari[j]  ){
                    platform++;
                }
            }
        }
        System.out.println("no. of platfor requered : "+platform);
                
        return platform;
    }
}
