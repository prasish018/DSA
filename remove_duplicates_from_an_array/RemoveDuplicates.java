package remove_duplicates_from_an_array;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Name: Prasish Gautam");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[j++] = arr[i];
            }
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}
