//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
package JavaDsa.Searching.BINARYSEARCH;
// Given an integer array arr that is guaranteed to be a mountain, return any i such that
//        Input: arr = [24,69,100,99,79,78,67,36,26,19]
//        Output: 2


public class MountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,0,0};
        System.out.println(peakIndexInMountainArray(arr));

    }
    public static  int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;


// if   while(start<=end) then it will be an infinte loop
        while(start<end){


            int mid=start+(end-start)/2;
//IF MIDDLE ELEMENT IS GREATER THAN THE NEXT ELEMENT THEN MIDDLE ELEMENT WILL BE THE END
            if(arr[mid] >arr[mid+1]){
                end=mid;}
            //IF MIDDLE ELEMENT IS SMALLER THAN THE NEXT ELEMENT THAN NEXT ELEMENT WILL BE START
            else{
                start=mid+1;


            }
        }
        return end;
    }

}
