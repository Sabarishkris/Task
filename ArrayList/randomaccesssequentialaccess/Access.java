package arraylist.randomaccesssequentialaccess;

import java.util.ArrayList;
import java.util.Random;

public class Access {

        public static void main(String[] args) {

            int max = 1000;

            ArrayList<Integer> arraySmall = new ArrayList<>(max);
            ArrayList<Integer> arrayLarge = new ArrayList<>(max * 2);

            Random random = new Random();
            for (int i = 0; i < max; i++) {
                int randomNumber = random.nextInt(100);
                arraySmall.add(randomNumber);
                arrayLarge.add(randomNumber);
            }

            System.out.println("ArrayList with small Array :");
            performOperations(arraySmall);

            System.out.println("\nArrayList with large Array :");
            performOperations(arrayLarge);
        }

        private static void performOperations(ArrayList<Integer> arrayList) {
            long startTime = System.nanoTime();
            for (int i = 0; i < arrayList.size(); i++) {
                int element = arrayList.get(i);
            }
            long endTime = System.nanoTime();
            long randomAccessTime = endTime - startTime;
            System.out.println(" For - > Random access time: " + randomAccessTime + " nanoseconds");

            startTime = System.nanoTime();
            for (Integer element : arrayList) {
            }
            endTime = System.nanoTime();
            long sequentialAccessTime = endTime - startTime;
            System.out.println("For Each - > Sequential access time: " + sequentialAccessTime + " nanoseconds");
        }
    }

