package generics;

public class Stack<T> {
    private T[] stack;

    public Stack(T[] values) {
        stack = values;
    }

    public T push(T value) {
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                stack[i] = value;
                return stack[i];
            }
        }
        return null;

    }

    public T pop() {
        for (int i = stack.length - 1; i >= 0; i--) {
            if (stack[i] != null) {
                T value = stack[i];
                stack[i] = null;
                return value;
            }
        }
        return null;
    }
}
