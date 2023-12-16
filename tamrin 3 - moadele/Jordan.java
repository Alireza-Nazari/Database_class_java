public class Jordan {


    public double[] div(double[] vector, int index) {
        double a = vector[index];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (double) Math.round(1000 * vector[i] / a);
            vector[i] = vector[i] / 1000;

        }
        return vector;
    }

    public int max(double[] vector) {
        int index = 0;
        double a = Math.abs((vector[0]));
        for (int i = 1; i < vector.length; i++) {
            if (Math.abs((vector[i])) > a) {
                a = Math.abs((vector[i]));
                index = i;
            }
        }
        return index;
    }

    public double[] vanish(double[] pilot, double[] vector, int index) {
        double a = vector[index];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (double)Math.round(1000 * (vector[i] - a * pilot[i])) ;
            vector[i]=vector[i]/ 1000;

        }
        return vector;
    }

    public double[][] swap(double[][] matrix, int first, int second) {
        for (int i = 0; i < matrix[0].length; i++) {
            double c = 0;
            c = matrix[first][i];
            matrix[first][i] = matrix[second][i];
            matrix[second][i] = c;
        }
        return matrix;
    }


}

