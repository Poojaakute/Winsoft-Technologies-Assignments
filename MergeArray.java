import java.util.Arrays;

public class MergeArray {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int k = m - 1;

        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }

        int i = n, j = 0, l = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[l++] = X[i++];
            } else {
                X[l++] = Y[j++];
            }
        }

        while (j < n) {
            X[l++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        System.out.println(" X[] = " + Arrays.toString(X));
    }
}
