class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder result = new StringBuilder(""); 
        Stack<Character> charStack = new Stack<>();
        for(int i = 0; i < k; i++ ) {
            charStack.push(s.charAt(i));
        }
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        for (int i = k; i < s.length(); i++) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
} 











   
