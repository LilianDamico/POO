import java.util.ArrayList;
import java.util.List;

abstract class InstrumentoFinanceiro {
    protected float saldo;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public abstract float calcularSaldoTotal();
}

class Acao extends InstrumentoFinanceiro {
    private int cotas;

    public void setCotas(int cotas) {
        this.cotas = cotas;
    }

    @Override
    public float calcularSaldoTotal() {
        return cotas * saldo;
    }
}

class ContaCorrente extends InstrumentoFinanceiro {
    private float limite;

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public float calcularSaldoTotal() {
        return limite + saldo;
    }
}

class FundoDeAplicacao extends InstrumentoFinanceiro {
    private float rentabilidade;

    public void setRentabilidade(float rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    @Override
    public float calcularSaldoTotal() {
        return saldo + (saldo * rentabilidade);
    }
}

class Banco {
    private List<InstrumentoFinanceiro> instrumentos = new ArrayList<>();

    public void adicionarInstrumento(InstrumentoFinanceiro instrumento) {
        instrumentos.add(instrumento);
    }

    public float calcularSaldos() {
        float totalSaldo = 0;
        for (InstrumentoFinanceiro instrumento : instrumentos) {
            totalSaldo += instrumento.calcularSaldoTotal();
        }
        return totalSaldo;
    }

    public int getNumInstrumentos() {
        return instrumentos.size();
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Acao acao = new Acao();
        acao.setSaldo(100);
        acao.setCotas(10);
        banco.adicionarInstrumento(acao);

        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(500);
        cc.setLimite(1000);
        banco.adicionarInstrumento(cc);

        FundoDeAplicacao fundo = new FundoDeAplicacao();
        fundo.setSaldo(1000);
        fundo.setRentabilidade(0.05f);
        banco.adicionarInstrumento(fundo);

        System.out.println("Número de instrumentos: " + banco.getNumInstrumentos());
        System.out.println("Saldo total: " + banco.calcularSaldos());
    }
}

