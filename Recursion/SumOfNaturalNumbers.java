package Recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] arrStrings) {
        int num = 20;
        int sum = numAdd(num);
        System.out.println("Sum = " + sum);
    }

    public static int numAdd(int num) {
        if (num != 0)
            return num + numAdd(num - 1);
        else
            return num;
    }

}
