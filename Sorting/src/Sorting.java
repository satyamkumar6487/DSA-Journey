public class Sorting {

        public static void main(String[] args) {

            int[] arr = {2, 4, 1, 3, 5};

            int left = 0, right = arr.length - 1;

            sortmerge(arr, left, right);

            // Sorted array print
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        static void sortmerge(int[] arr, int left, int right) {

            if (left < right) {

                int mid = (left + right) / 2;

                sortmerge(arr, left, mid);


                sortmerge(arr, mid + 1, right);

                merge(arr, left, mid, right);  // 👈 Important
            }
        }

        static void merge(int[] arr, int left, int mid, int right) {

            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] L = new int[n1];
            int[] R = new int[n2];

            for (int i = 0; i < n1; i++)
                L[i] = arr[left + i];

            for (int j = 0; j < n2; j++)
                R[j] = arr[mid + 1 + j];

            int i = 0, j = 0, k = left;

            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }
