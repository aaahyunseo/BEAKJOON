import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        int res = 1;
        while (sum < n) {
            sum += 6*res;
            res++;
        }
        System.out.println(res);
    }
}