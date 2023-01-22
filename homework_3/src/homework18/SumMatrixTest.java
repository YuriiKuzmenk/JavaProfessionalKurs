package homework18;

/**
 * Java. Homework №18.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 16.01.2023 - 22.01.2023
 */

public class SumMatrixTest {

    public static void main(String[] args) {

        SumMatrix sumMatrix = new SumMatrix();

        int matrixSize = 4;
        String[][][] testArrays = {
                {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"} },
                {{"1", "2", "3", "4"}, {"5", "6", "abc", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"} },
                {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}},
                {{"1", "2", "3", "4"}, {"5", "6"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"} }
        };
        for (String[][] matrix : testArrays) {
            try {
                Integer sum = sumMatrix.execute(matrix, matrixSize);
                System.out.println("Sum of matrix is: " + sum);
            } catch (MyArraySizeException | MyArrayDataException e) {
                e.printStackTrace();
            }
        }
    }
}
