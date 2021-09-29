package JavaDsa.Searching.LINEARSEARCH;

public class LinearSearch {
        //LINEAR SEARCH WITHOUT METHOD
        public static void main(String[] args) {
            int[] numbers= new int[]{177, 52, 13, 94, 15, 36, 77, 38, 19};
            int target=52,element = 0;
            int index = 0;
            for( index=0; index<numbers.length;index++){
                element=numbers[index];
                if(element==target){
                    System.out.println(index);
                    break;
                }
            }
            if(index==numbers.length) {
                System.out.println("not found");
            }

        }

//LINEAR SEARCH USING METHOD
//        public static void main(String[] args) {
//            int[] nums={12322,43,233,23,342,632,4};
//            int target=233;
//            int ans=lS(nums,target);
//            System.out.println(ans);
//
//        }
//        static int lS(int[] arr,int target){
//            if(arr.length==0){
//                return -1;
//            }
//            for (int index=0;index<arr.length;index++){
//                int element=arr[index];
//                if(element==target){
//                    return index;
//                }
//
//            }
//            return -1;
//        }

//LINEAR SEARCH OF TRUE OR FALSE
//    public static void main(String[] args) {
//        int[] nums={12322,43,233,23,342,632,4};
//        int target=233;
//        boolean ans=lS(nums,target);
//        System.out.println(ans);
//
//    }
//    static boolean lS(int[] arr,int target){
//        if(arr.length==0){
//            return false;
//        }
//        for (int element:arr){
//
//            if(element==target){
//                return true;
//            }
//
//        }
//        return false;
//    }
//

//SEARCH ELEMENTS BY VALUES
//    public static void main(String[] args) {
//        int[] nums={12322,43,233,23,342,632,4};
//        int target=43;
//        int ans=lS(nums,target);
//        System.out.println(ans);
//
//    }
//    static int lS(int[] arr,int target){
//        if(arr.length==0){
//            return -1;
//        }
//
//        for (int element:arr ){
//
//            if(element==target){
//                return element;
//            }
//
//        }
//        return -1;
//    }

    }


