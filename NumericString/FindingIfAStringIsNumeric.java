package NumericString;

public class FindingIfAStringIsNumeric {
    public static void main(String[] arrStrings) {

        String stringLine = "YAHOO";
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(stringLine);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if (numeric)
            System.out.println(stringLine + " is a number");
        else
            System.out.println(stringLine + " is not a number");
    }

}
