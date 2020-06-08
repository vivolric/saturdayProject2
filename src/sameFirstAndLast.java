import java.util.Scanner;

public class sameFirstAndLast {
   /*

    Given an array of ints, print true if the array is length 1 or more,
    and the first element and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    print just true or false

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

//       Your code start here,ignore the above codes it is related to test class.

        Boolean b = true;
        if (useThisArray.length >= 1) {
            String firstElement = useThisArray[0];
            String lastElement = useThisArray[useThisArray.length - 1];
            if (firstElement.equals(lastElement)) {
                b = true;
            } else {
                b = false;
            }
            //System.out.println(firstElement);
            //System.out.println(lastElement);
            System.out.println(b);
        }
    }
}

//    String[] useThisArray1 = useThisArray;
//    int a = useThisArray.length;
//    String[] newString = new String[2];
//        newString[0] = useThisArray1[0];
//                newString[1] = useThisArray1[a - 1];
//                if (newString[0].equals(newString[1]) ) {
//                System.out.println(true);
//                } else {
//                System.out.println(false);
//                }