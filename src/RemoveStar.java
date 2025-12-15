import java.util.Stack;

public class RemoveStar {
    void main(String[] args) {

    }

    public String removeStar(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.add(s.charAt(i));
            }
            if (s.charAt(i) == '*') {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
