package fatec_ipi_paoo_sabado_observer_exercise;

public class Joao extends Pessoa {
	
	String a;

	@Override
	public void realizarAcao(Entregavel e) {
		System.out.printf("Joao recebeu: %s\n", e.conteudo);
	}
	
	public void setNewAssinatura(String a) {
		this.a = a;
	}
	
	public String getNewAssinatura() {
		return this.a;
	}

}

//fds