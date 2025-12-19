import java.util.Scanner;

class linsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key, i;
        int[] arr = new int[50];
        System.out.println("Name: Prasish Gautam");
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                return;
            }
        }
        System.out.println("Element not found");
    }
}
