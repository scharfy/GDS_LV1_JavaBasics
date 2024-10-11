package generics;

public class StackDemoApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(new String[5]);
        System.out.println("Push "+stack.push("Niklas"));
        System.out.println("Push "+stack.push("Mario"));
        System.out.println("Push "+stack.push("Alexander"));
        System.out.println("Push "+stack.push("Tamara"));
        System.out.println("Push "+stack.push("Gustav"));
        System.out.println("Push "+stack.push("Gustav"));
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
    }
}
