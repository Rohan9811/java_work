
    public class Exception {
        public static void main(String[] args) {
            ArithmeticException();
            ArrayIndexOutOfBoundsException();
            NullPointerException();
            NumberFormatException();
        }

        private static void ArithmeticException() {
            try {
                int result = 5 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }
        }

        private static void ArrayIndexOutOfBoundsException() {
            try {
                int[] numbers = { 1, 2, 3 };
                int value = numbers[5];
                System.out.println("Value: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
        }

        private static void NullPointerException() {
            try {
                String text = null;
                int length = text.length();
                System.out.println("Length: " + length);
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
            }
        }

        private static void NumberFormatException() {
            try {
                String strNumber = "abc";
                int number = Integer.parseInt(strNumber);
                System.out.println("Number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            }
        }
    }
}
