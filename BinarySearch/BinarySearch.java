package BinarySearch;

import java.util.Scanner;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        int[] arr = new int[50];
        System.out.println("Name: Prasish Gautam");
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        key = sc.nextInt();
        int low = 0, high = n - 1, mid;
        boolean found = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                found = true;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            } }
        if (!found) {
            System.out.println("Element not found");
        } } }
