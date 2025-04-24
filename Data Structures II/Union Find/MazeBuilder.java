import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MazeBuilder {
    private int height;
    private int width;
    private MyDisjSets disjointSets;
    private List<Wall> walls;

    // Constructor to initialize the maze dimensions and walls
    public MazeBuilder(int height, int width) {
        this.height = height;
        this.width = width;
        this.disjointSets = new MyDisjSets(height * width);
        this.walls = new ArrayList<>();

        // Initialize walls between cells
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                int cell = row * width + col;
                if (col < width - 1) {
                    walls.add(new Wall(cell, cell + 1)); // Right wall
                }
                if (row < height - 1) {
                    walls.add(new Wall(cell, cell + width)); // Bottom wall
                }
            }
        }
    }

    // Method to generate the maze using disjoint sets
    public void generateMaze() {
        Collections.shuffle(walls, new Random()); // Shuffle walls randomly

        for (Wall wall : walls) {
            int set1 = disjointSets.find(wall.cell1);
            int set2 = disjointSets.find(wall.cell2);

            // If cells are in different sets, remove the wall and union the sets
            if (set1 != set2) {
                disjointSets.union(set1, set2);
                wall.removed = true;
            }
        }
    }

    // Method to write the generated maze to a file
    public void writeMazeToFile(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int row = 0; row < height; row++) {
                // Write top walls
                for (int col = 0; col < width; col++) {
                    writer.write("+");
                    // Ensure entrance at the top-left corner
                    writer.write((row == 0 && col == 0) || isWallRemoved(row - 1, col, row, col) ? "   " : "---");
                }
                writer.write("+\n");

                // Write side walls and cells
                for (int col = 0; col < width; col++) {
                    // Ensure exit at the bottom-right corner
                    writer.write((row == height - 1 && col == width - 1) || isWallRemoved(row, col - 1, row, col) ? " " : "|");
                    writer.write("   ");
                }
                writer.write("|\n");
            }

            // Write bottom walls
            for (int col = 0; col < width; col++) {
                writer.write("+---");
            }
            writer.write("+\n");
        }
    }

    // Helper method to check if a wall between two cells is removed
    private boolean isWallRemoved(int row1, int col1, int row2, int col2) {
        int cell1 = row1 * width + col1;
        int cell2 = row2 * width + col2;
        for (Wall wall : walls) {
            if ((wall.cell1 == cell1 && wall.cell2 == cell2) || (wall.cell1 == cell2 && wall.cell2 == cell1)) {
                return wall.removed;
            }
        }
        return false;
    }

    // Inner class to represent a wall between two cells
    private static class Wall {
        int cell1;
        int cell2;
        boolean removed;

        Wall(int cell1, int cell2) {
            this.cell1 = cell1;
            this.cell2 = cell2;
            this.removed = false;
        }
    }

    // Main method to handle command-line arguments and generate the maze
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java MazeBuilder <height> <width> <output file>");
            System.exit(1);
        }

        int height, width;
        String outputFile;

        try {
            height = Integer.parseInt(args[0]);
            width = Integer.parseInt(args[1]);
            outputFile = args[2];

            if (height <= 0 || width <= 0) {
                throw new IllegalArgumentException("Maze dimensions must be greater than 0.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
            System.exit(1);
            return;
        }

        MazeBuilder mazeBuilder = new MazeBuilder(height, width);
        mazeBuilder.generateMaze();

        try {
            mazeBuilder.writeMazeToFile(outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            System.exit(1);
        }
    }
}
