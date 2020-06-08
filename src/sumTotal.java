import java.util.Arrays;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22"}, {"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */

    public static void main(String[] args) {

//        Your code start here,ignore the above codes it is related to test class.
        String[][] arr = {{"$12", "$22"}, {"€9", "€40", "$1", "$2"}, {"€12"}};
        double[][] array1 = new double[arr.length][];
        double sum = 0.0;

        for (int i = 0; i < arr.length; ++i) {
            array1[i] = new double[arr[i].length];
            for (int j = 0; j < array1[i].length; j++) {
                if (arr[i][j].contains("$")) {

                    double a = Integer.parseInt(arr[i][j].replace("$", ""));
                    a = 3.2 * a;
                    array1[i][j] = a;
                    sum += a;

                } else if (arr[i][j].contains("€")) {

                    double a = Integer.parseInt(arr[i][j].replace("€", ""));
                    a = 4.2 * a;
                    array1[i][j] = a;
                    sum += a;
                }
            }
        }
        System.out.println(sum);
    }
}


//        System.out.println(Arrays.deepToString(array1));
//        double sum = 0.0;
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                sum += array1[i][j];
//
//            }
//        }





