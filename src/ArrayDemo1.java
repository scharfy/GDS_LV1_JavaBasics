import java.util.Arrays;

public class ArrayDemo1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];

        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 5;

        array2[0] = 7;
        array2[1] = 1;
        array2[2] = 3;
        System.out.println(ANSI_PURPLE);

        for (int i = 0; i < array1.length; i++) {
            if (i == Arrays.stream(array1).count() - 1) {
                System.out.print(array1[i] + array2[i]);
                break;
            }
            System.out.print(array1[i] + array2[i] + ", ");
        }
        System.out.println(ANSI_RESET);
        System.out.printf(ANSI_YELLOW);
        for(int i = 0; i < array1.length; i++) {
            if (i == Arrays.stream(array1).count() - 1) {
                System.out.print(array1[i] * array2[i]);
                break;
            }
            System.out.print(array1[i] * array2[i] + ", ");
        }
        System.out.printf("\n");

        int[] array3 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array3.length; i++) {
            sum += array3[i];
        }

        System.out.println(sum);
    }
}
