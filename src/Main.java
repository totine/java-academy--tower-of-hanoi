import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int levels = -1;
        while (levels <0 || levels > 10) {
            System.out.println("Type number of levels (between 1 and 10): ");
            while (!in.hasNextInt()) {
                System.out.println("Type number of levels (between 1 and 10): ");
                in.next();
            }
            levels = in.nextInt();
        }

        Hanoi.run(levels);
    }
}
