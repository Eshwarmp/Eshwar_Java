import java.util.ArrayDeque;
import java.util.Deque;

public class BaseBall {
    public static void main(String[] args) {
        String[] operations = { "5", "2", "C", "D", "+" };
        Deque<String> stack = new ArrayDeque<>();
        int sum = 0;
        for (String s : operations) {
            if (!(s.equals("+") || s.equals("D") || s.equals("C"))) {
                stack.push(s);
            }
            else if (s.equals("C")) {
                stack.pop();
            }
            else if (s.equals("D")) {
                stack.push(String.valueOf(2 * Integer.parseInt(stack.peek())));
            }
            else if (s.equals("+")) {
                int x = Integer.parseInt(stack.pop());
                int y = Integer.parseInt(stack.pop());
                sum = x + y;
                stack.push(String.valueOf(y));
                stack.push(String.valueOf(x));
                stack.push(String.valueOf(sum));
            }
        }
        System.out.println(stack);
        int add = 0;
        for (String s : stack) {
            add += Integer.parseInt(s);
        }
        System.out.println(add);
    }
}
