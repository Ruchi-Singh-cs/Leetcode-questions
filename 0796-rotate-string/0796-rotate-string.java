class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String duplicate = s + s;
        if(duplicate.contains(goal)) {
            return true;
        }
        else {
            return false;
        }
    }
}