package permcheck;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] A = {4, 2, 3};

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int max =0;
        for (int i = 0; i < A.length ; i++) {
            if(max < A[i]){
                max = A[i];
                if(max > A.length){
                    return 0;
                }
            }
        }
        HashSet<Integer> integerSet = new HashSet<Integer>();
        for (int i = 0; i < A.length ; i++) {
            integerSet.add(A[i]);
        }
        if(integerSet.size() < A.length){
            return 0;
        } else {
            return 1;
        }

    }
}

