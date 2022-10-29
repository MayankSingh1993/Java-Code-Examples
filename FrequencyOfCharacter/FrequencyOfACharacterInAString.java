package FrequencyOfCharacter;

public class FrequencyOfACharacterInAString {
    public static void main(String[] arrStrings) {
        String stringLine = "Java Is Very Awesome Language.";
        char cha = 'e';
        int frequency = 0;

        for (int i = 0; i < stringLine.length(); i++) {
            if (cha == stringLine.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + cha + " = " + frequency);
    }

}
