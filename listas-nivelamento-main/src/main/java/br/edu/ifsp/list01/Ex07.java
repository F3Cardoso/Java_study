package br.edu.ifsp.list01;

import java.util.Locale;

/*
    Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida.
    Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2.
    Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total
    com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada    	Saída
    100         75.00
    1.50
    1.25
    50
    Entrada    	Saída
    100 x         187.50
    1.50 v1
    1.25 v2
    150 a
*/
public class Ex07 {

    public static void main(String[] args) {
        //v1
        // >x  v2
        // a
    }

    double compute(double x, double v1, double v2, double a) {
        double output = -0.1;
        //put your logic here
        if (a <= x) return (v1*a);
        else return (v2 * a);

    }
}
