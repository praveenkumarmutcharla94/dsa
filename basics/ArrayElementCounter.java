package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.exit;

public class ArrayElementCounter {

    public static void main(String[] args) {

        List list =  Arrays.asList(1,2,3,5,5);
        System.out.println(solve(list));


    }

    public static int solve(List<Integer> A) {
        // Approach: step 1: Find max element step2: find frequency of max element Step3: compute size of list - count(Maxof list)
        int ans = 0, freqOfEleNotHavingGreatestElement = 1;
        int maxEle = Integer.MIN_VALUE;
        int listSize = A.size();

        for(int i= 0; i<listSize; i++) {

            if (maxEle == A.get(i)) {
                freqOfEleNotHavingGreatestElement++;
            }

            if (maxEle<A.get(i)) {
                maxEle = A.get(i);
                freqOfEleNotHavingGreatestElement = 1;
            }

        }
        return listSize - freqOfEleNotHavingGreatestElement;
    }
}
