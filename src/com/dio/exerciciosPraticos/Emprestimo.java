package com.dio.exerciciosPraticos;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        double valorEmprestimo = 0;
        double valorFinal = 0;
        int qtdeParcelas=0;
        double taxaJuros=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor a ser emprestado: ");
        valorEmprestimo = scan.nextDouble();
        System.out.println("Digite a quantidade de Parcelas: ");
        qtdeParcelas = scan.nextInt();

        taxaJuros = calcularTaxaParcelas(valorEmprestimo, qtdeParcelas);
        valorFinal = valorEmprestimo + (valorEmprestimo * taxaJuros/100);
        System.out.println("O empréstimo inicial foi de: " +valorEmprestimo + "\n" + "A quantidade de parcelas serão: " + qtdeParcelas +"\n" + "O valor final do empréstimo será: " +valorFinal);

    }

    public static double calcularTaxaParcelas(double valorEmprestimo, int qtdeParcelas){
        double taxaJuros;
        taxaJuros = 0.63 * qtdeParcelas;
        return taxaJuros;
    }
}
