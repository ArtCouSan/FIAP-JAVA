
public class TesteConta {

	public static void main(String[] args) {

		Conta conta1 = new Conta("Arthur", 123);
		Conta conta2 = new Conta("Danilo", 345);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		
		conta1.deposita(50);
		conta2.deposita(30);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		
		conta1.saque(10);
		conta2.saque(10);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		
	}

}
