import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {5, 3, 8, 1, 9, 2, 7, 4, 6};
        Arrays.sort(myArray, 2, 6);
        System.out.println(Arrays.toString(myArray));
    }
}
