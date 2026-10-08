class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Traverse both strings from right to left as long as there are digits or a carry
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char '0' or '1' to int
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // sum % 2 gives the current bit (0 or 1)
            result.append(sum % 2);

            // sum / 2 gives the carry to the next position (0 or 1)
            carry = sum / 2;
        }

        // The bits were appended in reverse order (least significant first)
        return result.reverse().toString();
    }
}