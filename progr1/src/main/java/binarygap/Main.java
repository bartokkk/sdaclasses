package binarygap;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxZeroSequence(12345));

    }

    public static int maxZeroSequence(int N) {
        String binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);
        int max = 0;
        int current = 0;
        boolean q = false;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                q = true;
            }
        }



        }

    }

}
