import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {

      /*
        Given a String array

        Reverse the String array

        Print the reversed array

        NOTE: While printing the array don't use for loop

        Use Arrays.toString(your_array_name);

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

//        Your code start here,ignore the above codes it is related to test class.
//        Use -> useThisArray

        int a = useThisArray.length;
        String[] array1 = new String[a];

        int b = 0;

        while (b < a) {
            array1[b] = useThisArray[a - 1 - b];
            b++;
        }
        System.out.println(Arrays.toString(array1));
    }
}

//       int a = useThisArray.length;
//        String[] array1 = new String[a];
//        int b = 0 ;
//        for(int i = 0 ; i<a ; i++)
//        {
//            array1[i]=useThisArray[a-1-i];
//
//        }
//        System.out.println(Arrays.toString(array1));


