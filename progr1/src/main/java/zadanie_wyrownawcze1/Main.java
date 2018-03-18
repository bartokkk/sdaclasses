package zadanie_wyrownawcze1;

public class Main {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3, 2, 1, 4, 7, 6, 4, 1, 1,11};
        System.out.println(solution(A));
    }

    public static boolean solution(int[] A){
        int sum = A[0] + A[A.length - 1];
        boolean bool = false;
        for (int i = 1; i < A.length - 1 ; i++) {
            if(A[i] == sum){
                bool = true;
            }
        }
        return bool;
    }

}

