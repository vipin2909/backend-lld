import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            TableCreator creator = new TableCreator(i);
            ScalerThread t1 = new ScalerThread(creator);
            t1.start();
        }
    }
}
