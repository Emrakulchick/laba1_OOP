//package com.laba1_OOP_JAVA;
public class Main {

    public static void main(String[] args) {
        short[][] matrix_a = {{4,1,9},{5,0,2},{7,8,3}};
        short[][] matrix_b = {{8,3,4},{7,1,5},{0,3,8}};

        Matrix_operations operation = new Matrix_operations();
            short[][] matrix_c = operation.xor(matrix_a, matrix_b);
            int summa_min_c = operation.sum(matrix_c);
        System.out.print("Результат матриці А ⊕ матриці В:");
        for(int i = 0; i < matrix_c.length; i++){
            System.out.println();
            for(int j = 0; j < matrix_c[i].length; j++){
                System.out.print(" " + matrix_c[i][j]);
            }
        }

        System.out.println("\nСумма найменших елементів кожного рядка матриці С(А ⊕ B): " + summa_min_c);
    }
}