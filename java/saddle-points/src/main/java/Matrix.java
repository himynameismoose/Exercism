import java.util.*;

class Matrix {

    private List<List<Integer>> values;

    Matrix(List<List<Integer>> values) {
        this.values = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> result = new HashSet<>();

        for (int row = 0; row < values.size(); row++) {
            for (int col = 0; col < values.get(0).size(); col++) {
                int value = values.get(row).get(col);
                MatrixCoordinate mc = new MatrixCoordinate(row + 1, col + 1);

                int rowCounter = 0;

                for (int i = 0; i < values.get(0).size(); i++) {
                    MatrixCoordinate colMC = new MatrixCoordinate(row + 1, i + 1);
                    int colValue = values.get(row).get(i);

                    if (value < colValue && mc.compareTo(colMC) != 0)
                        rowCounter++;

                }

                int colCounter = 0;

                for (int i = 0; i < values.size(); i++) {
                    MatrixCoordinate rowMC = new MatrixCoordinate(i + 1, col + 1);
                    int rowValue = values.get(i).get(col);

                    if (value > rowValue && mc.compareTo(rowMC) != 0)
                        colCounter++;
                }

                if (rowCounter == 0 && colCounter == 0) {
                    result.add(mc);
                }
            }
        }

        return result;
    }


}
