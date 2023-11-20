import java.util.Scanner;

public class TextPacMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gridSize = 5;
        char[][] grid = new char[gridSize][gridSize];
        int pacManX = 0;
        int pacManY = 0;

        initializeGrid(grid);

        while (true) {
            printGrid(grid);

            System.out.print("Enter move (W/A/S/D): ");
            char move = scanner.next().toUpperCase().charAt(0);

            if (move == 'W' && pacManX > 0) {
                grid[pacManX][pacManY] = '.';
                pacManX--;
            } else if (move == 'A' && pacManY > 0) {
                grid[pacManX][pacManY] = '.';
                pacManY--;
            } else if (move == 'S' && pacManX < gridSize - 1) {
                grid[pacManX][pacManY] = '.';
                pacManX++;
            } else if (move == 'D' && pacManY < gridSize - 1) {
                grid[pacManX][pacManY] = '.';
                pacManY++;
            }

            grid[pacManX][pacManY] = 'P';
        }
    }

    private static void initializeGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '.';
            }
        }

        grid[0][0] = 'P'; // Initial position of Pac-Man
    }

    private static void printGrid(char[][] grid) {
        System.out.println();
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
