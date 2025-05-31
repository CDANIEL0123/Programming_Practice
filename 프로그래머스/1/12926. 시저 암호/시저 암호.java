public class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // 대문자 범위 내에서 밀기 (A~Z)
                sb.append((char)((c - 'A' + n) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                // 소문자 범위 내에서 밀기 (a~z)
                sb.append((char)((c - 'a' + n) % 26 + 'a'));
            } else {
                // 공백은 그대로 유지
                sb.append(c);
            }
        }

        return sb.toString();
    }
}