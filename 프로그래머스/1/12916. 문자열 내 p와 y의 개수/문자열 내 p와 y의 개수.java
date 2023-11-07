class Solution {
    boolean solution(String s) {
        int y = 0;
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            }
            else if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p++;
            }
        }
        return y == p || (y == 0 && p == 0) ? true : false;
    }
}