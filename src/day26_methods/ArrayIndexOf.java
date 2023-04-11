package day26_methods;

public class ArrayIndexOf {
    public static void main(String[] args) {
        String str = "loop";
        int index = str.indexOf("l");


        int [] arr = {3, 1, 546, 34, 23};
        //            0  1   2    3   4
        int num = 546;
    }
    public static int indexOf2 (int [] arr, int num) {

        int locationOfElement = 0;
        for ( int each : arr) {        // {3, 1, 546, 34, 23};   num = 444
            // 0  1   2    3   4
            if (each == num) {
                return locationOfElement;
            } else {
                locationOfElement++;
            }
        }
        return -1;
    }


    public static int indexOf (int [] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
return  -1;
}


}

