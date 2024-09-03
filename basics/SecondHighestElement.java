package basics;

import java.util.ArrayList;

public class SecondHighestElement {

    public int solve(ArrayList<Integer> A) {

        int listSize = A.size();
        int firstHighestEle = Integer.MIN_VALUE;
        int secondHighestEle = Integer.MIN_VALUE;

        for (int i = 0; i< listSize; i++) {

            int currEle = A.get(i);

            if (firstHighestEle < currEle) {
                secondHighestEle = firstHighestEle;
                firstHighestEle = currEle;
            }
            if (firstHighestEle > currEle && secondHighestEle < currEle) {
                secondHighestEle = currEle;
            }
        }
        if (secondHighestEle == Integer.MIN_VALUE) {
            return -1;
        }
        return secondHighestEle;
    }
}
