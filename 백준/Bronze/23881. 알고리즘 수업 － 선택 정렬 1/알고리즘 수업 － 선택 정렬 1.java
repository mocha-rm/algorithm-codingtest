import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr, k);
    }

    public static void selectionSort(int[] arr, int k) {
        int cnt = 0;

        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
                cnt++;

                if (cnt == k) {
                    System.out.print(arr[maxIndex] + " " + arr[i]);
                }
            }
        }
        if (cnt < k) {
            System.out.println(-1);
        }
    }
}
