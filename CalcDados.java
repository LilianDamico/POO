public class CalcDados {
    private double operando1;
    private double operando2;
    private char operacao;

    public void setOperando(int i, double valor) {
        if (i == 1)
            operando1 = valor;
        else if (i == 2)
            operando2 = valor;
    }

    public double getOperando(int i) {
        return (i == 1) ? operando1 : operando2;
    }

    public void setOperacao(char op) {
        operacao = op;
    }

    public char getOperacao() {
        return operacao;
    }
}
