public class Subarrays {

    public static void PrintSubarray(int numbers[]) {
        int curSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                curSum = 0;
                for (int k = start; k <= end; k++) {
                    curSum += numbers[k];
                }
                System.out.println(curSum);
                if (maxsum < curSum) {
                    maxsum = curSum;
                }

            }

        }
        System.err.println("maxsum" + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        PrintSubarray(numbers);
    }
}
