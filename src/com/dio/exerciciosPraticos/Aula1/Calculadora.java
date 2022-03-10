package com.dio.exerciciosPraticos;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        double valor1, valor2;
        String operacao;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        valor1 = scan.nextDouble();
        System.out.println("Digite o segundo valor");
        valor2 = scan.nextDouble();

        System.out.println("Escolha a operação desejada ( + - * / )");
        operacao = scan.next();

        switch (operacao){
            case "+":
                somar(valor1, valor2);
                break;
            case "-":
                subtrair(valor1, valor2);
                break;
            case "*":
                multiplicar(valor1, valor2);
                break;
            case "/":
                dividir(valor1, valor2);
                break;
            default:
                System.out.println("Informe valores válidos");
                break;
        }
    }

    public static void somar(double valor1, double valor2){

        double resultado = valor1 + valor2;
        System.out.println("O resultado da operação de " + valor1 + " + " + valor2 + " é  = " + resultado);
    }

    public static void subtrair(double valor1, double valor2){
        double resultado = valor1 - valor2;
        System.out.println("O resultado da operação de " + valor1 + " - " + valor2 + " é  = " + resultado);
    }
    public static void multiplicar(double valor1, double valor2){
        double resultado = valor1 * valor2;
        System.out.println("O resultado da operação de " + valor1 + " * " + valor2 + " é  = " + resultado);
    }
    public static void dividir(double valor1, double valor2){
        if (valor2 == 0 ){
            System.out.println("Impossivel dividir por 0");
        }
        else {
            double resultado = valor1 / valor2;
            System.out.println("O resultado da operação de " + valor1 + " / " + valor2 + " é  = " + resultado);
        }
    }

}
