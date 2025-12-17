import java.util.Stack;

public class ReversePolishEval {
    void main(String args[]) {
        String[] test = new String[]{"10","6","9","3","+","*","/"};
        System.out.println(evalRP(test));
    }

    public int evalRP(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (parseRP(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b); // truncates toward zero
                }
            }
        }

        return stack.pop();
    }

    public Boolean parseRP(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
