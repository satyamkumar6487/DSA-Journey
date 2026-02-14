package Arrays;

public class SmallPositiveNumber {


    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        System.out.println(minimumpositive(arr));

    }

    static int minimumpositive(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {


            while (arr[i] > 0 && arr[i] < n
                    && arr[i] != arr[arr[i] - 1]) {


                int currentindex = arr[i] - 1;


                int temp = arr[i];
                arr[i] = arr[currentindex];
                arr[currentindex] = temp;

            }

        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }


        return n + 1;
    }
}