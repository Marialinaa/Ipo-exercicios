public class ContaBancaria {
    private static int qtdContas = 0;
    private String titular;
    private float saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
        qtdContas++;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public String getDadosConta() {
        return "Titular: " + titular + " | Saldo: R$" + String.format("%.2f", saldo);
    }

    public static int getQtdContas() {
        return qtdContas;
    }
}
