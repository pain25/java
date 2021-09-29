package JavaDsa.Searching.LINEARSEARCH;
//Given an array nums of integers, return how many of them contain an even number of digits.
//
////Example 1:
////Input: nums = [12,345,2,6,7896]
//Output: 2

public class FIndEvenNumbeOfDigits {
    public static void main(String[] args) {
        //Declaring the array
        int[] num={12,345,2,6,7896};
        //passing the num array to FindEvenNumbers method and printing it
        System.out.println(FindEvenNumbers(num));



    }
    static int FindEvenNumbers(int[] num){
        int count=0;
        //loop for passing the arrray
        for (int i = 0; i<num.length; i++) {
            //passing array elements to even method
            //one number at a time
            if (even(num[i])){
                //whenever even(num) is true then increment count
                count++;

            }

        }
        return count;
    }
    //method of to check if number is even. if it is even then return true and if odd return false
    //passing number
    static boolean even (int num){
        //passing the current number to the digits method
        int EvenNumber=digits(num);
        //return true if even and return false if odd
        return EvenNumber %2==0;

    }

    //to check the number of digits in a number
    //passing the number from the even method
    static int digits (int num){

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count=0;
        //to check whether the number of digits is greater than zero
        while (num>0){
            //if  number of digits is greater than zero than increment count with one
            count++;
            //dividing the number with 10 to reduce one digit
            num=num/10;
        }
        //returning the number of digits whether it is even or odd
        return count;
    }

}

