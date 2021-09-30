package JavaDsa.Searching.BINARYSEARCH;

public class BInarySearh {
    public static void main(String[] args) {
        int[] arr={5,36,47,58,69,70,81,93};
        int target=20;
        System.out.println(BinarySearch(arr,target));

    }
     static int BinarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;


        while(start<=end){
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;

            }
            else if(target >arr[mid] ){
                start=mid+1;
            }
            else
                return mid;
        }
         return -1;
     }

}
