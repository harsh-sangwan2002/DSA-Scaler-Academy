public class merge_sort {

    public static void mergeSort(int[] arr, int s, int e) {

        if (s == e)
            return;

        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    public static void merge(int[] arr, int s, int mid, int e) {

        int n1 = mid - s + 1;
        int n2 = e - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[s + i]; // Corrected index

        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j]; // Corrected index

        int i = 0, j = 0;
        int k = s; // Starting index for merged array

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 10, 3, 18, 5, 6 };

        mergeSort(arr, 0, arr.length - 1);

        for (int val : arr)
            System.out.print(val + " ");

    }
}