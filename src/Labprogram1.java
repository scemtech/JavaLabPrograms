import java.util.Random;
import java.util.Scanner;

public class Labprogram1 {

        public static void main(String[] args) {
            int n, i, j, min;
            int arr[] = new int[6000];
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Array size ");
            n = scan.nextInt();
            Random generator = new Random();
            for (i = 0; i < n; i++) {
                arr[i] = generator.nextInt(100);
            }
            System.out.println("Array before sorting is");

            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");

            }
            long startTime = System.nanoTime();
            for (i = 0; i < n - 1; i++) {
                min = i;
                for (j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        min = arr[i];
                        arr[i] = arr[j];
                        arr[j] = min;
                    }
                }
            }
            long stopTime = System.nanoTime();
            System.out.println("\nArray after sorting is:");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            long elapseTime = stopTime - startTime;
            System.out.println("\nTime taken to sort Array is " + elapseTime + "nano seconds");

    }
}

