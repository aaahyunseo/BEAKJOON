import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int min = 101;

        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0) {
                sum += n;
                if (min > n) min = n;
            }
        }

        if (sum == 0) System.out.println(-1);
        else System.out.println(sum + "\n" + min);
    }
}