import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one array of Strings
        If this string array contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(" ");

//        Code Start here
//        You should use -> UseThisArray

        for (int i = 0; i < UseThisArray.length; i++) {

            boolean a = UseThisArray[i].equals("Orange");
            if (a = true) {
                String str1 = UseThisArray[i].replace("Orange", "Apple");
                System.out.print(str1 + " ");
            }
        }
    }
}