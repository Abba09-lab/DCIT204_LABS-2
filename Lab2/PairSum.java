import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Brute force: check every pair (nested loop) - O(n^2)
        for (int i = 0; i < arr.length && !found; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\n--- Result ---");
                    System.out.println("
