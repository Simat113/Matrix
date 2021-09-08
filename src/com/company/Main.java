package com.company;

public class Main {

    public static void main(String[] args) {

    }

}

class Matrix {
    int[][] matrix;
    int dimension;

    Matrix()
    {
        dimension = 1;
        matrix = new int[1][1];
        matrix[0][0] = 1;
    }

    Matrix(int[] m, int[] n)
    {
        dimension = m.length;
        matrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                matrix[i][j] = m[i];
            }
        }
    }

    Matrix(int[][] m)
    {
        dimension = m.length;
        matrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                matrix[i][j] = m[i][j];
            }
        }
    }

    Matrix(Matrix c)
    {
        dimension = c.dimension;
        matrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                matrix[i][j] = c.matrix[i][j];
            }
        }
    }

    Matrix(int dimension) //В задание такого конструктора не было, но он нужен для нижнего метода, т.к. неудобно постоянно создавать матрицу передавая в конструктор готовый двумерный массив (Ну делать матрицу сначало в коде)
    // Поэтому можно просто передать размер и заполнить нулями (Уже понял как сделать подругому в нижней функции, сначала создать массив, сложить в нем все а потом return new Matrix(этот самый массив), но думаю этот конструктор будет не лишним).
    {
        this.dimension = dimension;
        matrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                matrix[i][j] = 0;
            }
        }
    }


    public Matrix add(Matrix m)
    {
        dimension = m.dimension;
        matrix = new int[dimension][dimension];
        Matrix result = new Matrix(dimension);
        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                result.matrix[i][j] = m.matrix[i][j] + matrix[i][j];
            }
        }
        return result;
    }
    public Matrix subtract(Matrix m)
    {
        dimension = m.dimension;
        matrix = new int[dimension][dimension];
        Matrix result = new Matrix(dimension);
        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                result.matrix[i][j] = matrix[i][j] - m.matrix[i][j];
            }
        }
        return result;
    }
    public Matrix multiply(Matrix m)
    {
        dimension = m.dimension;
        matrix = new int[dimension][dimension];
        Matrix result = new Matrix(dimension);
        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                result.matrix[i][j] = matrix[i][j] * m.matrix[i][j];
            }
        }
        return result;
    }
    public Matrix divide(Matrix m)
    {
        dimension = m.dimension;
        matrix = new int[dimension][dimension];
        Matrix result = new Matrix(dimension);
        for (int i = 0; i < dimension; i++)
        {
            for (int j = 0; j < dimension; j++)
            {
                result.matrix[i][j] = matrix[i][j] / m.matrix[i][j];
            }
        }
        return result;
    }


}
