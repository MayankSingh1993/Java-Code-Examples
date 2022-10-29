package EnumClass;

public class CreatingEnumClass {
    enum Size {

        // enum constants
        SMALL, MEDIUM, LARGE, EXTRALARGE;

        public String getSize() {

            // this will refer to the object SMALL
            switch (this) {
                case SMALL:
                    return "small";

                case MEDIUM:
                    return "medium";

                case LARGE:
                    return "large";

                case EXTRALARGE:
                    return "extra large";

                default:
                    return null;
            }
        }

        public static void main(String[] arrStrings) {

            // call the method getSize()
            // using the object MEDIUM
            System.out.println("The size of Pizza I get is " + Size.MEDIUM.getSize());

            // call the method getSize()
            // using the object EXTRALARGE
            System.out.println("The size of Pizza I want is " + Size.EXTRALARGE.getSize());
        }

    }
}