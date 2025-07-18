import java.util.*;


class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) != b.charAt(n)) {
                return Character.compare(a.charAt(n),b.charAt(n));
            } else {
                return a.compareTo(b);
            }
        });
        return strings;
    }
}