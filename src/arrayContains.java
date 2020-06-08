import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class arrayContains {

    /*
        Given two arrays of ints sorted in increasing order,
        Outer and inner,
        Return true if all of the numbers in inner array also appear in the outer array.
        Verify first array contains second array.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for (int i = 0; i < 3; i++) {
            UseThisArray1[i] = myArr[i];
        }
        for (int i = 3; i < 5; i++) {
            UseThisArray2[i - 3] = myArr[i];
        }

//        Code start here ignore the above codes, that is related to the test class.
//        Just use the array name UseThisArray1 and UseThisArray2

        boolean b1 = false;

        outer:
        for (int i = 0; i < UseThisArray2.length; i++) {

            for (int j = 0; j < UseThisArray1.length; j++) {

                if (UseThisArray1[j] == UseThisArray2[i]) {
                    b1 = true;

                    break;

                } else if (UseThisArray1[j] != UseThisArray2[i]) {

                    b1 = false;

                }
                if (j == UseThisArray1.length - 1 && b1 == false) {

                    break outer;
                }
            }
        }
        System.out.println(b1);
    }
}
