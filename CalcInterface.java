import java.util.Scanner;

public class CalcInterface {
    private Scanner scanner;

    public CalcInterface() {
        scanner = new Scanner(System.in);
    }

    public double recebeOperando(int i) {
        System.out.print("Digite o operando " + i + ": ");
        return scanner.nextDouble();
    }

    public char recebeOperacao() {
        System.out.print("Digite a operação (+, -, *, / ou 's' para sair): ");
        return scanner.next().charAt(0);
    }

    public void mostraResultado(double res) {
        System.out.println("Resultado: " + res);
    }
}
