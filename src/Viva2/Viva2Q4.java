package Viva2;

public class Viva2Q4 {
    public static void main(String[] args) {

        String[] isbnList = {"123456789X", "1234567890", "0471958697"};
        boolean[] results = validateISBNList(isbnList);
        System.out.println("The validation results are:");

        for (int i = 0; i < isbnList.length; i++) {
            System.out.println(isbnList[i] + " : " + results[i]);
        }
    }

    /**
     * Validates an array of ISBN-10 numbers.
     * @param isbnList Array of ISBN-10 strings
     * @return Array of boolean values indicating if each ISBN is valid
     */

    public static boolean [] validateISBNList(String[] isbnList) {
        boolean[] results = new boolean[isbnList.length];
        for (int i = 0; i < isbnList.length; i++) {
            results[i] = isValidISBN(isbnList[i]);
        }
        return results; }

    /**
     * Checks if an ISBN-10 number is valid.
     *
     * @param isbn ISBN-10 number as a string
     * @return true if the ISBN is valid, false otherwise
     */

    public static boolean isValidISBN(String isbn) {
        // Check if the ISBN has exactly 10 characters
        if (isbn.length() != 10) {
            return false; // ISBN must be 10 characters
        }

        int sum = 0;
        // Validate the first 9 characters
        for (int i = 0; i < 9; i++) {
            char c = isbn.charAt(i);
            int digit = Character.getNumericValue(c); // Get numeric value
            if (digit < 0 || digit > 9) { // Check if it's not a valid digit
                return false;
            }
            sum += digit * (i + 1); // Weighted sum
        }

        // Validate the last character
        char lastChar = isbn.charAt(9);
        int checkDigit;
        if (lastChar == 'X') {
            checkDigit = 10;
        } else {
            checkDigit = Character.getNumericValue(lastChar); // Get numeric value
            if (checkDigit < 0 || checkDigit > 9) {
                return false; // Not a valid digit
            }
        }

        // Check if the calculated check digit matches
        return sum % 11 == checkDigit;

    }
}
