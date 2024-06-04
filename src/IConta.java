
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	void cadastrar(Cliente nome, int senha );
	
	void imprimirExtrato();
}
