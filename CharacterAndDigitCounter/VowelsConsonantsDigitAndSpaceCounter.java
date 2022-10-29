package CharacterAndDigitCounter;

public class VowelsConsonantsDigitAndSpaceCounter {
    public static void main(String[] arrStrings) {
        String stringLine = "This website is aw3som3.";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        stringLine = stringLine.toLowerCase();
        for (int i = 0; i < stringLine.length(); ++i) {
            char chr = stringLine.charAt(i);

            // check if character is any of a, e, i, o, u
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
                ++vowels;
            }

            // check if character is in between a to z
            else if ((chr >= 'a' && chr <= 'z')) {
                ++consonants;
            }

            // check if character is in between 0 to 9
            else if (chr >= '0' && chr <= '9') {
                ++digits;
            }

            // check if character is a white space
            else if (chr == ' ') {
                ++spaces;
            }
        }

        System.out.println("Vowels:- " + vowels);
        System.out.println("Consonants:- " + consonants);
        System.out.println("Digits:- " + digits);
        System.out.println("White spaces:- " + spaces);
    }

}
