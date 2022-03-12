package com.dio.exerciciosPraticos.Aula2;

public class Quadrilatero {
    public static double area(double lado){
        //double area = lado * lado;
        //System.out.println("A área do quadrado é: " + area );
        return lado * lado;
    }
    public static double area(double lado1, double lado2){
        //double area = lado1 * lado2;
       //System.out.println("A área do retângulo é: " + area );
        return lado1 * lado2;
    }
    public static double area(double baseMaior, double baseMenor, double altura){
        //double area = ((baseMaior + baseMenor) * altura)/2;
        //System.out.println("A área do trapézio é: " + area );
        return ((baseMaior + baseMenor) * altura)/2;
    }
    public static float area(float diagonal1, float diagonal2){
        //double area = (diagonal1 * diagonal2)/2;
        //System.out.println("A área do losango é: " + area );
        return (diagonal1 * diagonal2)/2;
    }
}
