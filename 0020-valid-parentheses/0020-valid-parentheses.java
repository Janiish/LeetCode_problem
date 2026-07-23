public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isValid("()[]{}")); // Expected: true
        System.out.println(sol.isValid("([)]"));   // Expected: false
    }
}

class Solution {
    public boolean isValid(String s) {
        // Create an array the same size as the string
        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            // 1. If opening, add the EXPECTED closing bracket to our array
            if (c == '(') {
                stack[++top] = ')';
            } else if (c == '[') {
                stack[++top] = ']';
            } else if (c == '{') {
                stack[++top] = '}';
            } 
            // 2. If closing, check the "top" of our array
            else {
                // If top is -1, it means we have a closer but never had an opener
                if (top == -1 || stack[top] != c) {
                    return false;
                }
                top--; // Move the pointer down (this is like popping)
            }
        }
        
        // 3. If top is -1, it means every opener was matched and removed
        return top == -1;
    }
}