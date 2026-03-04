package br.edu.ifsp.list02;
import java.util.Arrays;
import java.util.List;
public class as {




    /*
        Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
        A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
        Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
        acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

        Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
     */
    public class Ex03 {
        public static void main(String[] args) {
            // Exemplo de chamada seguindo o padrão dos anteriores
            // int[] iniciais = {1, 2, 3, 4, 5};
            // int[] sequencia = {6, 7, 1, 8, 9, 10, 11};
            // Ex03 ex = new Ex03();
            // System.out.println(ex.compute(iniciais, sequencia));
        }

        String compute(int[] firstFive, int[] otherInts) {
            // Validação de domínio: deve ter exatamente 5 elementos
            if (firstFive == null || firstFive.length != 5) return "Erro";

            // Validação de duplicatas no conjunto inicial
            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {
                    if (firstFive[i] == firstFive[j]) return "Erro";
                }
            }

            int[] vetor = new int[10];
            int n = 5; // Quantidade atual de elementos
            StringBuilder output = new StringBuilder();

            // Inicializa o vetor com os 5 primeiros
            for (int i = 0; i < 5; i++) {
                vetor[i] = firstFive[i];
            }

            // Processa a sequência de outros números
            for (int num : otherInts) {
                int pos = -1;

                // Verifica se o número já existe no vetor
                for (int i = 0; i < n; i++) {
                    if (vetor[i] == num) {
                        pos = i;
                        break;
                    }
                }

                if (pos != -1) {
                    // Se existe: Remove e desloca os elementos para a esquerda
                    for (int i = pos; i < n - 1; i++) {
                        vetor[i] = vetor[i + 1];
                    }
                    n--;
                } else {
                    // Se não existe: Adiciona no final
                    vetor[n] = num;
                    n++;
                }

                // Monta a String do estado atual do vetor (estilo Ex09)
                for (int i = 0; i < n; i++) {
                    output.append(vetor[i]);
                    if (i < n - 1) output.append(" ");
                }
                output.append("\n");

                // Critério de parada: cheio (10) ou vazio (0)
                if (n == 0 || n == 10) {
                    break;
                }
            }

            return output.toString().trim();
        }
    }
}
