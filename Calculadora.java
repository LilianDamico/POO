public class Calculadora {
    public static void main(String[] args) {
        CalcInterface calcInterface = new CalcInterface();
        CalcDados calcDados = new CalcDados();
        CalcControle calcControle = new CalcControle(calcInterface, calcDados);
        calcControle.executar();
    }
}
