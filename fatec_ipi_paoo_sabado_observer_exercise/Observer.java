package fatec_ipi_paoo_sabado_observer_exercise;

public interface Observer {

	public void update(Entregavel e);
	
	public void setAssinatura (String a);
	
	public String getAssinatura ();
	
}
