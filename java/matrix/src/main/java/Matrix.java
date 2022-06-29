
class Matrix {

    // Attributes
    int numOfRows; // rows in matrix
    int numOfCols; // cols in matrix

    int[][] matrix; // build matrix from rows and cols

    // 9 8 7/n5 3 2/n6 6 7
    Matrix(String matrixAsString) {
        // Parse through the input string '/n' and split into an array (rows)
        String[] rows = matrixAsString.split("\n");
        numOfRows = rows.length;
        // rows[] = {"9 8 7", "5 3 2", "6 6 7"};
        // Columns: The first element in rows[] is a column
        // 9 5 6
        // 8 3 6
        // 7 2 7
        // Split "9 8 7"
        String[] columns = rows[0].split(" ");
        numOfCols = columns.length;

        // Create matrix
        matrix = new int[numOfRows][numOfCols];

        // Insert data into matrix
        for (int i = 0; i < rows.length; i++) {
            // Grab each element in rows
            // "9 8 7" will be the first row
            String[] nums = rows[i].split(" ");

            // Each num in nums will be inserted to the matrix
            // [0][0], [0][1], [0][2]
            // [1][0], [1][1], [1][2]
            // [2][0], [2][1], [2][2]
            for (int j = 0; j < nums.length; j++) {
                // Parse each string to an int
                int num = Integer.parseInt(nums[j]);
                // Assign
                matrix[i][j] = num;
            }
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        // Use rows
        int[] col = new int[numOfRows];

        for (int i = 0; i < numOfRows; i++) {
            col[i] = matrix[i][columnNumber - 1];
        }

        return col;
    }
}
