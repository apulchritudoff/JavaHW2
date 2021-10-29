import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        powerArray(4, 2);

    }

    public static void powerArray(int size, int power) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(i, power);
        }
        System.out.println(Arrays.toString(array));
    }
}
