package basics;

import java.util.ArrayList;

public class SwapInRangeInclusive {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {

        int i = B;
        int j = C;

        while(i<j) {
            swap(A, i, j);
            i++;
            j--;
        }
        return A;

    }
    public ArrayList<Integer> swap(ArrayList<Integer> A, int i, int j) {
        int TEMP_VAR = A.get(i);
        A.set(i,A.get(j));
        A.set(j,TEMP_VAR);
        return A;
    }
}
