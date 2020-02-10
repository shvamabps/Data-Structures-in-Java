package stack;

/**
 * Stack
 */
public class Stack {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
            System.out.println("Elements in the stack are : ");

        }

    }

    public int pop() {

        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            System.out.println("Element popped is : " + data);
        }
        return data;
    }

    public int peek() {
        int data;
        data = stack[top - 1];
        return data;
    }

    public int size() {

        System.out.println("Size is: " + top);
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}