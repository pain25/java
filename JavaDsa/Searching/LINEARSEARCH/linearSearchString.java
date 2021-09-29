package JavaDsa.Searching.
        LINEARSEARCH;

//LINEAR SEARCH TRUE OR FALSE
public class linearSearchString {
    public static void main(String[] args) {
        String name="ravi";
        char target='k';
        System.out.println(search(name,target));

    }
    static boolean search(String str,char target){
        //CHECKING IF LENGTH IS ZERO
        if (str.length()==0){
                return false;
        }

        for (int i = 0; i <str.length() ; i++) {
            if (target==str.charAt(i)){
                return true;

            }
        }
            return false;
        }
}
