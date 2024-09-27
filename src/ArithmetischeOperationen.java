import java.util.Random;

public class ArithmetischeOperationen {
    public static class Test {
        protected void test() {
            System.out.println("Test");
        }
    }

    public class Test2 extends Test {
        private void test2() {
            System.out.println("Test2");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("b--   = " +  (a--) );
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        ArithmetischeOperationen arithmetischeOperationen = new ArithmetischeOperationen();
        Test2 test = arithmetischeOperationen.new Test2();
        test.test();

    }



}

