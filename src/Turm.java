public class Turm {
    public static void main(String[] args) {
        for (int i = setStartPoint(1); lowerThan(i, 11); i=greaterNumber(i, 1)) {
            System.out.println(i);
        }

        for (int i=setStartPoint(10); greaterThan(i, 0); i=lowerNumber(i, 1)) {
            System.out.println(i);
        }
    }
    public static int greaterNumber(int i, int j) {
        return i += j;
    }

    public static int setStartPoint(int i) {
        return i;
    }

    public static boolean lowerThan(int a, int b) {
        return a < b;
    }

    public static boolean greaterThan(int a, int b) {
        return a > b;
    }

    public static int lowerNumber(int a, int b) {
        return a -= b;
    }
}
