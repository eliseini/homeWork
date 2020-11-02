package com.company.oop_tasks.task2;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicStampedReference;

//1) двумерный массив вещественных чисел;
//2) количество строк и столбцов в матрице.
public class Matrix {

    private int[][] elements;
    private int rows;
    private int columns;

    public Matrix(int[][] elements) {
        this.elements = elements;
        rows = elements.length;
        columns = rows;
    }

    public int[][] getElements() {
        return elements;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Matrix sum(Matrix matrix) {
        int[][] mas = new int[rows][];

        for (int i = 0; i < mas.length; i++) {
            int[] temp = new int[columns];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = matrix.getElements()[i][j] + this.getElements()[i][j];
            }
            mas[i] = temp;
        }

        return new Matrix(mas);

    }
    public Matrix proizhvedenie(Matrix matrix) {
        int[][] proizhvedenie = new int[rows][];

        for (int i = 0; i < proizhvedenie.length; i++) {
            int[] temp = new int[columns];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = matrix.getElements()[i][j] * this.getElements()[i][j];
            }
            proizhvedenie[i] = temp;
        }

        return new Matrix(proizhvedenie);
    }
    public Matrix proizhvedenieNumbers(Matrix matrix) {
        int[][] proizhvedenie = new int[rows][];
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();

        for (int i = 0; i < proizhvedenie.length; i++) {
            int[] temp = new int[columns];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = matrix.getElements()[i][j] * x;
            }
            proizhvedenie[i] = temp;
        }

        return new Matrix(proizhvedenie);
    }

    @Override
    public String toString() {
        String e = "";
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                e += elements[i][j] + " ";
            }
            e += "\n";
        }
        return "Matrix\n{" + e +"}";
    }

    }

