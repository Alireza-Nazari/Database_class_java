import java.util.Scanner;

public class InpOut {
    Scanner input = new Scanner(System.in);
    public double[][] inpmatrix(int row, int col) {
        double[][] matrix = new double[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Insert coefficient for " + (i + 1) + "th row of equation:");
            for (int j = 0; j < col; j++)
                matrix[i][j] = input.nextDouble();
        }
        return matrix;
    }

    public double[] inpRhs(int row) {
        double[] rhs = new double[row];
        for (int i = 0; i < row; i++) {
            rhs[i] = input.nextDouble();
        }
        return rhs;
    }

    public double[][] mix(double[][] matrix, double[] rhs) {
        int row = matrix.length;
        int col = matrix[0].length;
        double[][] Matrix = new double[row][col + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                Matrix[i][j] = matrix[i][j];
            Matrix[i][col] = rhs[i];
        }
        return Matrix;
    }

    public void print(double[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length - 1;
        for (int i = 0; i < row; i++) {
            System.out.print("                     ");
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] > 0 && j > 0)
                    System.out.print("+" +matrix[i][j] + " X" + (j + 1) + "  ");
                else if (matrix[i][j] == 0) {
                    System.out.print("         ");
                } else
                    System.out.print(matrix[i][j] + " X" + (j + 1) + "  ");

            }
            System.out.println("  =  " + matrix[i][col]);
        }
        System.out.println("\n");
    }
    public void printfinal(double[][] matrix) {
        System.out.print("                     ");
        System.out.println("This is final advantage:\n");
        int row = matrix.length;
        int col = matrix[0].length ;
        for (int i = 0; i < row; i++) {
            System.out.print("                     ");
            for (int j = 0; j < col; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();

        }
        System.out.println("\n");
    }
}