public class FindEven {
    public static void main(String[] args) {
        for (int i = getCounter(); i <= getEnde(); i = setCounterOneHigher(i)) {
            if (i % 2 == 0) {
                if (i == getEnde() || i == getEnde() - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
    }

    private static int getEnde() {
        return 57;
    }

    private static int getCounter() {
        return 1;
    }

    private static int setCounterOneHigher(int i){
        return i + 1;
    }
}
