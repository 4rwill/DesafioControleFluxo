import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        if (parametroDois <= parametroUm) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } else {
            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int diferenca = parametroDois - parametroUm;

        if (diferenca <= 0) {
            throw new ParametrosInvalidosException("A diferença entre os parâmetros deve ser maior que zero.");
        }

        for (int contagem = 1; contagem <= diferenca; contagem++) {
            System.out.println("Imprimindo o número: " + contagem);
        }
    }
}
