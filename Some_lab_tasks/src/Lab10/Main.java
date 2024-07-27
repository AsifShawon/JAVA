package Lab10;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(20);

        String exp = "(12+2)-3";
        char ch;
        int count = 0;
        boolean isBalanced = true;

        while (count < exp.length()) {
            ch = exp.charAt(count);
            count++;

            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isStackEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced && st.isStackEmpty()) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}

