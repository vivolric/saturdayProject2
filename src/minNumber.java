import java.util.Arrays;
import java.util.Scanner;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};

        int min = Integer.MAX_VALUE;
        // int min = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
