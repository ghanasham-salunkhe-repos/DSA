package methodsInJava;

public class TowerOfHanoiVisualization {

    public static void visualizeTower(int[] source, int[] auxiliary, int[] destination) {
        System.out.println("Source   Auxiliary   Destination");
        for (int i = 0; i < source.length; i++) {
            System.out.printf("%-8s %-10s %-10s\n",
                    source[i] == 0 ? " " : "|".repeat(source[i]),
                    auxiliary[i] == 0 ? " " : "|".repeat(auxiliary[i]),
                    destination[i] == 0 ? " " : "|".repeat(destination[i]));
        }
    }

    public static void main(String[] args) {
        // Example setup: 3 disks on the source rod
        int[] source = {1, 2, 3}; // Disks in ascending order
        int[] auxiliary = {0, 0, 0}; // Empty auxiliary rod
        int[] destination = {0, 0, 0}; // Empty destination rod

        visualizeTower(source, auxiliary, destination);
    }
}