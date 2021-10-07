package JavaDsa.Searching.BINARYSEARCH;

import java.util.Arrays;

public class FirstAndLastPostition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8,8,8,8, 10,10};
        int target = 8;
        String ans = Arrays.toString(searchRange(nums,target));
        System.out.println(ans);
    }


    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        int start=search(nums,target,true);
        int end=search(nums, target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    //BEST SOLUTION
//    public static int[] searchRange(int[] nums, int target) {
//
//        if(nums.length == 1 && nums[0] == target)
//            return new int[] {0, 0};
//
//        int start = 0;
//        int end = nums.length - 1;
//
//        int startIndex = -1;
//        int endIndex = -1;
//
//        while(start <= end) {
//            int mid = start + ((end - start) / 2);
//
//            if(nums[mid] < target) {
//                start = mid + 1;
//            }
//            else if(nums[mid] > target) {
//                end = mid - 1;
//            }
//            else {
//                //THIS IS FOR START INDEX
//                for(int i = mid; i >= 0; i--) {
//                    if(nums[i] != target)
//                        break;
//                    startIndex = i;
//                }
//                //THIS IS FOR END SOLUTION
//                for(int i = mid; i < nums.length; i++) {
//                    if(nums[i] != target)
//                        break;
//                    endIndex = i;
//                }
//
//                return(new int[] {startIndex, endIndex});
//            }
//        }
//
//        return(new int[] {startIndex, endIndex});
//    }
}