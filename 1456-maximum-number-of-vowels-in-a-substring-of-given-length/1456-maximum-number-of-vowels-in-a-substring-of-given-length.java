class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        for(int i=0; i<k; i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }
        int max_count = count;

        for(int i=k; i<s.length(); i++) {
            if(isVowel(s.charAt(i-k))) {
                count--;
            }

            if(isVowel(s.charAt(i))) {
                count++;
            }

            max_count = Math.max(max_count,count);
        }
        return max_count;
    }
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}