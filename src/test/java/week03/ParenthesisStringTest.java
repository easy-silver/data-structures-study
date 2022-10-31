package week03;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParenthesisStringTest {

    @Test
    public void test1() {
        assertEquals("NO", solution("(())())"));
        assertEquals("NO", solution("(((()())()"));
        assertEquals("YES", solution("(()())((()))"));
        assertEquals("NO", solution("((()()(()))(((())))()"));
        assertEquals("YES", solution("()()()()(()()())()"));
        assertEquals("NO", solution("(()((())()("));
    }

    private String solution(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}