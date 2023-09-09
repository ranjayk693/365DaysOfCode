//set matrix to zero Program function from leetcode
//link--> https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public boolean checkRepeation(int[]arr, int data)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==data)
                return false;
        }
        return true;
    }
    public void setZeroes(int[][] matrix) {
    int[] row = new int[matrix.length];
    int[] column = new int[matrix[0].length];

    // Initializing row array
    for (int i = 0; i < matrix.length; i++) {
        row[i] = -1;
    }

    // Initializing column array
    for (int i = 0; i < matrix[0].length; i++) {
        column[i] = -1;
    }

    int rowCount = 0;
    int columnCount = 0;

    // Identifying rows and columns with zeros
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                if(checkRepeation(row,i))
                    row[rowCount++] = i;  //bar-bar repeat ho raha hai
                if(checkRepeation(column,j))
                    column[columnCount++] = j;
            }
        }
    }

    // Setting rows to zero
    for (int i = 0; i < row.length; i++) {
        int temp = row[i];
        if (row[i] != -1) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[temp][j] = 0;  // This should be matrix[temp][j] = 0; instead of matrix[temp][j++] = 0;
            }
        }
    }

    // Setting columns to zero
    for (int i = 0; i < column.length; i++) {
        int temp = column[i];
        if (column[i] != -1) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][temp] = 0;  // This should be matrix[j][temp] = 0; instead of matrix[0][temp++] = 0;
            }
        }
    }
}

}