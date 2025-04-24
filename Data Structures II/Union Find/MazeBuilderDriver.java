import java.io.IOException;

public class MazeBuilderDriver {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java MazeBuilderDriver <height> <width> <output file>");
            System.exit(1);
        }

        int height, width;
        String outputFile;

        try {
            // Assign values to height, width, and output file from command-line arguments
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
