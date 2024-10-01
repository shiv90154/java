public class palindrome {
    public static boolean isPalindrome(int x) {
        // A negative number cannot be a palindrome
        if (x < 0) {
            return false;
        }

        // Store the original number
        int original = x;
        int reversed = 0;

        // Reverse the integer
        while (x != 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x = x / 10;
        }

        // Compare the original number with the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(10)); // false
    }
}
