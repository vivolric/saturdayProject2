import java.util.Arrays;
import java.util.Scanner;

public class Common2Arrays {

    /*
         Given 2 arrays of ints, array1 and array2, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true

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
        int[] array1 = new int[3];
        int[] array2 = new int[2];
        for (int i = 0; i < 3; i++) {
            array1[i] = myArr[i];
        }
        for (int i = 3; i < 5; i++) {
            array2[i - 3] = myArr[i];
        }

/*
         Your code start here,ignore the above codes it is related to test class.
         Don't change or delete anything before this line
         Just use array1 and array2 .

 */
        boolean b1 = false;
        if (array1[0] == array2[0] || array1[array1.length - 1] == array2[array2.length - 1]) {
            b1 = true;
            System.out.println(b1);
        } else {
            System.out.println(b1);

        }
    }
}
