import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InpOut inpOut = new InpOut();
        Solver solver = new Solver();
        Scanner scanner =new Scanner(System.in);
        System.out.println("pleas enter number of Rows:");
        int row=scanner.nextInt();
        System.out.println("pleas enter number of Columns:");
        int col=scanner.nextInt();

        System.out.println("Please insert   Coefficients  of the System:\n");
        double[][] matrix = inpOut.inpmatrix(row ,col);

        System.out.println("Please insert  Right Hand Side of the System:");
        double[] rhs=inpOut.inpRhs(row);
        double[][] system=inpOut.mix(matrix,rhs);

        inpOut.print(system);
        system = solver.solve(system ,true);
        inpOut.print(system);
        inpOut.printfinal(system);

    }
}