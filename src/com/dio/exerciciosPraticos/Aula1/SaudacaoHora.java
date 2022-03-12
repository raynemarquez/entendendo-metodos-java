package com.dio.exerciciosPraticos.Aula1;

import java.util.Scanner;

public class SaudacaoHora {
    public static void main(String[] args) {
        int hora;
        System.out.println("Digite que horas são: (somente a hora) ");
        Scanner scan = new Scanner(System.in);
        hora = scan.nextInt();

        switch (hora){
            case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                mensagemBomDia();
                break;
            case 13: case 14: case 15: case 16: case 17:
                mensagemBoaTarde();
                break;
            case 18: case 19: case 20: case 21: case 22: case 23: case 0: case 1: case 2: case 3: case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida");
                break;
        }

    }

    public static void mensagemBomDia(){
        System.out.println("Bom Dia!");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde!");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa Noite!");
    }
}
