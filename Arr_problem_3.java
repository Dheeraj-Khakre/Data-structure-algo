package Array_PW;

public class Arr_problem_3 {

    public static int targetSum_sub_Arr(int arr[], int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        ans++;
                        System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");

                    }

                }

            }

        }
        return ans;

    }

    public static int targetSumPair(int arr[], int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == x) {
                    ans++;
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");

                }
            }

        }
        return ans;
    }
// uniqe number in given arr 

    public static void uniqueNo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println();
    }

    public static int sec_LargestEl(int arr[]) {
        int fm = Integer.MIN_VALUE, sm = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (fm < arr[i]) {
                fm = arr[i];
            }
            if (fm>arr[i] && sm<arr[i]  ) {
                sm = arr[i];

            }

        }
        return sm;
    }
    public static int firstReapitingNo(int arr[]){
       
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[j];
                }
            }
        }
        return -1;
    }
    //// assignment  questions 
    /*
    Given an array sorted in increasing order of size n and an integer x, find if there exists a
pair in the array whose absolute difference is exactly x.(n>1)
    */
    public static int binarySearch(int arr[], int k){
        int s=0,e=arr.length-1,mid=0;
        
        while(mid>=s && mid<=e ){
            mid = (s+e)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(k<mid){
                s=mid+1;
            }else{
                e= mid -1;
            }
        }
        return -1;
        
    }
    /*
    Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
     missing number from the first N integers. There are no duplicates in the list.*/
    
    public static void missingEl(int arr[], int n){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
        }
        System.out.println("missing element is : "+ ((n*(n+1))/2 - sum) );
    }
    public static void main(String args[]) {
        int arr[] = {1,  3, 4,5, 9, 10, 12};
        System.out.println("terget sum of pair : " + targetSumPair(new int[]{3, 1, 4, 8, 5, 2}, 9));
        System.out.println("terget sum of sub arr..: " + targetSum_sub_Arr(new int[]{3, 1, 4, 8, 5, 2}, 12));

        uniqueNo(arr);

        System.out.println(" second largest element in arr : " + sec_LargestEl(new int[]{10, 10, 4, 8,2, 5, 2}));
        System.out.println("firt reapiting  element in arr :"+firstReapitingNo(new int[]{1, 10, 4, 8,20, 5, 2}));
        int pos= binarySearch(arr,15 );
        if(pos==-1){
            System.out.println("element not exist ");
        }
        else{
            System.out.println("element is exist  : index "+pos);
        }
        missingEl(new int[]{1, 2, 4, 6, 3, 7, 8},8);
    }
}
