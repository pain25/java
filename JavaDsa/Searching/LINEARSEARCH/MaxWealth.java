package JavaDsa.Searching.LINEARSEARCH;


public class MaxWealth {
    public static void main(String[] args) {
        int [][] numbers= {{1,2,3},{4,5,6}};
        System.out.println(MaximunWealth(numbers));
    }


    static int MaximunWealth(int[][] numbers) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : numbers) {
            int sum = 0;
            for (int anint : ints
            ) {
                sum += anint;

            }
            if (sum > ans)
                ans = sum;

        }
        return ans;

    }
}

