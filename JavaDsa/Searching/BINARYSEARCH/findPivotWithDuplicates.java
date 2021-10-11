package JavaDsa.Searching.BINARYSEARCH;

public class findPivotWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,1,1,1,1,1,1,1,1,1,1};
        System.out.println(findPivotWithDuplicates(arr));
    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0; 
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
       if(mid<end&&arr[mid]>arr[mid+1]){
           return mid;
       }
       if (start<mid && arr[mid]<arr[mid-1]){
           return mid-1;
       }
       if(arr[mid] == arr[start] && arr[mid]==arr[end]){
           if (start<end && arr[start]>arr[start+1]){
               return start;
           }
           start++;
           if(start<end && arr[end]<arr[mid-1]){
               return mid-1;
           }

       }
       else{
           if (arr[start]<arr[end] || arr[start]==arr[mid]){
               start=mid+1;
       }
           else{
               end=mid-1;
           }




       }
        }
        return -1;
    }


}
