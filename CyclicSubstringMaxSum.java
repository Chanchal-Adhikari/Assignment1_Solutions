import java.util.*;

public class CyclicSubstringMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        String doubled = s + s;

        Set<Character> set = new HashSet<>();
        int left = 0, sum = 0, maxSum = 0;

        for (int right = 0; right < doubled.length(); right++) {
            char c = doubled.charAt(right);

            while (set.contains(c) || (right - left + 1) > n) {
                char remove = doubled.charAt(left);
                set.remove(remove);
                sum -= (remove - 'a' + 1);
                left++;
            }

            set.add(c);
            sum += (c - 'a' + 1);
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}