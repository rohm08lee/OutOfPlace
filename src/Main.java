import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("outofplace.in"));
        PrintWriter pw = new PrintWriter("outofplace.out");

        int N = sc.nextInt();
        int[] lineup = new int[N];
        for (int i = 0; i < N; i++) {
            lineup[i] = sc.nextInt();
        }

        int count = 0;

        int[] temp = lineup.clone();
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            if (temp[i] != lineup[i]) {
                count++;
            }
        }
        pw.println(count-1);
        pw.close();
    }
}