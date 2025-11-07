package print_num_from_array;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        System.out.println("Name: Prasish Gautam");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        sc.close();
    }
}
