import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Snake {

    char[][] board;
    Queue<Node> queue = new LinkedList<>();
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    int currentRow, currentCol;

    Snake(int row, int col) {
        board = new char[row][col];
        currentRow = 0;
        currentCol = 0;
        queue.offer(new Node(currentRow, currentCol));
        for (char[] i : board) {
            Arrays.fill(i, '.');
        }
        board[currentRow][currentCol] = 'X';
        generateFood();
    }

    void startGame() {
        while (true) {
            printBoard();
            System.out.println("\nEnter the Direction (W = Up, S = Down, A = Left, D = Right): ");
            char direction = sc.next().toUpperCase().charAt(0);

            if (direction == 'W') {
                move(currentRow - 1, currentCol);
            } else if (direction == 'S') {
                move(currentRow + 1, currentCol);
            } else if (direction == 'A') {
                move(currentRow, currentCol - 1);
            } else if (direction == 'D') {
                move(currentRow, currentCol + 1);
            } else {
                System.out.println("Invalid input! Please enter W, A, S, or D.");
            }
        }
    }

    void move(int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == 'X') {
            System.out.println("\nGame Over! You hit the wall or yourself.");
            System.exit(0);
        }

        queue.offer(new Node(row, col));

        if (board[row][col] != '0') {
            Node node = queue.poll();
            board[node.getRow()][node.getCol()] = '.';
        }

        if (board[row][col] == '0') {
            generateFood();
        }

        board[row][col] = 'X';
        currentRow = row;
        currentCol = col;
    }

    void generateFood() {
        int row = r.nextInt(board.length);
        int col = r.nextInt(board[0].length);
        while (board[row][col] == 'X') {
            row = r.nextInt(board.length);
            col = r.nextInt(board[0].length);
        }
        board[row][col] = '0';
    }

    void printBoard() {
        System.out.println("\nCurrent Game Board:");
        System.out.println("---------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
}

class Node {
    private int row, col;

    Node(int row, int col) {
        this.row = row;
        this.col = col;
    }

    int getRow() {
        return row;
    }

    int getCol() {
        return col;
    }
}