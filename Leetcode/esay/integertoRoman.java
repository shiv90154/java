public class integertoRoman {

    public static String intToRoman(int num) {
        // Define the Roman numeral symbols and their corresponding values
        String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        // StringBuilder to build the Roman numeral result
        StringBuilder result = new StringBuilder();

        // Loop through each value and append the corresponding Roman numeral symbols
        for (int i = 0; i < values.length; i++) {
            // While the current value can still be subtracted from num
            while (num >= values[i]) {

                result.append(romanSymbols[i]);
                num -= values[i];
            }
        }

        // Return the resulting Roman numeral string
        return result.toString();
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(intToRoman(3749)); // Output: MCMXCIV
        System.out.println(intToRoman(58)); // Output: LVIII
        System.out.println(intToRoman(9)); // Output: IX
        System.out.println(intToRoman(3)); // Output: III
    }
}
