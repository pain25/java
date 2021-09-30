package JavaDsa.Searching.BINARYSEARCH;

public class AgnosticBinarySeach {
    public static void main(String[] args) {
        int[] arr={77,65,54,43,33,21,14,11};
        int target=43;
        System.out.println(AgBs(arr,target));

    }
    static int AgBs(int[] arr, int target){

        //taking from first value to the last value
        int start = 0;
        int end= arr.length-1;

        //CHECKING WHETHER ARRAY IS IN ASCENDING ORDER OR DESCENDING
        //RETURN TRUE IF ARRAY IS ASCENDING AND FALSE DESCENDING
        boolean isAsc=arr[start]<=arr[end];

        //THIS IS INDEX
        while(start<=end){

            //ALGORITHM TO DIVIDE THE ARRAY TO HALF AND CHECK IF TARGET IS LESS OR MORE THAN THE MIDDLE ELEMENT
            int mid=start+(end-start)/2;

            //IF TARGET IS FOUND AS THE MIDDLE ELEMENT RETURN
            if(arr[mid]==target){
                return mid;
            }

            //IF ISASC IS TRUE
            if (isAsc){
                    if (target<arr[mid]){
                        end=mid-1;
                    }
                    else
                        start=mid+1;
                    }

            //IF ISASC IS FALSE
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else
                    start=mid-1;
            }
                }



        return -1;
        }



    }

