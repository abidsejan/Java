public class MatrixOperations {
    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    static int[][] add(int[][] A, int[][] B) {
        int n = A.length, m = A[0].length;
        int[][] C = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length, m = A[0].length;
        int[][] C = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length, m = B[0].length, p = B.length;
        int[][] C = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                for (int k = 0; k < p; k++)
                    C[i][j] += A[i][k] * B[k][j];
        return C;
    }

    static int[][] transpose(int[][] A) {
        int n = A.length, m = A[0].length;
        int[][] T = new int[m][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                T[j][i] = A[i][j];
        return T;
    }

    static int[][] rotate90(int[][] A) {
        int n = A.length;
        int[][] T = transpose(A);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = T[i][j];
                T[i][j] = T[i][n - j - 1];
                T[i][n - j - 1] = temp;
            }
        }
        return T;
    }

    static void boundaryTraversal(int[][] A) {
        int n = A.length, m = A[0].length;

        for (int i = 0; i < m; i++) System.out.print(A[0][i] + " ");
        for (int i = 1; i < n; i++) System.out.print(A[i][m - 1] + " ");
        for (int i = m - 2; i >= 0; i--) System.out.print(A[n - 1][i] + " ");
        for (int i = n - 2; i > 0; i--) System.out.print(A[i][0] + " ");

        System.out.println();
    }

    static int boundarySum(int[][] A) {
        int sum = 0, n = A.length, m = A[0].length;

        for (int i = 0; i < m; i++) sum += A[0][i];
        for (int i = 1; i < n; i++) sum += A[i][m - 1];
        for (int i = m - 2; i >= 0; i--) sum += A[n - 1][i];
        for (int i = n - 2; i > 0; i--) sum += A[i][0];

        return sum;
    }

    static void mainDiagonal(int[][] A) {
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i][i] + " ");
        System.out.println();
    }

    static void secondaryDiagonal(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++)
            System.out.print(A[i][n - i - 1] + " ");
        System.out.println();
    }

    static void rowSum(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[0].length; j++)
                sum += A[i][j];
            System.out.println(sum);
        }
    }

    static void columnSum(int[][] A) {
        for (int j = 0; j < A[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < A.length; i++)
                sum += A[i][j];
            System.out.println(sum);
        }
    }

    static void upperTriangle(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (j >= i) System.out.print(A[i][j] + " ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    static void lowerTriangle(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (j <= i) System.out.print(A[i][j] + " ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    static void spiral(int[][] A) {
        int top = 0, bottom = A.length - 1, left = 0, right = A[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(A[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(A[i][right] + " ");
            right--;
            if (top <= bottom)
                for (int i = right; i >= left; i--) System.out.print(A[bottom][i] + " ");
            bottom--;
            if (left <= right)
                for (int i = bottom; i >= top; i--) System.out.print(A[i][left] + " ");
            left++;
        }
        System.out.println();
    }

    static void searchSorted(int[][] A, int key) {
        int r = 0, c = A[0].length - 1;
        while (r < A.length && c >= 0) {
            if (A[r][c] == key) {
                System.out.println("Found at " + r + " " + c);
                return;
            } else if (A[r][c] > key) c--;
            else r++;
        }
        System.out.println("Not Found");
    }

    static void saddlePoint(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int minCol = 0;
            for (int j = 1; j < A[0].length; j++)
                if (A[i][j] < A[i][minCol]) minCol = j;

            boolean saddle = true;
            for (int k = 0; k < A.length; k++)
                if (A[k][minCol] > A[i][minCol]) saddle = false;

            if (saddle) {
                System.out.println("Saddle Point: " + A[i][minCol]);
                return;
            }
        }
        System.out.println("No Saddle Point");
    }
    public static void main(String[] args) {
        
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] B = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println("Matrix A");
        printMatrix(A);

        System.out.println("Matrix B");
        printMatrix(B);

        System.out.println("Addition");
        printMatrix(add(A, B));

        System.out.println("Subtraction");
        printMatrix(subtract(A, B));

        System.out.println("Multiplication");
        printMatrix(multiply(A, B));

        System.out.println("Transpose");
        printMatrix(transpose(A));

        System.out.println("Rotate 90 Degree");
        printMatrix(rotate90(A));

        System.out.println("Boundary Traversal");
        boundaryTraversal(A);

        System.out.println("Boundary Sum: " + boundarySum(A));

        System.out.println("Main Diagonal");
        mainDiagonal(A);

        System.out.println("Secondary Diagonal");
        secondaryDiagonal(A);

        System.out.println("Row Sum");
        rowSum(A);

        System.out.println("Column Sum");
        columnSum(A);

        System.out.println("Upper Triangle");
        upperTriangle(A);

        System.out.println("Lower Triangle");
        lowerTriangle(A);

        System.out.println("Spiral Traversal");
        spiral(A);

        System.out.println("Search 5 in Sorted Matrix");
        searchSorted(new int[][]{
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        }, 9);

        System.out.println("Saddle Point");
        saddlePoint(A);
    }
}