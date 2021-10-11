// https://leetcode.com/problems/find-in-mountain-array/
package JavaDsa.Searching.BINARYSEARCH;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(search(array,target));

    }

    static int search(int[] arr, int target) {
        int peak=PeakIndex(arr);
        int firstTry=AgBinarySearch(arr,target,0,peak);
        if (firstTry!=0){
            return firstTry;
        }
        else
            return AgBinarySearch(arr,target,peak+1, arr.length);

    }
    static int PeakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else
                start=mid+1;

        }
        return start;
    }
    static int AgBinarySearch(int[] arr,int target,int START,int END){
    int start=START;
    int end=END;

    boolean IsTrue=arr[START]<=arr[END];

    while(start<=end){
        int mid=START+(END-START)/2;

       if (arr[mid]==target){
           return mid;
       }
                if(IsTrue){
                    if(arr[mid]>target){
                        end=mid-1;}
                    else {
                        start=mid+1;}
                }
                else{
                    if(arr[mid]<target){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }


        }
    }
    return -1;

}}