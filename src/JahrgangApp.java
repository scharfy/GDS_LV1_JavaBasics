public class JahrgangApp {
    public static void main(String[] args) {
        int student1 = 5240442;
        int student2 = 5240079;
        int student3 = 5241753;
        int student4 = 5243815;
        int student33 = 1234568;
        int student63 = 4611826;
        int student200 = 43242533;
        // Index Out of Bounds Exception
        /*
        int[] trottel = {};
        System.out.println(trottel.length);
        trottel[0] = 1;
        System.out.println(trottel.length);
         */
        int[] students = {student1, student2, student3, student4, student33, student63, student200};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
