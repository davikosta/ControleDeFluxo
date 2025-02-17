import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeFluxo{
    /// Atributos estáticos
    static int parametro1 = 0;
    static int parametro2 = 0;
    static boolean sucesso = false;
    /// Main
    public static void main(String[] args) throws ParametrosInvalidosException {
        var scanner = new Scanner(System.in);
        /// Laço de repetição para evitar o interrompimento da execução da aplicação em caso de entradas inválidas
        while (!sucesso) {
            try {
                entradaDeParametros();
                contar(parametro1, parametro2);
            }
            /// Tratamentos
            catch (InputMismatchException e) {
                System.out.println("Entrada inválida, insira apenas números!");
            }
            catch (ParametrosInvalidosException e) {
                System.out.println("O segundo número não pode ser maior que o primeiro!");
            }
        }
    }
    /// Métodos estáticos
    static void entradaDeParametros() throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Por favor, insira o primeiro parâmetro:");
        setParametro1(terminal.nextInt());

        System.out.println("Agora o segundo parâmetro:");
        setParametro2(terminal.nextInt());
        /// Verifica se o atributo parametro1 é maior, se for, uma exceção é lançada
        if (getParametro1() > getParametro2()) {
            throw new ParametrosInvalidosException();
        } else {
            /// Atribui o valor true para o atributo em caso de sucesso
            sucesso = !sucesso;
        }
    }

    static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException {
        /// Calcula o resultado da subtração entre os parâmetros 1 e 2
        int diferenca = parametro2 - parametro1;
        /// Imprime as ocorrências num laço for
        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i + "...");
        }
    }
    /// Métodos Getters e Setters
    public static int getParametro1() {
        return parametro1;
    }

    public static void setParametro1(int parametro) {
        parametro1 = parametro;
    }

    public static int getParametro2() {
        return parametro2;
    }

    public static void setParametro2(int parametro) {
        parametro2 = parametro;
    }
}
