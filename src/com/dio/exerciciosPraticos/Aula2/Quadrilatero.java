package com.dio.exerciciosPraticos.Aula2;

public class Quadrilatero {
    public static void area(double lado){
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area );
    }
    public static void area(double lado1, double lado2){
        double area = lado1 * lado2;
        System.out.println("A área do retângulo é: " + area );
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        double area = ((baseMaior + baseMenor) * altura)/2;
        System.out.println("A área do trapézio é: " + area );
    }
}
