package com.maxdrob.company.Lesson5;

public class Vector {

    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].length());
        System.out.println(vectors[0].scalarProduct(vectors[1]));
        System.out.println(vectors[0].crossProduct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }
    // конструктор
    private double x;
    private double y;
    private double z;

    // Параметры вектора
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // кв.корень через math.sqrt()
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // скалярное произведение
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // векторное произведение
    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    // косинус между векторами
    public double cos(Vector vector) {

        return scalarProduct(vector) / (length() * vector.length());
    }
    // Сумма векторов
    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }
    // Разность векторов
    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }
    // статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N
    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
