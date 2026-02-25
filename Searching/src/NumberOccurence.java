public class  NumberOccurence{

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;

        int first = firstOccurrence(arr, target);

        if (first == -1) {
            System.out.println("Not Found");
            return;
        }

        int last = lastOccurrence(arr, target);

        int frequency = last - first + 1;

        System.out.println("Frequency = " + frequency);
    }

    static int firstOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;   // move left
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;   // move right
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}