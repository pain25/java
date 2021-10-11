package JavaDsa.Searching.BINARYSEARCH;
public class RBS {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=3;
        System.out.println(search(nums,target));

    }
    static int search (int[] nums, int target) {
        int pivot=FindPivot(nums);
        if(pivot==-1){
            return BinarySearch(nums,target,0,nums.length-1);

        }
        // HERE IS NUMS[PIVOT] ADN NOT JUST PIVOT COZ INDEX IS RETURNED AND NOT THE VALUE
        if(nums[pivot]==target){
            return pivot;
        }
        //COZ IF IT IS LESSER THAN THE START IT IS (PIVOT+1) COZ PIVOT IS THE HIGHEST NUMBER
        if(target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }

        return BinarySearch(nums,target,pivot+1,nums.length-1);



    }
    static int FindPivot(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            //coz it may be possible that pivot may be  last element
            //SO MID<END IS TO PREVENT FROM CAUSING INDEX OUT OF BOUND
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }

            //coz it may be possible that pivot may be FIRST element
            //SO MID>START IS TO PREVENT CAUSING INDEX OUT OF BOUND
            if(mid>start && nums[mid]< nums[mid-1]){
                return mid-1;

            }
            //TO SKIP RIGHT SIDE ARRAYS
            if(nums[start]>nums[mid]){
                end=mid-1;
            }
            //TO SKIP LEFT SIDE ARRAYS
            else{
                start=mid+1;
            }

        }
        return 1;


    }
    static int BinarySearch(int[] nums,int target,int start,int end){
        while(start<=end){


            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;

            }
            else
                return mid;
        }
        return -1;
    }

}


