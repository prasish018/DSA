package merge_sort;
public class mergesort {
    static void merge(int[] a, int l, int m, int r) {
        int[] temp = new int[a.length];
        int i = l, j = m + 1, k = l;
        while (i <= m && j <= r) {
            if (a[i] <= a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];  }
        while (i <= m)
            temp[k++] = a[i++];
        while (j <= r)
            temp[k++] = a[j++];
        for (i = l; i <= r; i++)
            a[i] = temp[i];  }
    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);  } }
    public static void main(String[] args) {
        int[] a = {38, 27, 43, 3, 9};
        mergeSort(a, 0, a.length - 1);
        System.out.print("Name: Prasish Gautam\n");
        System.out.print("Original array:\n38 27 43 3 9\n");
        System.out.println("Sorted array:");
        for (int i : a)
            System.out.print(i + " ");
    }}