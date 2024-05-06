public class CalcControle {
    private CalcInterface calcInterface;
    private CalcDados calcDados;

    public CalcControle(CalcInterface calcInterface, CalcDados calcDados) {
        this.calcInterface = calcInterface;
        this.calcDados = calcDados;
    }

    public void executar() {
        while (true) {
            double opn1 = calcInterface.recebeOperando(1);
            double opn2 = calcInterface.recebeOperando(2);
            char operacao = calcInterface.recebeOperacao();

            if (operacao == 's') {
                System.out.println("Encerrando a calculadora...");
                System.exit(0);
            }

            calcDados.setOperando(1, opn1);
            calcDados.setOperando(2, opn2);
            calcDados.setOperacao(operacao);

            double resultado = opera(opn1, opn2, operacao);
            calcInterface.mostraResultado(resultado);
        }
    }

    private double opera(double opn1, double opn2, char op) {
        switch (op) {
            case '+':
                return opn1 + opn2;
            case '-':
                return opn1 - opn2;
            case '*':
                return opn1 * opn2;
            case '/':
                if (opn2 != 0)
                    return opn1 / opn2;
                else {
                    System.out.println("Erro: divisão por zero!");
                    return Double.NaN;
                }
            default:
                System.out.println("Operação inválida!");
                return Double.NaN;
        }
    }
}
