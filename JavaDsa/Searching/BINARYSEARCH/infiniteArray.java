package JavaDsa.Searching.BINARYSEARCH;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

//Find position of an element in a sorted array of infinite numbers

public class infiniteArray {
    public static void main(String[] args){
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        int ANS=ans(arr,target);
        System.out.println(ANS);

    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;


        //BECAUSE TARGET IS ALWAYS GREATER THAN THE PREVIOUS END
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;


        }
        return BinarySearch(arr,target,start,end);

    }
    static int BinarySearch(int[] arr,int target,int START,int END){
        int start=START;
        int end=END;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
             else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
