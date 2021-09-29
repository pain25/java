package JavaDsa.Searching.LINEARSEARCH;

public class MaXOf2DArray {
    public static void main(String[] args) {
        //creating 2D array
        int [][] arr={{61,2,3},{4, 5, 6},{7,8,9}};
        //passing 2D array to the method
        System.out.println(Max(arr));
    }

    static int Max(int[][] array){
        //Considering max value to be the  first element
        int max=array[0][0];
        //creating for each loop for row
        for (int[] ints:array)  //ints is declared and array is passed from the main
        {
            //for loop for column
            for (int element:ints  //element is declared and ints is used from the row array
                 ) {if (element>max){  //condition if current value is greater than first value
                     max=element; //if current value than previous max then store it in max variable
            }

            }
        }
        return max; //return the max valuer to main method

    }
}
