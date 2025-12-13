import java.util.Stack;

public class RemoveAllDupString {
    void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.empty() && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        String k = "";
        while (!stack.empty()) {
            k += stack.pop();
        }
        String j = "";
        for (int i = k.length()-1; i >= 0; i--) {
            j += k.charAt(i);
        }
        return j;
    }
}
