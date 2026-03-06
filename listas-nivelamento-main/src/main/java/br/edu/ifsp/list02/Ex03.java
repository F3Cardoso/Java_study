package br.edu.ifsp.list02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class Ex03 {

    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }
    private String formatarVetor(List<Integer> lista) {
        StringBuilder sb = new StringBuilder();
        for (Integer n : lista) {
            sb.append(n).append(" ");
        }

        return sb.toString();
    }

    StringBuilder compute(int[] firstFive, int[] otherInts) {
        String output = null;
        int n = 5, i, j;
        StringBuilder resultado = new StringBuilder();
        List<Integer> atual = new ArrayList<>(10);
        if (firstFive == null || firstFive.length != 5) return new StringBuilder("Erro");

        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (firstFive[i] == firstFive[j]) return new StringBuilder("Erro");
            }
        }

        for (i = 0; i < n; i++) {
            atual.add(firstFive[i]);
        }
        resultado.append(formatarVetor(atual)).append("\n");
        for (i = 0; i < otherInts.length; i++) {
            if (atual.contains(otherInts[i])) {
                atual.remove(Integer.valueOf(otherInts[i]));

                resultado.append(formatarVetor(atual)).append("\n");
            } else {
                atual.add(otherInts[i]);

                resultado.append(formatarVetor(atual)).append("\n");
                if (atual.isEmpty() || atual.size() == 10) break;
            }



        }
        return resultado;
    }}

