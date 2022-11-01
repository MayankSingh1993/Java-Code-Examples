package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        boolean res = true;
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // System.out.println(str);
        int start = 0, end = str.length() - 1;
        while (start < end) {
            // System.out.println(start + " " + end);
            if (str.charAt(start) != str.charAt(end)) {
                res = false;
                return res;
            }
            start++;
            end--;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "race a car"; // "A man, a plan, a canal: Panama"
        boolean isPalind = isPalindrome(str);
        System.out.println("isPalindrome: " + isPalind);
    }
}
