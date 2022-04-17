import java.util.Stack;

class Stack1 {
    int capacity;
    int[] a;
    int top;

    Stack1(int size) {
        a = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            System.out.println("inserting" + x);
            a[++top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
        }
        return a[top--];

    }

    private boolean isEmpty() {
        return false;
    }

    void peek() {
        if (top == -1) {
            System.out.println("Empty");
        } else {
            System.out.println(a[top]);
        }
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(a[i]);
        }
    }
}

public class StackDriver {
    public static void main(String[] args) {
        Stack1 stack = new Stack1(0);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.printStack();
    }
}
