package JavaDsa.Searching.BINARYSEARCH;
//leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters ={'a','b','c'};
        char target='a';
        System.out.println(BinarySearch(letters,target));

    }
    static char BinarySearch(char[] letters,char target){
        int start=0;
        int end= letters.length-1;


        while(start<=end){
            int mid=start+(end-start)/2;


            if (target< letters[mid]){
                end=mid-1;

            }
            else  {
                start=mid+1;
            }

        }
        return letters[start% letters.length];
    }

}
