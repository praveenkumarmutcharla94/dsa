package basics;

import java.util.ArrayList;

public class RotateArrayKTimes {


    // reverse whole array
    // reverse 0 to B-1 and B to n separately
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        int listSize = A.size();
        int i = 0, j= listSize - 1;
        // step 1: Reverse entire list
        while(i<j) {
            swap(A, i, j);
            i++;
            j--;
        }

        // step 2: reverse two sub lists 1st one [0, B] indexed range, [B+1, N] indexed range
        B = B%listSize;
        i = 0;
        j = B-1;

        while(i<j) {
            swap(A, i, j);
            i++;
            j--;
        }

        i = B;
        j = listSize - 1;

        while(i<j) {
            swap(A, i, j);
            i++;
            j--;
        }
        return A;

    }

    public ArrayList<Integer> swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
        return A;
    }
}
