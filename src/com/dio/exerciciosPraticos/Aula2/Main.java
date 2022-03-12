package com.dio.exerciciosPraticos.Aula2;

public class Main {
    public static void main(String[] args) {
        double areaQuadrado;
        double areaRetangulo;
        double areaTrapezio;
        double areaLosango;
        //Sobrecarga de Metodos Quadrilatero
        areaQuadrado = Quadrilatero.area(2);
        System.out.println("A área do quadrado é: " + areaQuadrado );
        areaRetangulo = Quadrilatero.area(2,    3);
        System.out.println("A área do retângulo é: " + areaRetangulo );
        areaTrapezio = Quadrilatero.area(2,3,4);
        System.out.println("A área do trapézio é: " + areaTrapezio );
        areaLosango = Quadrilatero.area(2f,    3f);
        System.out.println("A área do losango é: " + areaLosango );
    }
}
