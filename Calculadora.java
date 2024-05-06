import java.util.Scanner;

// Classe que representa a calculadora
class Calculadora {
    // Método para realizar a adição
    public static double adicao(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    // Método para realizar a subtração
    public static double subtracao(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    // Método para realizar a multiplicação
    public static double multiplicacao(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    // Método para realizar a divisão
    public static double divisao(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN; // Retorno NaN (Not a Number) em caso de divisão por zero
        } else {
            return numeroUm / numeroDois;
        }
    }

    // Método para calcular a potência
    public static double potencia(double numeroUm, double numeroDois) {
        return Math.pow(numeroUm, numeroDois);
    }

    // Método para calcular a raiz quadrada
    public static double raizQuadrada(double numeroUm) {
        if (numeroUm < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN; // Retorno NaN em caso de número negativo
        } else {
            return Math.sqrt(numeroUm);
        }
    }
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop principal para permitir múltiplas operações
        while (true) {
            // Solicitação dos números e da operação desejada
            System.out.println("\nDigite dois números:");
            double numeroUm = scanner.nextDouble();
            double numeroDois = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Potência (^)");
            System.out.println("6. Raiz Quadrada (√)");
            System.out.println("Q. Sair");

            char operacao = scanner.next().charAt(0);

            double resultado = 0;

            // Realiza a operação escolhida
            switch (operacao) {
                case '1':
                    resultado = Calculadora.adicao(numeroUm, numeroDois);
                    break;
                case '2':
                    resultado = Calculadora.subtracao(numeroUm, numeroDois);
                    break;
                case '3':
                    resultado = Calculadora.multiplicacao(numeroUm, numeroDois);
                    break;
                case '4':
                    resultado = Calculadora.divisao(numeroUm, numeroDois);
                    break;
                case '5':
                    resultado = Calculadora.potencia(numeroUm, numeroDois);
                    break;
                case '6':
                    resultado = Calculadora.raizQuadrada(numeroUm);
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0); // Encerra o programa
                default:
                    System.out.println("Opção inválida.");
                    continue; // Retorna ao início do loop
            }

            // Imprime o resultado
            if (!Double.isNaN(resultado)) {
                System.out.println("Resultado: " + resultado);
            }
        }
    }
}
