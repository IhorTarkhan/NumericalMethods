package org.example.sandbox;

public class Matrix {
    private final double[][] value;

    public Matrix(double[][] value) {
        this.value = value;
    }

    public double[][] getValue() {
        return value;
    }

    public double[][] getTranspose() {
        double[][] transpose = new double[value.length][value[0].length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                transpose[i][j] = value[j][i];
            }
        }
        return transpose;
    }

    public Matrix multiplyBy(double[][] secondMatrix) {
        double[][] result = new double[value.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(value, secondMatrix, row, col);
            }
        }

        return new Matrix(result);
    }

    public Matrix multiplyBy(Matrix secondMatrix) {
        return multiplyBy(secondMatrix.getValue());
    }

    private double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }
}
