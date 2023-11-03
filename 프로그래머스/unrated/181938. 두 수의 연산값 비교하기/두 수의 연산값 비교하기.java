class Solution {
    public int solution(int a, int b) {
        String str = String.valueOf(a) + String.valueOf(b);
        int mul = 2 * a * b;
       return (Integer.parseInt(str) >= mul ? Integer.parseInt(str) : mul);
    }
}