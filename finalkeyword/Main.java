package finalkeyword;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        ArrObject arr = new ArrObject(num);
        num[1] =22222;

        int[] copy = arr.getArr();
        copy[2] = 3333;

        System.out.println(Arrays.toString(arr.getArr()));

    }
}
