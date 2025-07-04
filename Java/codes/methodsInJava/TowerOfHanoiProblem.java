package methodsInJava;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoiProblem {
    static List<Disk> source;
    public static List<Disk> auxilarly = new ArrayList<>();
    public static List<Disk> destination = new ArrayList<>();

    public static class Disk {
        public int weight;

        public Disk(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            String op = " ";
            for (int i = 0; i < weight; i++) {
                op += "|";
            }
            return op + " ";
        }
    }

    public static void towerOfHanoi(int countOfDisk, List<Disk> source, List<Disk> auxiliary, List<Disk> destination,String one,String two, String three) {

        if (countOfDisk == 1) {
            destination.add(source.remove(source.size() - 1));
            System.out.println(one+" : " + source);
            System.out.println(two+" : " + auxiliary);
            System.out.println(three+" : " + destination);
            System.out.println("--------------------------------------------");

            return;
        }

        // Move n-1 disks from source to auxiliary
        towerOfHanoi(countOfDisk - 1, source, destination, auxiliary,"Source","destination","Auxiliary");

        // Move the nth disk from source to destination
        destination.add(source.remove(source.size() - 1));
        System.out.println(one+" : " + source);
        System.out.println(two+" : " + auxiliary);
        System.out.println(three+" : " + destination);
        System.out.println("--------------------------------------------");


        // Move n-1 disks from auxiliary to destination
        towerOfHanoi(countOfDisk - 1, auxiliary, source, destination,"Auxiliary","Source","destination");
    }

    public static List<Disk> getIntialDisks(int count) {
        List<Disk> initialSource = new ArrayList<>();
        for (int i = count; i > 0; i--) {
            initialSource.add(new Disk(i));
        }
        return initialSource;
    }

    public static void main(String[] args) {
        // Initialize source with disks
        source = getIntialDisks(5);

        System.out.println("Initial State:");
        System.out.println("Source : " + source);
        System.out.println("Auxiliary : " + auxilarly);
        System.out.println("Destination : " + destination);
        System.out.println("--------------------------------------------");


        // Solve Tower of Hanoi
        towerOfHanoi(5, source, auxilarly, destination,"Source","Auxiliary","destination");
    }
}