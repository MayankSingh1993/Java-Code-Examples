package MultiplicationTable;

public class MultiplicationTableCreator {
    public static void main(String[] arrStrings) {
        int num = 5;
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
