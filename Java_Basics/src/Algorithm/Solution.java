package Algorithm;
import java.util.*;
class Solution {
	public String solution(String S) {
        Deque<Character> stack = new ArrayDeque<>();
        int[] count = new int[26]; // count of each character in S
        boolean[] added = new boolean[26]; // if character is already in stack

        // Count the occurrences of each character in S.
        for (int i = 0; i < S.length(); i++) {
            count[S.charAt(i) - 'A']++;
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            count[c - 'A']--; // we use one occurrence of c

            if (!added[c - 'A']) {
                // Remove characters that are lexicographically greater
                // and can be found later in the string.
                while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'A'] > 0) {
                    added[stack.pop() - 'A'] = false;
                }
                stack.push(c); // add current character to the stack
                added[c - 'A'] = true; // mark character as added
            }
        }

        // Build the result string from characters in the stack
        StringBuilder result = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            result.append(stack.removeFirst());
        }

        return result.toString();
    }


public static void main(String[] args)
{

    Solution solu=new Solution();
    System.out.println(solu.solution("CBCAAXA"));
   System.out.println(solu.solution("ZYXZYZY"));
   System.out.println(solu.solution("ABCBACDDAA"));
   System.out.println(solu.solution("AKFKFMOGKFB"));
}
}
