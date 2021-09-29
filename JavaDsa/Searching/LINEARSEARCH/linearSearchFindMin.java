package JavaDsa.Searching.LINEARSEARCH;

public class linearSearchFindMin {
    public static void main(String[] args) {
        int[]  arr={ 12,3,67,33,22,5,43};
        System.out.println(Min(arr));
        
    }
    static int Min(int[] arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;

    }
}
