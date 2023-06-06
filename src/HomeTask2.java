import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HomeTask2 {
    private static boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')','(');
        brackets.put(']','[');
        brackets.put('}','{');

        Deque<Character> stack = new LinkedList<>();
        for (Character c : s.toCharArray()){
            if(brackets.containsValue(c)){
                stack.push(c);
            } else if (brackets.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
      System.out.println(isValid("(({}[()]))"));
      System.out.println(isValid("()"));
      System.out.println(isValid("()[]{}"));
      System.out.println(isValid("}][}"));
    }

}
