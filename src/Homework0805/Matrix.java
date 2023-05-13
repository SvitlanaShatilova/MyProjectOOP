package Homework0805;
/*Створити клас "Матриця".
Клас повинен мати такі змінні:
1. двовимірний масив речових чисел;
2. кількість рядків та стовпців у матриці.
Клас повинен мати такі методи:
1. додавання двовимірного масиву до двовимірного масиву;
2. множення двовимірного масиву на число;
3. виведення на друк обʼєкту Матриця;
4. виведення на друк двовимірного масив після операцій над ним;
5. множення двовимірного масиву на двовимірний масив.*/
public class Matrix {
    int[][] array;
    int line;
    int colum;

    public Matrix() {
    }

    static int[][] addingArr(int[][] arr1, int[][] arr2, int[][] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }

    static int[][] multiNum(int[][] arr1, int num, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j] = arr1[i][j] * num;
            }
        }
        return arr2;
    }

    static int[][] multiArr(int[][] arr1, int[][] arr2, int[][] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        Matrix myMatrix = new Matrix();
        myMatrix.line = 3;
        myMatrix.colum = 3;
        System.out.println("рядки = " + myMatrix.line + " стовпці = " + myMatrix.colum);

        myMatrix.array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix myMatrix2 = new Matrix();
        myMatrix2.array = new int[][]{
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        Matrix myMatrix3 = new Matrix();
        myMatrix3.array = new int[3][3];
        System.out.println("Множення масивів myMatrix.array та myMatrix2.array: ");
        myMatrix3.array = multiArr(myMatrix.array, myMatrix2.array, myMatrix3.array);

        for (int i = 0; i < myMatrix3.array.length; i++) {
            for (int j = 0; j < myMatrix3.array.length; j++) {
                System.out.print(" " + myMatrix3.array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Множення масиву myMatrix3.array на число 10: ");
        myMatrix3.array = multiNum(myMatrix3.array, 10, myMatrix3.array);
        for (int i = 0; i < myMatrix3.array.length; i++) {
            for (int j = 0; j < myMatrix3.array.length; j++) {
                System.out.print(" " + myMatrix3.array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Додавання масивів myMatrix.array та myMatrix2.array: ");
        myMatrix3.array = addingArr(myMatrix.array, myMatrix2.array, myMatrix3.array);
        for (int i = 0; i < myMatrix3.array.length; i++) {
            for (int j = 0; j < myMatrix3.array.length; j++) {
                System.out.print(" " + myMatrix3.array[i][j]);
            }
            System.out.println();
        }
    }
}
