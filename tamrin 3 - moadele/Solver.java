public class Solver {
    Jordan jordan = new Jordan();
    InpOut inpOut = new InpOut();
    double eps = .00001;

    public double[][] solve(double[][] system, boolean present) {
        int row = system.length;
        int col = system[0].length - 1;
        double[] vec = new double[row];
        double[] pilot, vanish;
        int row_p = 0, col_p = 0;
        while (row_p < row && col_p < col) {
            for (int ic = row_p; ic < row; ic++)
                vec[ic] = system[ic][col_p];

            int index = jordan.max(vec);
            if (Math.abs(vec[index]) > eps) {
                if (index != row_p)
                    jordan.swap(system, index, row_p);
                vec[row_p] = 0;
                if (present)
                    inpOut.print(system);
                pilot = jordan.div(system[row_p], col_p);
                for (int j = 0; j <= col; j++)
                    system[row_p][j] = pilot[j];
                if (present)
                    inpOut.print(system);
                for (int i = 0; i < row; i++) {
                    if (i != row_p) {
                        vanish = jordan.vanish(pilot, system[i], col_p);
                        for (int j = 0; j <= col; j++)
                            system[i][j] = vanish[j];
                        if (present)
                            inpOut.print(system);
                    }
                }
                row_p += 1;
            }

            col_p += 1;

        }
        return system;
    }
}
