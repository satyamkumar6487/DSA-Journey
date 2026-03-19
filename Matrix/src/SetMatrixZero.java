public class SetMatrixZero {

    public static void main(String[] args) {

        int[][] arr = {
                {1, -1, 1},
                {-1, 0, 1},
                {1, -1, 1}
        };

        matrixzero(arr);
    }

    static void matrixzero(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        boolean row = false;
        boolean column = false;

        // check first row
        for (int i = 0; i < m; i++) {
            if (arr[0][i] == 0) {
                row = true;
            }
        }

        // check first column
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                column = true;
            }
        }

        // mark rows and columns
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // set zeros based on marks
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // set first row to zero
        if (row) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }

        // set first column to zero
        if (column) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}