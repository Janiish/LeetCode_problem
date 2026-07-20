class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        
        // Try starting a substring from every character
        for (int i = 0; i < n; i++) {
            
            // Reset our flags for every new starting position
            boolean hasA = false;
            boolean hasE = false;
            boolean hasI = false;
            boolean hasO = false;
            boolean hasU = false;
            
            // Expand to the right
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                
                // Flip the flag for whatever vowel we find
                if (c == 'a') hasA = true;
                else if (c == 'e') hasE = true;
                else if (c == 'i') hasI = true;
                else if (c == 'o') hasO = true;
                else if (c == 'u') hasU = true;
                else {
                    // It's a consonant. Stop checking this starting point.
                    break; 
                }
                
                // If all 5 flags are true, we found a valid vowel substring!
                if (hasA && hasE && hasI && hasO && hasU) {
                    count++;
                }
            }
        }
        
        return count;
    }
}