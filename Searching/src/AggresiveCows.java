import java.util.Arrays;

public class AggresiveCows {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 8, 9};
        int k = 3;

        Arrays.sort(arr);

        System.out.println(aggresivecows(arr, k));
    }

    static int aggresivecows(int[] arr, int k) {

        int n = arr.length;
        int ans = -1;

        int start = 1;
        int end = arr[n - 1] - arr[0];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (ispossible(arr, n, k, mid)) {

                ans = mid;
                start = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        return ans;
    }

    private static boolean ispossible(int[] arr, int n, int cows, int midDistance) {

        int lastposition = arr[0];
        int cowcount = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] - lastposition >= midDistance) {

                cowcount++;
                lastposition = arr[i];
            }

            if (cowcount == cows) {
                return true;
            }
        }

        return false;
    }
}