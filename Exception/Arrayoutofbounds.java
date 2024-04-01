package Exception;

public class Arrayoutofbounds {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int value = numbers[7];
            System.out.println("Value at index 10: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
            e.printStackTrace();
        }
    }
}
