public class LongSubstring {
    public static void main(String[] args) {
        String str = "abcabcaa";
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int[] charIndex = new int[128]; 

        while (end < str.length()) {
            char currentChar = str.charAt(end);
            if (charIndex[currentChar] > start) {
                start = charIndex[currentChar];
            }
            charIndex[currentChar] = end + 1;
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }

        System.out.println("Longest substring: " + maxLength);
    }
}