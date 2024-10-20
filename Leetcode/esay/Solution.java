// 1106
public class Solution {

    public boolean parseBoolExpr(String expression) {
        // Call the recursive function to evaluate the expression
        return evaluate(expression, 0, expression.length() - 1);
    }

    private boolean evaluate(String expression, int start, int end) {
        char op = expression.charAt(start); // Operator at the start
        if (op == 't')
            return true; // If it's 't', return true
        if (op == 'f')
            return false; // If it's 'f', return false

        if (op == '!') {
            // Evaluate NOT expression
            return !evaluate(expression, start + 2, end - 1);
        }

        if (op == '&') {
            // AND operation: return true if all sub-expressions evaluate to true
            boolean result = true;
            int i = start + 2, balance = 0, subStart = i;
            while (i <= end) {
                if (expression.charAt(i) == '(')
                    balance++;
                if (expression.charAt(i) == ')')
                    balance--;

                if (balance == 0 && (expression.charAt(i) == ',' || i == end - 1)) {
                    result &= evaluate(expression, subStart, i);
                    subStart = i + 1; // move to next sub-expression
                }
                i++;
            }
            return result;
        }

        if (op == '|') {
            // OR operation: return true if at least one sub-expression evaluates to true
            boolean result = false;
            int i = start + 2, balance = 0, subStart = i;
            while (i <= end) {
                if (expression.charAt(i) == '(')
                    balance++;
                if (expression.charAt(i) == ')')
                    balance--;

                if (balance == 0 && (expression.charAt(i) == ',' || i == end - 1)) {
                    result |= evaluate(expression, subStart, i);
                    subStart = i + 1; // move to next sub-expression
                }
                i++;
            }
            return result;
        }

        return false; // Default case, should never hit this point if input is valid.
    }

    public static void main(String[] args) {
        Solution parser = new Solution();

        // Test case provided
        System.out.println(parser.parseBoolExpr("!(&(!(&(f)),&(t),|(f,f,t)))")); // Expected output: false
    }
}
