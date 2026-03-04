package br.edu.ifsp.list01;

import java.util.Locale;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0  L      3 15.00
    2.0   A
    5.0   C
    7     M
*/
public class Ex06 {

    public static void main(String[] args) {

        //l
        //a
        //c
        //m
    }

    String compute(double L, double a, double c, double m) {
        String output = null;

        double t = L * a;

        int quant = (int) Math.ceil(t / m);
        return String.format(Locale.US, "%d %.2f", quant, quant * c);

    }
}
