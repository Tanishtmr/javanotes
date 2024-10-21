
import java.util.Scanner;
public class JavaScannerTest {
    public static void main(String[] args) {
        {
           // System.out.println("this is used to print console ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter anything");
            String readString = scanner.nextLine();
            System.out.println(readString);

        }
    }
}
