package Lab10;

public class Stack {
    private int stackSize;
    private char[] stackArr;
    private int top;

    public Stack(int size) {
        this.stackSize = size;
        this.stackArr = new char[stackSize];
        this.top = -1;
    }

    public void push(char item) {
        if (!isStackFull()) {
            top++;
            stackArr[top] = item;
        } else {
            System.out.println("Stack is full. Cannot push item: " + item);
        }
    }

    public char pop() {
        if (!isStackEmpty()) {
            char item = stackArr[top];
            top--;
            return item;
        } else {
            System.out.println("Stack is empty. Cannot pop item.");
            return '\0'; 
        }
    }

    public char peek() {
        if (!isStackEmpty()) {
            return stackArr[top];
        } else {
            System.out.println("Stack is empty. No item to peek.");
            return '\0'; 
        }
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
}

