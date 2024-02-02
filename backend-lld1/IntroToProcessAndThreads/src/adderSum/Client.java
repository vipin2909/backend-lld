package adderSum;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Adder adder = new Adder(num1, num2);
        Thread t = new Thread(adder);
        t.start();
    }
}
