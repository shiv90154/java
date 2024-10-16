
public class second {

    public static int LinerSearch(int number[], int key) {
        for (int i = 0; i <= number.length; i++) {
            if (number[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 11, 13 };
        int key = 10;
        int index = LinerSearch(number, key);

        if (index == -1) {
            System.out.println("Not found");

        } else {
            System.out.println("key is at index :" + index);
        }
    }
}
