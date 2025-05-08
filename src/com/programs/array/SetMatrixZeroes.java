package com.programs.array;

/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
        -231 <= matrix[i][j] <= 231 - 1*/

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    boolean firstRowHasZero = false;
    boolean firstColHasZero = false;

    // Check if the first row has any zeroes
        for (int j = 0; j < n; j++) {
        if (matrix[0][j] == 0) {
            firstRowHasZero = true;
            break;
        }
    }

    // Check if the first column has any zeroes
        for (int i = 0; i < m; i++) {
        if (matrix[i][0] == 0) {
            firstColHasZero = true;
            break;
        }
    }

    // Mark rows and columns that need to be zeroed
        for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Zero the matrix based on markers in the first row and column
        for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    // Zero the first row if necessary
        if (firstRowHasZero) {
        for (int j = 0; j < n; j++) {
            matrix[0][j] = 0;
        }
    }

    // Zero the first column if necessary
        if (firstColHasZero) {
        for (int i = 0; i < m; i++) {
            matrix[i][0] = 0;
        }
    }
}

public static void main(String[] args) {
    SetMatrixZeroes solution = new SetMatrixZeroes();

    int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    solution.setZeroes(matrix1);
    // Output: [[1, 0, 1], [0, 0, 0], [1, 0, 1]]
    for (int[] row : matrix1) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    int[][] matrix2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    solution.setZeroes(matrix2);
    // Output: [[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]
    for (int[] row : matrix2) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
}

/*To solve this problem in-place with constant space, we can use the matrix itself to mark which rows and columns should be set to zero. This avoids the need for additional space beyond the matrix dimensions.

Approach:
Marking Rows and Columns:

Use the first row and first column of the matrix as markers. If a cell matrix[i][j] is 0, mark matrix[i][0] and matrix[0][j] to indicate that row i and column j need to be set to 0.
Edge Case Handling:

Since we're using the first row and first column as markers, we need to separately track whether the first row and first column themselves need to be set to 0 (if they contain any 0).
Zeroing the Matrix:

After marking the rows and columns, go through the matrix (excluding the first row and first column initially) and set the cells to 0 based on the markers.
Finally, if necessary, set the first row and first column to 0 based on the stored flags.
        Algorithm:
Traverse the matrix and use the first row and column to mark the rows and columns that need to be zeroed.
Traverse the matrix again and update the cells using the markers in the first row and column.
Handle the first row and column separately, since they are used as markers.*/
