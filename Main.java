import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 0, col = 0;

        while (true) {
            System.out.println("Enter the Row size (min 3, max 10): ");
            if (sc.hasNextInt()) {
                row = sc.nextInt();
                if (row < 3 || row > 10) {
                    System.out.println("Row size must be between 3 and 10! Please try again.");
                    continue;
                }
            } else {
                System.out.println("Invalid input! Please enter a number for row size.");
                sc.nextLine();
                continue;
            }

            System.out.println("Enter the Column size (min 3, max 10): ");
            if (sc.hasNextInt()) {
                col = sc.nextInt();
                if (col < 3 || col > 10) {
                    System.out.println("Column size must be between 3 and 10! Please try again.");
                    continue;
                }
            } else {
                System.out.println("Invalid input! Please enter a number for column size.");
                sc.nextLine();
                continue;
            }

            break;
        }

        Snake snake = new Snake(row, col);
        snake.startGame();
    }
}
