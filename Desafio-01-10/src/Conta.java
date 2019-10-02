
public class Conta {

	private String titular;
	private double saldo;
	private int numero;

	public Conta(String titular, int numero) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double saque(double valor) {
		if (valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
			return valor;
		} else {
			return 0;
		}
	}

}
