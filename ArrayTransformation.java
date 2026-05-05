import java.util.*;

public class ArrayTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] A =new int[n];

        for (int i=0;i<n;i++){
            A[i] =sc.nextInt();
        }

        int K =sc.nextInt();

        for (int i=1;i<n;i++) {
            if ((A[i]-A[0])%K!=0){
                System.out.println(-1);
                return;
            }
        }

        int[] B = new int[n];
        for (int i = 0;i < n;i++){
            B[i] = (A[i] - A[0]) / K;
        }

        Arrays.sort(B);

        int median = B[n/2];

        int operations = 0;
        for(int x : B){
           operations += Math.abs(x - median);
        }

        System.out.println(operations);
    }
}
