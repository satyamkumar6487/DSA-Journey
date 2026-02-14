package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Max {

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};

        ArrayList<Integer> result = findmajority(arr);

        System.out.println(result);
    }

    static ArrayList<Integer> findmajority(int[] arr) {

        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 = 0;

        // 1 Candidate selection
        for (int num : arr) {

            if (num == cand1)
                count1++;

            else if (num == cand2)
                count2++;

            else if (count1 == 0) {
                cand1 = num;
                count1 = 1;

            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;

            } else {
                count1--;
                count2--;
            }
        }

        // 2Verification
        count1 = 0;
        count2 = 0;

        for (int num : arr) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        // 3⃣ Result
        ArrayList<Integer> res = new ArrayList<>();

        if (count1 > arr.length / 3)
            res.add(cand1);
        if (count2 > arr.length / 3)
            res.add(cand2);

        Collections.sort(res);
        return res;
    }
}
