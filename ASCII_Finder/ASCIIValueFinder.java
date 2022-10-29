package ASCII_Finder;

public class ASCIIValueFinder {

    public static void main(String[] ar) {

        char cha = 'a';
        int ascii = cha;
        // You can also cast cha to int
        int castAscii = (int) cha;

        System.out.println("The ASCII value of " + cha + " is: " + ascii);
        System.out.println("The ASCII value of " + cha + " is: " + castAscii);
    }
}