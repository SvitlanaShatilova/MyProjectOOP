package Homework0805;

public class MatrixNew {
     int[][] matrix;
     int rows;
     int columns;

    public MatrixNew(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public static void main(String[] args) {
        MatrixNew a = new MatrixNew(5, 3);
        System.out.println(a);
    }

}
